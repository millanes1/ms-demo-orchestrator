package com.example.rest;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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
		employeeList=new ArrayList<Employee>();
	}

	private int userId;

	private int id;

	private String title;

	private boolean completed;

	private List<Employee> employeeList;

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

	public boolean add(Employee employee) {
		return getEmployeeList().add(employee);
	}

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
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
				", employeeList=" + employeeList +
				'}';
	}
}