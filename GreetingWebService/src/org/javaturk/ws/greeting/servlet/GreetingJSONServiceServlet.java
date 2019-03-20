package org.javaturk.ws.greeting.servlet;

import java.beans.XMLEncoder;
import java.io.IOException;
import java.io.OutputStream;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jsonGreet")
public class GreetingJSONServiceServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/json");
		String responseString = "Hello :)";
		OutputStream out = response.getOutputStream();
		JsonWriter writer = Json.createWriter(out);
		
		JsonObjectBuilder builder = Json.createObjectBuilder();
		builder.add("response", responseString);
		JsonObject responseObject = builder.build();
		writer.writeObject(responseObject);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		response.setContentType("text/json");
		String responseString = "Hello " + name + " :)";
		OutputStream out = response.getOutputStream();
		JsonWriter writer = Json.createWriter(out);
		
		JsonObjectBuilder builder = Json.createObjectBuilder();
		builder.add("response", responseString);
		JsonObject responseObject = builder.build();
		writer.writeObject(responseObject);
	}
}
