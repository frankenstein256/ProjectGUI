package com.gui.faz1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public  class ConnectDB {
	GUI a;
	 String url = "jdbc:sqlite:"+a.vtPath;
     Connection conn=null;
     boolean vtcheck=false;
      String messages;
	public ConnectDB() {
   	try
	{
		conn = DriverManager.getConnection(url);
		vtcheck = true;
	}
	catch(Exception e)
	{
		vtcheck = false;
		messages=e.getMessage();
		JOptionPane.showMessageDialog(null, messages);
		

	}
	
	}
	
	

 

    


}
