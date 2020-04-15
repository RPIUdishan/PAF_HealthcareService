package model;

import java.sql.*;

/**
 * 
 * @author Ishanka
 * Payment Schemes class
 * All the crud operations are implemented in here
 *
 */
public class PaymentScheme {

	
	/**
	 * 
	 * @return connection of payments database
	 */
public Connection connect() {
		
		Connection conn = null;
		
		try {
			

			 Class.forName("com.mysql.jdbc.Driver"); 
			 
			 conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/payments", "root", "");
			 
			 if(conn == null) {
				 System.out.println("Error with connection of database");
			 }
			 else{
				 System.out.println("Successful connection of database");
			 }

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}	


		/**
		 * 
		 * @param doc_id
		 * @param hospital_id
		 * @param doc_charge
		 * @param hosp_charge
		 * @param tax
		 * @return
		 */
public String insertPaymentScheme( String doc_id, String hospital_id, String doc_charge, String hosp_charge, String tax) {
	
	String output = ""; //output 
	
	try {
		
		Connection conn = connect();
		
		if(conn == null) {return "Error while connecting to the database for inserting.";}
		
		String query = "insert into payment_schemes(id, doc_id, hospital_id, doc_charge, hosp_charge, tax)"
				+ "values(?, ?, ?, ?, ?, ?)";
		
		
		PreparedStatement preparedStatement = conn.prepareStatement(query);
		
		//value binding
		preparedStatement.setInt(1, 0);
		preparedStatement.setInt(2, Integer.parseInt(doc_id));
		preparedStatement.setInt(3, Integer.parseInt(hospital_id));
		preparedStatement.setDouble(4, Double.parseDouble(doc_charge));
		preparedStatement.setDouble(5, Double.parseDouble(hosp_charge));
		preparedStatement.setDouble(6, Double.parseDouble(tax));

		
		preparedStatement.execute();
		conn.close();
		
		output = "Inserted successfully"; 
	} catch (Exception e) {
	
		 output = "Error while inserting the Scheme.";
		 System.err.println(e.getMessage()); 
		 
	}
	
	
	return output;
	
}
}
