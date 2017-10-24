package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnectionUtility {

	public Connection getConnection() {

		Properties dbprop = new Properties();

		try {

			dbprop.load(new FileInputStream(
					"/Users/jhy409/Documents/workspace/EPTrial1/src/main/resources/resources/database.properties"));
			

			Class.forName("org.postgresql.Driver");

			return DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres?currentSchema=reimbursement",
					"postgres", "Welcome9");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}

	catch(

	FileNotFoundException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}catch(
	IOException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	catch(
	SQLException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	};return null;

}

}
