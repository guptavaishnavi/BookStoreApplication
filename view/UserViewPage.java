package view;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.util.ArrayList;

import javax.swing.JTextArea;

import controller.MyWindowListener;
import db.BookDAO;
import db.UserDAO;

public class UserViewPage extends Frame {

	Label headlb;
	JTextArea tf;
	
	public UserViewPage(){
		
		this.setBounds(400,300 , 100, 200);
		this.setTitle("View Page");
		this.setVisible(true);
		this.setResizable(false);
		this.setLayout(new FlowLayout());
		
		MyWindowListener wl = new MyWindowListener(this);
		this.addWindowListener(wl);
		
		UserDAO d1 = new UserDAO();
		ArrayList<model.User> u= d1.show();
		
		headlb = new Label("Users");
		tf = new JTextArea();
		tf.setText(null);
		
		for(int i=0; i<u.size(); i++) {
			tf.append(u.get(i).getUsername()+"\n");
		}
			
		
		this.add(headlb);
		this.add(tf);
		
	}
}
