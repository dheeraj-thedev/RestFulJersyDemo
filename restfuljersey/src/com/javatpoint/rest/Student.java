package com.javatpoint.rest;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "student")
public class Student {
	private String name;
	private String collegeName;

	@XmlElement
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement
	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getJSON() {
		return "{" + "name:" + this.getName() + ",\ncollegeName:" + this.getCollegeName() + "" + "}";
	}
}
