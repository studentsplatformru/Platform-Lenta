package ru.studentsplatform.newswire.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.studentsplatform.system.annotation.Profiled;
import ru.studentsplatform.system.rest.AbstractController;

@Profiled
@RestController
@RequestMapping(MainController.BASE_URL)
public class MainController implements AbstractController {
	public static final String BASE_URL = AbstractController.BASE_URL + "/main";

	@GetMapping
	public String main() {
		return "Hello world it is service Newswire";
	}
}
