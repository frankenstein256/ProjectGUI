package com.gui.faz1;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Desktop.Action;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;





public class GUI {
	 
	CharacterControlers maxLenName = new CharacterControlers();
	CharacterControlers maxLenProduct = new CharacterControlers();
	CharacterControlers maxLenNumber = new CharacterControlers();
	CharacterControlers maxLenPrice = new CharacterControlers();
	CharacterControlers UptmaxLenName = new CharacterControlers();
	CharacterControlers UptmaxLenProduct = new CharacterControlers();
	CharacterControlers UptmaxLenNumber = new CharacterControlers();
	CharacterControlers UptmaxLenPrice = new CharacterControlers();
	   Actions a1 = null;

	    public Actions getA1() {
	        if (a1 == null) {
	            a1 = new Actions(this);
	        }
	        return a1;
	    }

	    public void setA1(Actions a1) {
	        this.a1 = a1;
	    }

	public JButton getSend() {
		return send;
	}


	public void setSend(JButton send) {
		this.send = send;
	}

	public JFrame getFrame() {
		return frame;
	}


	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	
	public JLabel getLNumbe() {
		return LNumbe;
	}


	public void setLNumbe(JLabel lNumbe) {
		LNumbe = lNumbe;
	}


	public JLabel getLName() {
		return LName;
	}


	public void setLName(JLabel lName) {
		LName = lName;
	}


	public JLabel getLPrice() {
		return LPrice;
	}


	public void setLPrice(JLabel lPrice) {
		LPrice = lPrice;
	}


	public JLabel getLVat() {
		return LVat;
	}


	public void setLVat(JLabel lVat) {
		LVat = lVat;
	}


	public JLabel getLBarcode() {
		return LBarcode;
	}


	public void setLBarcode(JLabel lBarcode) {
		LBarcode = lBarcode;
	}


	public JTextField getTNumbe() {
		return TNumbe;
	}


	public void setTNumbe(JTextField tNumbe) {
		TNumbe = tNumbe;
	}


	public JTextField getTName() {
		return TName;
	}


	public void setTName(JTextField tName) {
		TName = tName;
	}


	public JTextField getTPrice() {
		return TPrice;
	}


	public void setTPrice(JTextField tPrice) {
		TPrice = tPrice;
	}




	public JTextField getTBarcode() {
		return TBarcode;
	}


	public void setTBarcode(JTextField tBarcode) {
		TBarcode = tBarcode;
	}
	public JLabel getUptLNumbe() {
		return UptLNumbe;
	}

	public void setUptLNumbe(JLabel uptLNumbe) {
		UptLNumbe = uptLNumbe;
	}

	public JLabel getUptLName() {
		return UptLName;
	}

	public void setUptLName(JLabel uptLName) {
		UptLName = uptLName;
	}

	public JLabel getUptLPrice() {
		return UptLPrice;
	}

	public void setUptLPrice(JLabel uptLPrice) {
		UptLPrice = uptLPrice;
	}

	public JLabel getUptLBarcode() {
		return UptLBarcode;
	}

	public void setUptLBarcode(JLabel uptLBarcode) {
		UptLBarcode = uptLBarcode;
	}


	public JLabel getUptLVat() {
		return UptLVat;
	}

	public void setUptLVat(JLabel uptLVat) {
		UptLVat = uptLVat;
	}

	public JComboBox getUptVatCombo() {
		return UptVatCombo;
	}

	public void setUptVatCombo(JComboBox uptVatCombo) {
		UptVatCombo = uptVatCombo;
	}
	public JTextField getUptTNumbe() {
		return UptTNumbe;
	}

	public void setUptTNumbe(JTextField uptTNumbe) {
		UptTNumbe = uptTNumbe;
	}

	public JTextField getUptTName() {
		return UptTName;
	}

	public void setUptTName(JTextField uptTName) {
		UptTName = uptTName;
	}

	public JTextField getUptTPrice() {
		return UptTPrice;
	}

	public void setUptTPrice(JTextField uptTPrice) {
		UptTPrice = uptTPrice;
	}

	public JTextField getUptTBarcode() {
		return UptTBarcode;
	}

	public void setUptTBarcode(JTextField uptTBarcode) {
		UptTBarcode = uptTBarcode;
	}

	
	public JTextField getUptTSerachBar() {
		return UptTSerachBar;
	}

	public void setUptTSerachBar(JTextField uptTSerachBar) {
		UptTSerachBar = uptTSerachBar;
	}

	public JButton getSearch() {
		return search;
	}

	public void setSearch(JButton search) {
		this.search = search;
	}

	public JButton getUpdate() {
		return update;
	}

	public void setUpdate(JButton update) {
		this.update = update;
	}

	public JTextArea getArea() {
		return area;
	}

	public void setArea(JTextArea area) {
		this.area = area;
	}
	public JTextArea getReportarea() {
		return reportarea;
	}

	public void setReportarea(JTextArea reportarea) {
		this.reportarea = reportarea;
	}
	public JButton getReports() {
		return reports;
	}

	public void setReports(JButton reports) {
		this.reports = reports;
	}
	
	private JFrame frame;


	private JTextField TNumbe;
	private JTextField TName;
	private JTextField TPrice;
	private JTextField TBarcode;
	private JTextField UptTNumbe;
	private JTextField UptTName;
	private JTextField UptTSerachBar;
	private JTextField UptTPrice;
	private JTextField UptTBarcode;
	
	
	private JButton send;
	private JButton search;
	private JButton update;
	private JButton reports;
	
	

	
	private JPanel CreatePanel ;
	private JPanel SendButonPanel ;
	private JPanel FramePanel ;
	private JPanel TopPanel ;
	private JPanel UpdatePanel ;
	private JPanel CenterPanel ;
	private JPanel BottomPanel ;
	private JPanel SerachPanel ;
	private JPanel CenterSerachPanel ;
	JPanel scroll ;
	
	private JLabel LNumbe;
	private JLabel LName;
	private JLabel LPrice;
	private JLabel LVat;
	private JLabel LBarcode;
	private JLabel UptLNumbe;
	private JLabel UptLName;
	private JLabel UptLPrice;
	private JLabel UptLVat;
	private JLabel UptLBarcode;
	
	
	private String[] VatValue={"0","1","8","18"};
	private ComboBoxModel VatModel ;
	private ComboBoxModel UptVatModel ;
	private  JComboBox VatCombo ;
	private  JComboBox UptVatCombo ;
	
	
	private JTextArea area;
	private JTextArea reportarea;


	JPanel  CenterSerachPanel2;
	private JPanel reportPanel;
	
	private JPanel reportListPanel;
	public GUI()
	{
	
		frame = new JFrame();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.getPreferredSize();
	    reportPanel = new JPanel();
	    CreatePanel = new JPanel();
	    FramePanel = new JPanel();
	    SendButonPanel = new JPanel() ;
	    TopPanel = new JPanel();
	    CenterPanel = new JPanel();
	    UpdatePanel = new JPanel();
	    BottomPanel = new JPanel();
	    SerachPanel = new JPanel() ;
	    reportListPanel = new JPanel() ;
	    
	    
	    CenterSerachPanel = new JPanel();
	    CenterSerachPanel2 = new JPanel();
	    reportPanel.setPreferredSize(new Dimension(340, 30));
	    SerachPanel.setMaximumSize(new Dimension(440, 30));
	    
	    CreatePanel.setPreferredSize(new Dimension(440, 115));
		FramePanel.setLayout(new GridLayout(5,0));
	    CreatePanel.setLayout(new GridLayout(0,2));
	    UpdatePanel.setLayout(new GridLayout(0,2));
	    SerachPanel.setLayout(new GridLayout(0,2));
	    reportPanel.setLayout(new GridLayout(0,2));
	    
	    CenterSerachPanel2.setLayout(new GridLayout(2,0));
	    
	    setReports(new JButton("RAPORLA"));
	    
	    setArea(new JTextArea());
	    setReportarea(new JTextArea(7,40));
		setSend(new JButton("gönder"));
		setUpdate(new JButton("Güncelle"));
		setSearch(new JButton("ürün numarası \n ürün adı \nBUL "));
		
	
		
		setTNumbe(new JTextField());
		setTName(new JTextField());
		setTPrice(new JTextField());
		setTBarcode(new JTextField());
		setUptTSerachBar(new JTextField());
		
		setUptTNumbe(new JTextField());
		setUptTName(new JTextField());
		setUptTPrice(new JTextField());
		setUptTBarcode(new JTextField());
		
		
		setLNumbe(new JLabel("Product Number:"));
		setLName(new JLabel("Product Name:"));
		setLPrice(new JLabel("Product Price:"));
		setLVat(new JLabel("Product KDV:"));
		setLBarcode(new JLabel("Product Barcode:"));
		
		setUptLNumbe(new JLabel("Update Product Number:"));
		setUptLName(new JLabel("Update Product Name:"));
		setUptLPrice(new JLabel("Update Product Price:"));
		setUptLVat(new JLabel("Update Product KDV:"));
		setUptLBarcode(new JLabel("Update Product Barcode:"));
		
	    getReportarea().setPreferredSize(new Dimension(400, 250));
		
	
		//setBounds(x, y, width, height);
		
		 setVatCombo(new JComboBox()); 
		 VatModel = new DefaultComboBoxModel(VatValue);
		 getVatCombo().setModel(VatModel);
		 
		 setUptVatCombo(new JComboBox());
		 UptVatModel = new DefaultComboBoxModel(VatValue);
		 getUptVatCombo().setModel(UptVatModel);
		 


		 
		 maxLenNumber.setMaxChars(6); //max length 5 for 99999 number
		 getTNumbe().setDocument(maxLenNumber);
		 maxLenNumber.onlyInt(getTNumbe());
		CreatePanel.add(getLNumbe());
		CreatePanel.add(getTNumbe());
		
		
		maxLenName.setMaxChars(21); //max 20
		getTName().setDocument(maxLenName);
		CreatePanel.add(getLName());
		CreatePanel.add(getTName());
		
		maxLenPrice.setMaxChars(9); //max length 8 for 99999.99 number
		maxLenPrice.onlyDouble(getTPrice());
		getTPrice().setDocument(maxLenPrice);
		CreatePanel.add(getLPrice());
		CreatePanel.add(getTPrice());
		
		CreatePanel.add(getLVat());
		CreatePanel.add(getVatCombo());
		
		maxLenProduct.setMaxChars(14); //max 13
		getTBarcode().setDocument(maxLenProduct);
		CreatePanel.add(getLBarcode());
		CreatePanel.add(getTBarcode());
		
		
		
		
		UptmaxLenNumber.setMaxChars(6); //max length 5 for 99999 number
		 getUptTNumbe().setDocument(UptmaxLenNumber);
		 UptmaxLenNumber.onlyInt(getUptTNumbe());
		UpdatePanel.add(getUptLNumbe());
		UpdatePanel.add(getUptTNumbe());
		
		
		
		UptmaxLenPrice.setMaxChars(9); //max length 8 for 99999.99 number
		UptmaxLenPrice.onlyDouble(getUptTPrice());
		getUptTPrice().setDocument(UptmaxLenPrice);
		UpdatePanel.add(getUptLPrice());
		UpdatePanel.add(getUptTPrice());
		
		UpdatePanel.add(getUptLVat());
		UpdatePanel.add(getUptVatCombo());
		
		UptmaxLenProduct.setMaxChars(14); //max 13
		getUptTBarcode().setDocument(UptmaxLenProduct);
		UpdatePanel.add(getUptLBarcode());
		UpdatePanel.add(getUptTBarcode());
		
		
		UptmaxLenName.setMaxChars(21); //max 20
		getUptTName().setDocument(UptmaxLenName);
		UpdatePanel.add(getUptLName());
		UpdatePanel.add(getUptTName());
		
		
		SerachPanel.add(getUptTSerachBar());
		SerachPanel.add(getSearch());
	
		

		
		TopPanel.add(CreatePanel);
		CenterPanel.add(UpdatePanel);
		CenterSerachPanel2.add(SerachPanel);
		CenterSerachPanel2.add(getArea());
		CenterSerachPanel.add(CenterSerachPanel2);
		CenterPanel.add(getUpdate());
		TopPanel.add(getSend());
		
		getTNumbe().addActionListener(this.getA1());
		getTName().addActionListener(this.getA1());
		getTPrice().addActionListener(this.getA1());
		getTBarcode().addActionListener(this.getA1());
		getSend().addActionListener(this.getA1());
		getVatCombo().addActionListener(this.getA1());
		
		
		getUptTNumbe().addActionListener(this.getA1());
		getUptTName().addActionListener(this.getA1());
		getUptTPrice().addActionListener(this.getA1());
		getUptTBarcode().addActionListener(this.getA1());
		getUptVatCombo().addActionListener(this.getA1());
		getUptTSerachBar().addActionListener(this.getA1());
		getUpdate().addActionListener(this.getA1());
		getSearch().addActionListener(this.getA1());
		getReports().addActionListener(this.getA1());
	
		JScrollPane sp= new JScrollPane(getReportarea(),JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		reportListPanel.add(sp);	
		getArea().setVisible(false);
		reportPanel.add(getReports());
		BottomPanel.add(reportPanel);
		FramePanel.add(TopPanel);
		FramePanel.add(CenterSerachPanel);
		FramePanel.add(CenterPanel);
		FramePanel.add(BottomPanel);
		FramePanel.add(reportListPanel);	
		
		frame.add(FramePanel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Desktop Gui Aplication");
		frame.pack();
		frame.setVisible(true);
	
		
	}
	
	
	public JPanel getCenterPanel() {
		return CenterPanel;
	}

	public void setCenterPanel(JPanel centerPanel) {
		CenterPanel = centerPanel;
	}

	public JComboBox getVatCombo() {
		return VatCombo;
	}

	public void setVatCombo(JComboBox vatCombo) {
		VatCombo = vatCombo;
	}

	public static void main(String[] args) {
		new GUI();

	}

}
