package ru.studentsplatform.service.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Krylov Sergey (28.07.2020)
 */
@Component
@ConfigurationProperties("newswire")
public class ConfigurationMessage {
	private String title;
	private String text;



	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
