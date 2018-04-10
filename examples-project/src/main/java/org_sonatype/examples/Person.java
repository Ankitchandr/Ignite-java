package org_sonatype.examples;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.ignite.IgniteException;

public class Person {
	
	
	public static void main(String[] args) throws IgniteException, ClassNotFoundException, SQLException {
	  // Register JDBC driver.
	    Class.forName("org.apache.ignite.IgniteJdbcDriver");
	     
	    // Open JDBC connection (cache name is empty, which means that we use default cache).
	    Connection conn = DriverManager.getConnection("jdbc:ignite://localhost:11211/");
	     
	    // Query names of all people.
	    ResultSet rs = conn.createStatement().executeQuery("select name from Person");
	     
	    while (rs.next()) {
	        String name1 = rs.getString(1);
	       System.out.println(name1);
	    }
	     
	  
}
}