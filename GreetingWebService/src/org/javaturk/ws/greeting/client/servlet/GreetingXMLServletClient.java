package org.javaturk.ws.greeting.client.servlet;

import java.io.*;
import java.net.*;

public class GreetingXMLServletClient {

	public static void main(String[] args) {
		try {

			URL url = new URL("http://localhost:8080/GreetingWebService/xmlGreet");
			URLConnection conn = url.openConnection();
			conn.setDoOutput(true);

			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()));
			out.write("name=Akin");
			out.flush();
			out.close();
			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));

			String response;
			while ((response = in.readLine()) != null) {
				System.out.println(response);
			}
			in.close();
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
