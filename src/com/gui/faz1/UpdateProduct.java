package com.gui.faz1;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class UpdateProduct extends  ConnectDB{

	private String check="null";
	String print="Aradığınız ürün verisi veri tabanımızda kayıtlı değil";
	InsertProduct controlid=null;
	int producconut;
	String empty;
	 public void  search(GUI getA){
		 check="null";
		try
		{
			Integer.parseInt(getA.getUptTSerachBar().getText());
			getA.getUptTNumbe().setVisible(false);
			getA.getUptTName().setVisible(true);
			getA.getUptLNumbe().setVisible(false);
			getA.getUptLName().setVisible(true);
		
			String sql = "select * from Products where Id = "+Integer.parseInt(getA.getUptTSerachBar().getText());
		
			try (
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery(sql)){
				print="";
				while(rs.next()) {
					print += rs.getInt("Id") + "   " +
							rs.getString("Name") + "   " +		
							rs.getString("Barcode") + "   " ;
					producconut++;
							
				}
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "lütfen doğru aranan bir ürün adı veya id si giriniz ");

			}
			check="true";
				
		}
		catch(Exception e)
		{
			getA.getUptTNumbe().setVisible(true);
			getA.getUptTName().setVisible(false);
			getA.getUptLNumbe().setVisible(true);
			getA.getUptLName().setVisible(false);
			producconut=0;
			String sql = "select * from Products where Name = '"+getA.getUptTSerachBar().getText()+"'";

			try (
					Statement st = conn.createStatement();
					ResultSet rs = st.executeQuery(sql)){
				print="";
					while(rs.next()) {
						producconut++;
						print += rs.getInt("Id") + "   " +
								rs.getString("Name") + "   " +		
								rs.getString("Price") + "   " +
								rs.getString("Vat") + "   " +
								rs.getString("Barcode") + "   \n";
						
						
								
					}
					
				} catch (Exception K) {
					JOptionPane.showMessageDialog(null, "lütfen doğru aranan bir ürün adı veya id si giriniz \n daha sonra güncelleme yapınız ");

				}

			
			
			check="false";
		}
	 
	 }
	 
	 public void Update(GUI getA)
	 {
	if(getA.getUptTSerachBar().getText().equals(""))
		
		 if(check.equals("false"))
			{		
	        String sql = "UPDATE Products SET Id = ? , "
	                + "Price = ? , "
	                + "Vat = ? , " 
	                + "Barcode = ? "
	                + "WHERE Name = ?";

	        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
	            pstmt.setInt(1, Integer.parseInt(getA.getUptTNumbe().getText()));
	            pstmt.setDouble(2, Double.parseDouble(getA.getUptTPrice().getText()));
	            pstmt.setInt(3, Integer.parseInt(getA.getUptVatCombo().getSelectedItem().toString()));
	            pstmt.setString(4, getA.getUptTBarcode().getText());
	            pstmt.setString(5, getA.getUptTSerachBar().getText());
	            pstmt.executeUpdate();
	        } catch (SQLException e) {
				JOptionPane.showMessageDialog(null, "bu ürün veri tabanımızda bulunmamamaktadır doğru bir ürünü arama barına giriniz ");

	        }
			}
			else if(check.equals("true"))
			{		
		        String sql = "UPDATE Products SET Name = ? , "
		                + "Price = ? , "
		                + "Vat = ? , "
		                + "Barcode = ? "
		                + "WHERE Id = ?";

		        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
		            pstmt.setString(1, getA.getLName().getText());
		            pstmt.setDouble(2, Double.parseDouble(getA.getUptTPrice().getText()));
		            pstmt.setInt(3, Integer.parseInt(getA.getUptVatCombo().getSelectedItem().toString()));
		            pstmt.setString(4, getA.getUptLBarcode().getText());
		            pstmt.setInt(5, Integer.parseInt(getA.getUptTSerachBar().getText()));
		            pstmt.executeUpdate();
		        } catch (SQLException e) 
		        {
					JOptionPane.showMessageDialog(null, "bu ürün veri tabanımızda bulunmamamaktadır doğru bir ürünü arama barına giriniz ");
		        }
				}
		
	 }
	 


}
