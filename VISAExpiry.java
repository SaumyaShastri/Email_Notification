//schedule the running of this task at 8 am daily on the desktop
//sheet name taken as EMP$ with columns EmployeeName, VisaNumber, PPNumber, VisaExpiry
import java.sql.*;
import java.util.Date;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class VISAExpiry {

public static void Notify(name,visa_num,pp_num)
{// notifiaction program; pass variables like mail.send(c)
	try {
		  //Working correctly 
		  

		  Email email = new SimpleEmail();
		  email.setHostName("smtp.googlemail.com");
		  email.setSmtpPort(465);
		  email.setAuthenticator(new DefaultAuthenticator("please put your GMAIL User Name", "password"));
		  email.setSSLOnConnect(true);
		  email.setFrom("saumyashastri@gmail.com"); // Whoever sends the mail
		  email.setSubject("URGENT: Visa Expiry Notification.");
		  email.setMsg(" Visa ['"+visa_num+"'] expiring on '"+today_date+7+"' with for '"+name+"', carrying passport numbered '"+pp_num+"'");
		  email.addTo("CSCQatar@csc.com");
		  System.out.println("sending email....");
		  email.send();
}
 catch (EmailException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public static void NotifyRenewal(name,visa_num,pp_num)
{// notifiaction program; pass variables like mail.send(c)
	try {
		  //Working correctly 
		  

		  Email email = new SimpleEmail();
		  email.setHostName("smtp.googlemail.com");
		  email.setSmtpPort(465);
		  email.setAuthenticator(new DefaultAuthenticator("please put your GMAIL User Name", "password"));
		  email.setSSLOnConnect(true);
		  email.setFrom("saumyashastri@gmail.com"); // Whoever sends the mail
		  email.setSubject("URGENT: Visa Renewal Notification.");
		  email.setMsg(" Visa ['"+visa_num+"'] due for renewal on '"+today_date+67+"' with for '"+name+"', carrying passport numbered '"+pp_num+"'");
		  email.addTo("CSCQatar@csc.com");
		  System.out.println("sending email....");
		  email.send();
}
 catch (EmailException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
 
    public static void main(String[] args) { 
    	try { 
    		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:[B]worcester[/B]"); //path for the ODBC Driver
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select * from [EMP$] where VisaExpiry=cast(getdate()+67)");
            String visa_date = rs.getString(VisaExpiry);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
            LocalDate visa_date = LocalDate.parse(visa_date, formatter);
            Date today_date;
            while (rs.next())
            { if(visa_date.compareTo(today_date) = 7)
            	{// query for  where visa_date, set variables for date and name to pass through the notify function
            		Statement stmt = con.createStatement();
                    ResultSet rst = stmt.executeQuery("Select * from [EMP$] where VisaExpiry=cast(getdate()+7)");
                    String name = rst.getString(EmployeeName);
                    String visa_num = rst.getString(VisaNumber);
                    String pp_num = rst.getString(PPNumber)
            		VISAExpiry call_sendemail = new VISAExpiry();
                call_sendmail.Notify(name,visa_num,pp_num); }
                } 
                else if (visa_date.compareTo(today_date) = 67)
            	{// query for  where visa_date, set variables for date and name to pass through the notify function
            		Statement stmt = con.createStatement();
                    ResultSet rst = stmt.executeQuery("Select * from [EMP$] where VisaExpiry=cast(getdate()+67)");
                    String name = rst.getString(EmployeeName);
                    String visa_num = rst.getString(VisaNumber);
                    String pp_num = rst.getString(PPNumber)
            		VISAExpiry call_sendemail2 = new VISAExpiry();
                call_sendmail2.NotifyRenewal(name,visa_num,pp_num); }
                } )
               
           }
   }
}
 
  /* The information is incomplete, assuming we have Visa Issue date.

public static void main(String[] args) { 
    	try { 
    		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:[B]worcester[/B]"); //path for the ODBC Driver
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select VISAIssue from [EMP$]");
            String visa_idate = rs.getString(VisaIssue);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
            LocalDate visa_date = LocalDate.parse(visa_date, formatter);
            Date today_date;
            while (rs.next())
            { if(visa_idate.compareTo(today_date) = 83)
            	{// query for  where visa_date, set variables for date and name to pass through the notify function
            		Statement stmt = con.createStatement();
                    ResultSet rst = stmt.executeQuery("Select * from [EMP$] where VisaIssue=cast(getdate()-83)");
                    String name = rst.getString(EmployeeName);
                    String visa_num = rst.getString(VisaNumber);
                    String pp_num = rst.getString(PPNumber)
            		VISAExpiry call_sendemail = new VISAExpiry();
                call_sendmail.Notify(name,visa_num,pp_num); }
                } 
                else if (visa_date.compareTo(today_date) = 23)
            	{// query for  where visa_date, set variables for date and name to pass through the notify function
            		Statement stmt = con.createStatement();
                    ResultSet rst = stmt.executeQuery("Select * from [EMP$] where VisaIssue=cast(getdate()-23)");
                    String name = rst.getString(EmployeeName);
                    String visa_num = rst.getString(VisaNumber);
                    String pp_num = rst.getString(PPNumber)
            		VISAExpiry call_sendemail2 = new VISAExpiry();
                call_sendmail2.NotifyRenewal(name,visa_num,pp_num); }
                } )
               
           }
   }

  



  */      
            