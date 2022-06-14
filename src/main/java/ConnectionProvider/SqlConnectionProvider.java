package ConnectionProvider;
import java.sql.DriverManager;
import com.mysql.jdbc.Connection;

public class SqlConnectionProvider {
	public static Connection getcon() {
		try {
			String db_url = "jdbc:mysql://localhost:3306/mvc" ; 
			String db_user = "root";
			String db_password ="" ;
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection(db_url, db_user, db_password) ; 
			return con ; 
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
}