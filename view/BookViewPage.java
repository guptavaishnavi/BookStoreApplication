package view;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import controller.MyWindowListener;
import db.BookDAO;

public class BookViewPage extends Frame{
	
	Label headlb;
	JTextArea tf;
	
	public BookViewPage(){
		
		this.setBounds(400,300 , 200, 200);
		this.setTitle("View Page");
		this.setVisible(true);
		this.setResizable(false);
		this.setLayout(new FlowLayout());
		
		MyWindowListener wl = new MyWindowListener(this);
		this.addWindowListener(wl);
		
		BookDAO b1 = new BookDAO();
		ArrayList<model.Book> b= b1.show();
		
		headlb = new Label("Available Books ");
		tf = new JTextArea();
		tf.setText(null);
		for(int i=0; i<b.size(); i++) {
			tf.append(b.get(i).getId()+", "+b.get(i).getTitle()+", "+b.get(i).getAuthor()+", "+b.get(i).getPrice()+"\n");
		}
		
		this.add(headlb);
		this.add(tf);
	
	}
}