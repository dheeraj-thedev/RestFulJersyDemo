package com.javatpoint.rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import jdk.nashorn.internal.objects.annotations.Getter;

@Path("/hello")
public class Hello {

	
	// Akash this is working fine for XML 
	//we need to add a mapper that will explain this object to json ;
	
	
	@GET
	@Path("/test")
	@Produces(MediaType.APPLICATION_JSON)
	public String getStudentDetails(@QueryParam("name") String name, @QueryParam("collegeName") String collegeName) {
		System.out.println("Message Received");
		System.out.println(name + "fjdlkfd" + collegeName);
		Student student = new Student();
		student.setName(name);
		student.setCollegeName(collegeName);
		System.out.println(student);
		// return Response.status(Status.OK).entity(student).build();//student.getCollegeName();
		return student.getJSON();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayPlainTextHello() {
		return "Hello Jersey Plain";
	}

	// This method is called if XML is request
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayXMLHello() {
		return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";
	}

	// This method is called if HTML is request
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHtmlHello() {
		return "<html> " + "<title>" + "Hello Jersey" + "</title>" + "<body><h1>" + "Hello Jersey HTML" + "</h1></body>"
				+ "</html> ";
	}

}