package ru.studentsplatform.entities.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Базовый класс, от которого наследуются все сущности.
 *
 * @author Krylov Sergey (28.07.2020)
 */
@MappedSuperclass
public class BaseEntity {

	/**
	 * Поле id.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
