package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;

public class Program {

	public static void main(String[] args) {
		
		//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Connection conn = null;
		Statement st = null;
		
		
		try {
			conn = DB.getConnection();
			
			conn.setAutoCommit(false);
			
			st = conn.createStatement();
			
			int rows1 = st.executeUpdate("Update seller set baseSary = 2090 where = 1");
			int x =1;
			if(x < 2) {
				throw new SQLException("fake");
			}
			
			int rows2 = st.executeUpdate("Update seller set baseSary = 3090 where = 2");
			
			conn.commit();
			
			System.out.println(rows1);
			System.out.println(rows2);
		} catch (SQLException e) {
			try {
				conn.rollback();
				throw new DbException(e.getMessage());
			} catch (SQLException e1) {
				throw new DbException(e.getMessage());			}
		}
		finally {
			DB.closeStatment(st);
			DB.closeConnection();
		}
		
	
	}
}