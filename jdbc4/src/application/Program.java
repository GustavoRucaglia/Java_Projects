package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Program {

	public static void main(String[] args) {
		
		//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Connection conn = null;
		PreparedStatement st = null;
		
		
		try {
			conn = DB.getConnection();
			
			st = conn.prepareStatement(
					"UPDATE seller set BaseSalary = BaseSalary + ? " +
					"where " + "(DepartmentId = ?)"
					);
			
			st.setDouble(1, 200.0);
			st.setInt(2, 1);
			
			int rowsAffected = st.executeUpdate();
			System.out.println("foi afetadas: " + rowsAffected);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			DB.closeStatment(st);
			DB.closeConnection();
		}
		
	
	}
}