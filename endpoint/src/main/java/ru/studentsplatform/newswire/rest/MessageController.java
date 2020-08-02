package ru.studentsplatform.newswire.rest;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.studentsplatform.entities.model.pojo.Message;
import ru.studentsplatform.service.config.ConfigurationMessage;
import ru.studentsplatform.system.annotation.Profiled;
import ru.studentsplatform.system.rest.AbstractController;

/**
 * @author Krylov Sergey (28.07.2020)
 */
@Profiled
@RestController
@RequestMapping(MessageController.BASE_URL)
public class MessageController implements AbstractController {
	public static final String BASE_URL = AbstractController.BASE_URL + "/message";

	@Autowired
	private Environment environment;

	@Autowired
	private ConfigurationMessage configurationMessage;

	@GetMapping("/create/{title}/{text}")
	@HystrixCommand(fallbackMethod = "fallbackCreateMessageMethod")
	public Message createMessage(@PathVariable String title, @PathVariable String text)  {
		if (true) {
			throw new RuntimeException("Unexpected");
		} else {
			var titleConfig = configurationMessage.getTitle();
			var textConfig = configurationMessage.getText();
			var port = new Integer(environment.getProperty("local.server.port"));
			return new Message(titleConfig + " " + title, textConfig + " " + text, port);
		}
	}

	public Message fallbackCreateMessageMethod(String title, String text) {
		return new Message("Заглушка Title", "Заглушка текста", new Integer(environment.getProperty("local.server.port")));
	}

	@GetMapping("/fault-tolerance-example")
	@HystrixCommand(fallbackMethod="fallbackRetrieveConfigurations")
	public String retrieveConfigurations()
	{
		throw new RuntimeException("Not Available");
	}

	public String fallbackRetrieveConfigurations()
	{
		return "Заглушка";
	}
}
