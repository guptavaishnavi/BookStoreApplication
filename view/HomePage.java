package view;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

import controller.MyWindowListener;

public class HomePage extends Frame
{
	Button adminbt, userbt;
	
	public HomePage() {
		
		this.setBounds(300,300, 300, 100);
		this.setVisible(true);
		this.setTitle("Home Page");
		this.setResizable(false);
		this.setLayout(new FlowLayout());
		
		adminbt = new Button("Admin");
		userbt = new Button("User");
		
		MyWindowListener wl = new MyWindowListener(this);
		this.addWindowListener(wl);
		
		this.add(adminbt);
		this.add(userbt);
		
		controller.HomePageController hpc = new controller.HomePageController(this);
		adminbt.addActionListener(hpc);
		userbt.addActionListener(hpc);
	}

	public Button getAdminbt() {
		return adminbt;
	}

	public void setAdminbt(Button adminbt) {
		this.adminbt = adminbt;
	}

	public Button getUserbt() {
		return userbt;
	}

	public void setUserbt(Button userbt) {
		this.userbt = userbt;
	}
	

}
