package ru.studentsplatform.entities.model.pojo;

import ru.studentsplatform.entities.model.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Krylov Sergey (28.07.2020)
 */
@Entity
@Table(name = "message")
public class Message extends BaseEntity {
	private String title;
	private String text;
	private int port;

	protected Message() {
	}

	public Message(String title, String text, int port) {
		this.title = title;
		this.text = text;
		this.port = port;
	}

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

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
}
