package Model;

import java.util.ArrayList;
import java.util.List;

import ConnectionProvider.SqlConnectionProvider;

import java.sql.DriverManager;
import java.sql.*;

// model 
public class myModelStudentDetailsDbUtil {
	
	public static List<Students> getStudents() throws ClassNotFoundException, SQLException {
		// students List
		ArrayList<Students> student = new ArrayList<>();
		
		// create connection with mysql;
		Connection con = SqlConnectionProvider.getcon();
		Statement st = con.createStatement();
		
		// execute the statement and loop over the result set;
		ResultSet rs = st.executeQuery("select * from students_infromation");
		
		while(rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			float salary = rs.getFloat(3);
			System.out.print(id);
			
			// pass data to Student pujo class by making Student Obj
			
			Students s = new Students(id, name, salary);
			student.add(s);
			
		}
		
		return student; 
	}
}
