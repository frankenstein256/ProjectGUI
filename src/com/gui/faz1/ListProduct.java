package com.gui.faz1;

import java.io.FileWriter;
import java.sql.ResultSet;
import java.sql.Statement;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
public class ListProduct extends ConnectDB {
	String print;
	
	public String list()
	{
		JSONArray array = new JSONArray();
		JSONObject jsonObject = new JSONObject();
			
		String sql = "select * from Products";
	
		try (
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql)){
			
			while(rs.next()) {
				JSONObject record = new JSONObject();
				
				 record.put("Id", rs.getInt("ID"));
				   record.put("Name", rs.getString("Name"));
				   record.put("Price", rs.getString("Price"));
				   record.put("Vat", rs.getInt("Vat"));
				   record.put("Barcode", rs.getString("Barcode"));
				   array.add(record);
		   
			}
			jsonObject.put("Products", array);
			FileWriter file = new FileWriter("sql//dbs.json");
	         file.write(jsonObject.toJSONString());
	         file.close();
	         for(Object o: array){
	        	    if ( o instanceof JSONObject ) {
	        	    	print +=  String.valueOf(((JSONObject)o))+"\n";
	        	    }
	        	}
		
		} catch (Exception e) {
			print = e.getMessage();
		}

		return print;
	}

}
