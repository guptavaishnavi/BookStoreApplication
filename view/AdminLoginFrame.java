package view;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

import controller.AdminLoginPageController;
import controller.MyWindowListener;

public class AdminLoginFrame extends Frame{

	Label usernamelb, passwordlb;
	TextField usernametf, passwordtf;
	Button loginbt, userloginbt;
	
	public AdminLoginFrame() {
		
		this.setBounds(300,300, 230, 230);
		this.setVisible(true);
		this.setTitle("Admin Login ");
		this.setResizable(false);
		this.setLayout(new FlowLayout());
		
		usernametf = new TextField(20);
		passwordtf = new TextField(20);
		
		usernamelb = new Label("Enter your name");
		passwordlb = new Label("Enter your password");
		
		
		loginbt = new Button("Login");
		userloginbt = new Button("User Login");
		
		MyWindowListener wl = new MyWindowListener(this);
		this.addWindowListener(wl);
		
		passwordtf.setEchoChar('*');
		this.add(usernamelb);
		this.add(usernametf);
		this.add(passwordlb);
		this.add(passwordtf);
		this.add(loginbt);
		this.add(userloginbt);
		
		
		AdminLoginPageController ac = new AdminLoginPageController(this);
		loginbt.addActionListener(ac);
		userloginbt.addActionListener(ac);
	}

	public Label getUsernamelb() {
		return usernamelb;
	}

	public void setUsernamelb(Label usernamelb) {
		this.usernamelb = usernamelb;
	}

	public Label getPasswordlb() {
		return passwordlb;
	}

	public void setPasswordlb(Label passwordlb) {
		this.passwordlb = passwordlb;
	}

	public TextField getUsernametf() {
		return usernametf;
	}

	public void setUsernametf(TextField usernametf) {
		this.usernametf = usernametf;
	}

	public TextField getPasswordtf() {
		return passwordtf;
	}

	public void setPasswordtf(TextField passwordtf) {
		this.passwordtf = passwordtf;
	}

	public Button getLoginbt() {
		return loginbt;
	}

	public void setLoginbt(Button loginbt) {
		this.loginbt = loginbt;
	}

	public Button getUserloginbt() {
		return userloginbt;
	}

	public void setUserloginbt(Button userloginbt) {
		this.userloginbt = userloginbt;
	}
	
	
}
