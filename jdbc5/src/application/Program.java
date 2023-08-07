package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;
import db.DBIntegreteExcpetion;

public class Program {

	public static void main(String[] args) {
		
		//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Connection conn = null;
		PreparedStatement st = null;
		
		
		try {
			conn = DB.getConnection();
			
			st = conn.prepareStatement(
					"Delete from department where id=?"
					);
			st.setInt(1, 2);
			
			int rowsAffected = st.executeUpdate();
			System.out.println("foi afetadas: " + rowsAffected);
		} catch (SQLException e) {
			throw new DBIntegreteExcpetion(e.getMessage());
		}
		finally {
			DB.closeStatment(st);
			DB.closeConnection();
		}
		
	
	}
}