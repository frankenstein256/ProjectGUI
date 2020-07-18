package com.gui.faz1;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class CharacterControlers extends PlainDocument{
    private int maxChars;
    private int count=0;
    private boolean check =false;
	public int getMaxChars() {
		return maxChars;
	}
	public void setMaxChars(int maxChars) {
		this.maxChars = maxChars;
	}
	@Override
    public void insertString(int offs, String str, AttributeSet a)
            throws BadLocationException {
        // the length of string that will be created is getLength() + str.length()
        if(str != null && (getLength() + str.length() < getMaxChars())){
        
            super.insertString(offs, str, a);
        }
    }
	
	 public void onlyInt(JTextField number)
	 {
		number.addKeyListener(new KeyAdapter() {
	        public void keyTyped(KeyEvent e) {
	             boolean ret = true;
	                try {
	                    Integer.parseInt(number.getText()+e.getKeyChar());
	              
	                }catch (NumberFormatException ee) {
	                    ret = false;
	                }


	            if (!ret) {
	                e.consume();
	            }
	        }
	    });
	 }
	 
	 public void onlyDouble(JTextField number)
	 {
		number.addKeyListener(new KeyAdapter() {
	        public void keyTyped(KeyEvent e) {
	             boolean ret = true;
	                try {
	                	Double.parseDouble(number.getText()+e.getKeyChar()); 
	        	   }catch (NumberFormatException ee) {
	                    ret = false; 
	                }


	            if (!ret) {
	                e.consume();
	            }
	        }
	    });
	 }
	 public boolean charactercontrol(GUI getA,String knt)
	 {
		 if(knt.equals("insert"))
			{
			 if(getA.getTName().getText().equals("") && getA.getTName().isVisible()==true)
			 {
				JOptionPane.showMessageDialog(null, "ismi boş bırakmayınız");
				check=false;
			 }
			 else if(getA.getTBarcode().getText().length() >0 && getA.getTBarcode().getText().length()<13)
			 {
		            JOptionPane.showMessageDialog(null, "lütfen barkodunuzu 12 karakter kadar giriş yapınız yada boş bırakınız.");
		            check=false;
			 }
			 else 
			 {
			 try
			 {
					if(Float.parseFloat(getA.getTPrice().getText()) >99999.99)
					{
						JOptionPane.showMessageDialog(null, "lütfen 99999.99 den küçük değer giriniz ");
						check=false;
					}
					else
					{
						 try 
						 {
							 Integer.parseInt(getA.getTNumbe().getText());
							check=true;
						 }
						catch (Exception e)
						 {
								JOptionPane.showMessageDialog(null, "lütfen doğru bir ürün formatta bir ürün numarası giriniz");
								check=false;
						 }
						
					}
					
				}
			 catch (Exception e)
			 {
				 JOptionPane.showMessageDialog(null, "lütfen  ürün fiyatını ondalıklı sayı giriniz");
				 check=false;
			 }
			 }
			
				
			}
		 else
			 if(knt.equals("update"))
				{
				 if(getA.getUptTName().getText().equals("") && getA.getUptTName().isVisible()==true)
				 {
					JOptionPane.showMessageDialog(null, "ismi boş bırakmayınız");
					check=false;
				 }
				 else if(getA.getUptTBarcode().getText().length() >0 && getA.getUptTBarcode().getText().length()<13)
				 {
			            JOptionPane.showMessageDialog(null, "lütfen barkodunuzu 12 karakter kadar giriş yapınız yada boş bırakınız.");
			            check=false;
				 }
				 else 
				 {
				 try
				 {
						if(Float.parseFloat(getA.getUptTPrice().getText()) >99999.99)
						{
							JOptionPane.showMessageDialog(null, "lütfen 99999.99 den küçük değer giriniz ");
							check=false;
						}
						else if(getA.getUptTNumbe().isVisible()==true)
						{
							 try 
							 {
								 
								 Integer.parseInt(getA.getUptTNumbe().getText());
								check=true;
								 
							 }
							catch (Exception e)
							 {
									JOptionPane.showMessageDialog(null, "lütfen doğru bir ürün formatta bir ürün numarası giriniz");
									check=false;
							 }
							
						}
						else {check=true;}
						
					}
				 catch (Exception e)
				 {
					 JOptionPane.showMessageDialog(null, "lütfen  ürün fiyatını ondalıklı sayı giriniz");
					 check=false;
				 }
				 }
					
					
				}
			 return check;
	
	 }
	
	
}
