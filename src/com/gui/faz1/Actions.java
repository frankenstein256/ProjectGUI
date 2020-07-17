package com.gui.faz1;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;


public class Actions implements ActionListener {
	private GUI a ;
	InsertProduct insertproduct=null;
	CharacterControlers controls=null;
	ListProduct listproduct= null;
	UpdateProduct updateproduct=null;
	    
	  

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
		updateproduct=new UpdateProduct();
	
	if (e.getSource() == getA().getSend())
	{
		if(controls.charactercontrols(getA().getTNumbe().getText(), getA().getTName().getText(),getA().getTPrice().getText(),getA().getVatCombo().getSelectedItem().toString(), getA().getTBarcode().getText()) == true)
		{
		 if(insertproduct.check(getA().getTNumbe().getText())==false)
		{
		getA().getTPrice().setText(String.format("%.2f",Double.parseDouble(getA().getTPrice().getText())));
		insertproduct.insert(Integer.parseInt(getA().getTNumbe().getText()), getA().getTName().getText(),Double.parseDouble(getA().getTPrice().getText()), Integer.parseInt(getA().getVatCombo().getSelectedItem().toString()), getA().getTBarcode().getText());	
			
		}
		else {
			JOptionPane.showMessageDialog(null, "Aynı ürün numarası veritabanımızda kayıtlı farklı bir numara giriniz ");
		}
		}
	
	
	}
	if (e.getSource() == getA().getSearch())
	{
		updateproduct.search(getA());
		getA().getArea().setVisible(true);
		getA().getArea().setText(updateproduct.print);;
		
	}
	if (e.getSource() == getA().getUpdate())
	{
		
		controls = new CharacterControlers();

	if(controls.charactercontrols(getA().getUptTNumbe().getText(), getA().getUptTName().getText(),getA().getUptTPrice().getText(), getA().getUptVatCombo().getSelectedItem().toString(), getA().getUptTBarcode().getText()) == true)
		{
		if( insertproduct.check(getA().getUptTNumbe().getText()) == true)
		 {
			JOptionPane.showMessageDialog(null, "Aynı ürün numarası veritabanımızda kayıtlı farklı bir numara giriniz ");

		 }
		else if(getA().getArea().getLineCount()>1)
		{
			JOptionPane.showMessageDialog(null, "Aynı ürün adına sahip ürünler için aynı id leri girimezsiniz.\n arama barına değiştirmek istediğiniz id'yi giriniz");

		}
		else {
		updateproduct.Update(getA());
		getA().getArea().setVisible(true);
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
