package com.csc.email;




import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

/**
 * 
 */

/**
 * @author pvyas
 *
 */
public class TestEmail {
public static void main(String[] args) {
		  
	  try {
		
		  
		  
		  //Working correctly 
		  

		  Email email = new SimpleEmail();
		  email.setHostName("smtp.googlemail.com");
		  email.setSmtpPort(465);
		  email.setAuthenticator(new DefaultAuthenticator("please put your GMAIL User Name", "password"));
		  email.setSSLOnConnect(true);
		  email.setFrom("saumyashastri@gmail.com");
		  email.setSubject("TestMail");
		  email.setMsg("This is a test mail ... :-)");
		  email.addTo("pvyas@csc.com");
		  System.out.println("sending email....");
		  email.send();

		  
		  
		  
	} catch (EmailException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
}
}
