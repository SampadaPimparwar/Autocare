package com.hc.lds;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class DataStructure {

	 public static void main(String[] args) throws Exception {
		
		 Server server = new Server(1999);
		 WebAppContext webAppContext = new WebAppContext();
		 webAppContext.setResourceBase("src/main/webApp");
		 webAppContext.setContextPath("/");
		 server.setHandler(webAppContext);
		 server.start();
		 server.join();
		 
	 }
}
