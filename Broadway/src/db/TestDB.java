package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDB {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. register driver(mysql driver)
		Class.forName("com.mysql.jdbc.Driver");

		// 2. get connection(url, username, password);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/broadway", "root", "");

		// ===========insert sql==============
//		String sql = "insert into user(username, password)values('admin', 'admin')";
//
//		Statement stm = con.createStatement();
//		stm.execute(sql);
//		con.close();
//
//		System.out.println("Added successfully");

		// ============= select sql ===========
//		String selectSql = "select * from user";
//
//		Statement stm = con.createStatement();
//		ResultSet rs = stm.executeQuery(selectSql);
//
//		while (rs.next()) {
//			System.out.println("Id: " + rs.getString("id") + " Username: " + rs.getString("username") + " password: "
//					+ rs.getString("password"));
//		}

		// delete sql ====================
//		String sql = "delete from user where id = 1";
//		Statement st = con.createStatement();
//		st.execute(sql);
//
//		System.out.println("User deleted");

		String sql = "update user set password = 'password' where id = 2";
		Statement st = con.createStatement();
		st.execute(sql);

		System.out.println("Updated successfully");

	}
}
