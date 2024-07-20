package LearnJDBC;
import java.sql.*;


public class DemoClass {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url = "jdbc:mysql://localhost:3306/xyz"; // table details
		String username = "root"; // MySQL credentials
		String password = "Kit***kat1";
		String query = "insert into employee values(?, ?, ?, ?, ?, ?)";
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			
			System.out.println("Connection Established successfully");
			
			PreparedStatement st = con.prepareStatement(query);
			//ResultSet rs = st.executeQuery(query); // Execute query
			
			
			int count = st.executeUpdate();
		    System.out.println(count);
//			while(rs.next()){
//				String userData = rs.getInt(1) + ":" + rs.getString(2)
//				+ "- age:" + rs.getInt(3) + " department:" 
//				+ rs.getString(4) + " city:" + rs.getString(5) 
//				+ " salary:" + rs.getInt(3);// Retrieve name from db
//				
//			    System.out.println(userData); // Print result on console
//			  };
		    
			
	        st.close(); // close statement
	        con.close(); // close connection
	        System.out.println("Connection Closed....");
			
	        
}

}
