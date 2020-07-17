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
	 
	 public boolean charactercontrols(String PNumber, String PName , String PPrice, String PVat, String PBarcode)
	 {
		
			
				if(PNumber.equals(""))
				{
					JOptionPane.showMessageDialog(null, "Boş bırakmayınız");
					check=false;
					
				}
				else if(Integer.parseInt(PNumber) <1)
				{
					JOptionPane.showMessageDialog(null, "lütfen 1  den büyük bir değer giriniz");
					check=false;
				}
				else if(PBarcode.length() >0 && PBarcode.length()<13)
				{
		            JOptionPane.showMessageDialog(null, "lütfen barkodunuzu 12 karakter kadar giriş yapınız yada boş bırakınız.");
		            check=false;
				}
				else if(Float.parseFloat(PPrice) >99999.99)
				{
					JOptionPane.showMessageDialog(null, "lütfen 99999.99 den küçük değer giriniz ");
					check=false;
				}
				else
				{
					check=true;
				}
				return check;
	 
	 }
	
}
