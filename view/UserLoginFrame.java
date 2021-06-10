package view;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.TextField;

import controller.MyWindowListener;
import controller.UserLoginPageController;

public class UserLoginFrame extends Frame {

	Label usernamelb, passwordlb;
	TextField usernametf, passwordtf;
	Button userbt, adminbt, registerbt;
	
	public UserLoginFrame() throws HeadlessException {

		this.setBounds(300,300, 230, 250);
		this.setVisible(true);
		this.setTitle("User Login ");
		this.setResizable(false);
		this.setLayout(new FlowLayout());
		
		usernametf = new TextField(20);
		passwordtf = new TextField(20);
		
		usernamelb = new Label("Enter your name");
		passwordlb = new Label("Enter your password");
		
		
		userbt = new Button("Login");
		adminbt = new Button("Admin Login");
		registerbt = new Button("New User");
		
		MyWindowListener wl = new MyWindowListener(this);
		this.addWindowListener(wl);
		
		passwordtf.setEchoChar('*');
		this.add(usernamelb);
		this.add(usernametf);
		this.add(passwordlb);
		this.add(passwordtf);
		this.add(adminbt);
		this.add(userbt);
		this.add(registerbt);
		
		UserLoginPageController ac = new UserLoginPageController(this);
		userbt.addActionListener(ac);
		adminbt.addActionListener(ac);
		registerbt.addActionListener(ac);
		
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

	public Button getUserbt() {
		return userbt;
	}

	public void setUserbt(Button userbt) {
		this.userbt = userbt;
	}

	public Button getAdminbt() {
		return adminbt;
	}

	public void setAdminbt(Button adminbt) {
		this.adminbt = adminbt;
	}

	public Button getRegisterbt() {
		return registerbt;
	}

	public void setRegisterbt(Button registerbt) {
		this.registerbt = registerbt;
	}
	
	
	
	
	
}
