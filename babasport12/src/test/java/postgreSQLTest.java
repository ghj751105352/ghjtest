

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class postgreSQLTest {

	public static void main(String[] args) throws Exception {
		Class.forName("org.postgresql.Driver");
		Connection conn = null;
		conn = DriverManager.getConnection(
				   "jdbc:postgresql://10.133.12.132:5432/test_db","postgres", "postgres");
		System.out.println(conn);
		Statement stat = conn.createStatement();
		ResultSet rst = stat.executeQuery("select * from tab10");
		while (rst.next()){
		    System.out.println(rst.getInt("id")+" "+rst.getString("name"));
		   }
		conn.close();
	}

}
