package com.gui.faz1;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class CreateDB {
	  public CreateDB(String fileName) {
	String url = "jdbc:sqlite:" + fileName;

	try (Connection conn = DriverManager.getConnection(url)) {
        if (conn != null) {
            DatabaseMetaData meta = conn.getMetaData();
            System.out.println("The driver name is " + meta.getDriverName());
            System.out.println("A new database has been created.");
        }

    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
	   
    String sql = "CREATE TABLE Products " +
                 "(Id INTEGER not NULL, " +
                 " Name TEXT, " + 
                 " Price REAL, " + 
                 " Vat INTEGER, " + 
                 "Barcode TEXT)"; 
	 	
     try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {
         // create a new table
         stmt.execute(sql);
     }
     catch (SQLException e) {
			JOptionPane.showMessageDialog(null,e.getMessage());

     
	  }
}}
