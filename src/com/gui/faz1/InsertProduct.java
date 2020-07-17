package com.gui.faz1;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class InsertProduct extends  ConnectDB {
	
	
	
	String print;
	boolean check=false;
	
	public boolean check(String PNumber)
	{
		String sql = "select * from Products";
		
		try (
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql)){
			
			while(rs.next()) {
				if(Integer.parseInt(PNumber)==rs.getInt("Id"))
				{
				check =true;	
				}
						
			}
			
		} catch (Exception e) {
			print = e.getMessage();
		}

		return check;
	}
	
		public void insert(int PNumber, String PName , Double PPrice, int PVat, String PBarcode )
		{
				
			String sql = "INSERT INTO Products(Id,Name,Price,Vat,Barcode) VALUES(?,?,?,?,?)";
			
			try (
				PreparedStatement pstmt = conn.prepareStatement(sql)){
				pstmt.setInt(1,PNumber);
				pstmt.setString(2,PName);
				pstmt.setDouble(3,PPrice);
				pstmt.setInt(4,PVat);
				pstmt.setString(5,PBarcode);
				 pstmt.execute();
				
			} catch (Exception e) {
				print = e.getMessage();
				JOptionPane.showMessageDialog(null, print);
				
			}

		
		}
			
}


	



