package com.aptech;
import javax.servlet.*;//from servelts-api.jar file
import javax.servlet.http.*;//from servelts-api.jar file
import java.io.*;//from jdk

//every servlet should be a public class and
  //should be subclass to HttoServlet
  //from HttpServlet several methods are inheriting to HelloServlet
public class HelloServlet extends HttpServlet 
{
	//we need to override service method
	public void service(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException
	{
		//we need PrintWriter to write something to the browser
		PrintWriter out = response.getWriter();
		out.println("Hello from HelloServlet!");
	}
}
