package view;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

import controller.BookInsertPageController;
import controller.MyWindowListener;

public class BookInsertPage extends Frame{

	Label idlb, titlelb, authorlb, pricelb;
	TextField idtf, titletf, authortf, pricetf;
	Button savebt, backbt;
	
	public BookInsertPage()
	{
		this.setBounds(300,300, 230, 300);
		this.setVisible(true);
		this.setTitle("Insert Page");
		this.setResizable(false);
		this.setLayout(new FlowLayout());
		
		MyWindowListener wl = new MyWindowListener(this);
		this.addWindowListener(wl);
		
		idlb = new Label("Book Id");
		titlelb = new Label("Book title");
		authorlb = new Label("Author of the book");
		pricelb = new Label("Price of the book");
		
		idtf = new TextField(20);
		titletf = new TextField(20);
		authortf = new TextField(20);
		pricetf = new TextField(20);
		
		savebt = new Button("Save");
		backbt = new Button("Back");
		
		this.add(idlb);
		this.add(idtf);
		this.add(titlelb);
		this.add(titletf);
		this.add(authorlb);
		this.add(authortf);
		this.add(pricelb);
		this.add(pricetf);
		this.add(savebt);
		this.add(backbt);
		
		BookInsertPageController bpc = new BookInsertPageController(this);
		savebt.addActionListener(bpc);
		backbt.addActionListener(bpc);
		
	}

	public Label getIdlb() {
		return idlb;
	}

	public void setIdlb(Label idlb) {
		this.idlb = idlb;
	}

	public Label getTitlelb() {
		return titlelb;
	}

	public void setTitlelb(Label titlelb) {
		this.titlelb = titlelb;
	}

	public Label getAuthorlb() {
		return authorlb;
	}

	public void setAuthorlb(Label authorlb) {
		this.authorlb = authorlb;
	}

	public Label getPricelb() {
		return pricelb;
	}

	public void setPricelb(Label pricelb) {
		this.pricelb = pricelb;
	}

	public TextField getIdtf() {
		return idtf;
	}

	public void setIdtf(TextField idtf) {
		this.idtf = idtf;
	}

	public TextField getTitletf() {
		return titletf;
	}

	public void setTitletf(TextField titletf) {
		this.titletf = titletf;
	}

	public TextField getAuthortf() {
		return authortf;
	}

	public void setAuthortf(TextField authortf) {
		this.authortf = authortf;
	}

	public TextField getPricetf() {
		return pricetf;
	}

	public void setPricetf(TextField pricetf) {
		this.pricetf = pricetf;
	}

	public Button getSavebt() {
		return savebt;
	}

	public void setSavebt(Button savebt) {
		this.savebt = savebt;
	}

	public Button getBackbt() {
		return backbt;
	}

	public void setBackbt(Button backbt) {
		this.backbt = backbt;
	}
	
	
}
