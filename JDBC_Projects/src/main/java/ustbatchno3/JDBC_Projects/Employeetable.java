package ustbatchno3.JDBC_Projects;

		import java.sql.*;

		public class Employeetable {
		  public static void main(String[] args) {
		    // Set up database connection parameters
		    String url = "jdbc:mysql://localhost:3306/sona";
		    String username = "root";
		    String password = "pass@word1";

		    try {
		      // Create a connection to the database
		      Connection conn = DriverManager.getConnection(url, username, password);

		      // Create a statement object
		      Statement stmt = conn.createStatement();

		      // Execute the CREATE TABLE statement
		      String sql = "CREATE TABLE emply ("
		                 + "id INT NOT NULL AUTO_INCREMENT,"
		                 + "name VARCHAR(255),"
		                 + "age INT,"
		                 + "department VARCHAR(255),"
		                 + "PRIMARY KEY (id)"
		                 + ")";
		      
		      String sql1 = "INSERT INTO emply(id,name,age,department) VALUES (?,?,?,?)";
		      PreparedStatement stmt1 = conn.prepareStatement(sql1);
		      stmt1.setInt(1, 1);// set first parameter value 
      	      stmt1.setString(2, "sona"); // set second parameter value 
		      stmt1.setInt(3, 22); // set third parameter value 
		      stmt1.setString(2, "sona");
		      stmt1.executeUpdate(); // execute the statemen
		      stmt1.executeUpdate(sql1);

		      // Close the statement and connection objects
		     
		      
		      conn.close();
		      
		      
		    } catch (SQLException e) {
		      e.printStackTrace();
		    }
		  }
		


	}


