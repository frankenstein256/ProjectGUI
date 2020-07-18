package com.gui.faz1;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.swing.JOptionPane;


public class Actions implements ActionListener {
	private GUI a ;

	InsertProduct insertproduct=null;
	CharacterControlers controls=null;
	ListProduct listproduct= null;
	UpdateProduct updateproduct=new UpdateProduct();
	    
	  

	    public Actions(GUI pt) {
	    	
	        this.a = pt;
	       
	        
	    }

	    public GUI getA() {
	        return a;
	    }

	    public void setA(GUI a) {
	        this.a = a;
	    }

	@Override
	public void actionPerformed(ActionEvent e) {
		
		insertproduct= new InsertProduct();
		controls = new CharacterControlers();
		
	
	if (e.getSource() == getA().getSend())
	{
		
		if(	controls.charactercontrol(getA(), "insert")==true)
		{
		 if(insertproduct.check(getA().getTNumbe().getText())==false)
		{
		getA().getTPrice().setText(String.format("%.2f",Double.parseDouble(getA().getTPrice().getText())));
		insertproduct.insert(Integer.parseInt(getA().getTNumbe().getText()), getA().getTName().getText(),Double.parseDouble(getA().getTPrice().getText()), Integer.parseInt(getA().getVatCombo().getSelectedItem().toString()), getA().getTBarcode().getText());	
			
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Aynı ürün numarası veritabanımızda kayıtlı farklı bir numara giriniz ");
		}
		}
	}
	if (e.getSource() == getA().getSearch())
	{
		updateproduct.search(getA());
		getA().getArea().setVisible(true);
		getA().getArea().setText(updateproduct.print);;
		getA().getCenterPanel().setVisible(true);
		
	}
	if (e.getSource() == getA().getUpdate())
	{
		
		controls = new CharacterControlers();
		
	if(controls.charactercontrol(getA(), "update")==true)
		{
		
		if( insertproduct.check(getA().getUptTNumbe().getText()) == true)
		 {
			JOptionPane.showMessageDialog(null, "Aynı ürün numarası veritabanımızda kayıtlı farklı bir numara giriniz ");

		 }
		else if(getA().getArea().getLineCount()>2)
		{
			JOptionPane.showMessageDialog(null, "Aynı ürün adına sahip ürünler için aynı id leri girimezsiniz.\n arama barına değiştirmek istediğiniz id'yi giriniz");

		}
		else {
			getA().getUptTPrice().setText(String.format("%.2f",Double.parseDouble(getA().getUptTPrice().getText())));
		updateproduct.Update(getA());
		getA().getArea().setVisible(false);
		}
		}
		
	}
	if (e.getSource() == getA().getReports())
	{
		listproduct= new ListProduct();
		getA().getReportarea().setText(listproduct.list());
		
	}
	}

}
