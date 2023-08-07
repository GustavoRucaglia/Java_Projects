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
		
		conn = DB.getConnection();
		
		try {
			/*
			st = conn.prepareStatement(
					"insert into seller "+
					"(Name, Email, BirthDate, BaseSalary, DepartmentID) values (?,?,?,?,?)",
					Statement.RETURN_GENERATED_KEYS
					);
			
			 st.setString(1,"Carl");
			 st.setString(2,"Carl@gmail");
			 st.setDate(3, new java.sql.Date(sdf.parse("22/04/1985").getTime()));
			 st.setDouble(4, 3000.00);
			 st.setInt(5, 4);
			 */
			
		st = conn.prepareStatement("insert into department(Name) values ('D1'),('d2')", Statement.RETURN_GENERATED_KEYS);
			 int rowsAffected = st.executeUpdate();
			 
			if(rowsAffected > 0) {
				 ResultSet rs = st.getGeneratedKeys();
				 while(rs.next()) {
					 int id = rs.getInt(1);
					 System.out.println("Done! id = " + id);
				 }
			}else {
				System.out.println("No rown affected!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DB.closeStatment(st);
			DB.closeConnection();
		}
	}
}