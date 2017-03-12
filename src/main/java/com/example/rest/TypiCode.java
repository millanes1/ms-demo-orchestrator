package com.example.rest;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gabo
 *
 */

@XmlRootElement
public class TypiCode implements Serializable {
	private static final long serialVersionUID = 1L;

	public TypiCode() {
	}

	private int userId;

	private int id;

	private String title;

	private boolean completed;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;

	}

	public boolean getCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	@Override
	public String toString() {
		return "TypiCode{" +
				"userId=" + userId +
				", id=" + id +
				", title='" + title + '\'' +
				", completed=" + completed +
				'}';
	}
}