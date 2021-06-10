package view;

import java.awt.*;

import controller.BookDeletePageController;
import controller.MyWindowListener;

public class BookDeletePage extends Frame {
	
	Label headinglb, idlb, titlelb;
	TextField idtf, titletf;
	Button deletebt, backbt;

	public BookDeletePage()
	{
		this.setBounds(300,300, 220, 250);
		this.setVisible(true);
		this.setTitle("Delete Page");
		this.setResizable(false);
		this.setLayout(new FlowLayout());
		
		MyWindowListener wl = new MyWindowListener(this);
		this.addWindowListener(wl);
		
		headinglb = new Label("Enter either id or title of the book");
		idlb = new Label("Book id");
		titlelb = new Label("Book title");
		
		idtf = new TextField(20);
		titletf = new TextField(20);
		
		deletebt = new Button("Delete Book");
		backbt = new Button("Back");
		
		this.add(headinglb);
		this.add(idlb);
		this.add(idtf);
		this.add(titlelb);
		this.add(titletf);
		this.add(deletebt);
		this.add(backbt);
		
		BookDeletePageController dpc = new BookDeletePageController(this);
		deletebt.addActionListener(dpc);
		backbt.addActionListener(dpc);
	}

	public Label getHeadinglb() {
		return headinglb;
	}

	public void setHeadinglb(Label headinglb) {
		this.headinglb = headinglb;
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

	public Button getDeletebt() {
		return deletebt;
	}

	public void setDeletebt(Button deletebt) {
		this.deletebt = deletebt;
	}

	public Button getBackbt() {
		return backbt;
	}

	public void setBackbt(Button backbt) {
		this.backbt = backbt;
	}
	
	
	
}
