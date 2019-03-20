package org.javaturk.ws.greeting.servlet;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/xmlGreet")
public class GreetingXMLServiceServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/xml");
		String responseString = "Hello :)";
		OutputStream out = response.getOutputStream();
		XMLEncoder encoder = new XMLEncoder(out);
		encoder.writeObject(responseString);
		encoder.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		response.setContentType("text/xml");
		String responseString = "Hello " + name + " :)";
		OutputStream out = response.getOutputStream();
		XMLEncoder encoder = new XMLEncoder(out);
		encoder.writeObject(responseString);
		encoder.close();
	}
}