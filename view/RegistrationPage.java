package view;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.TextField;

import controller.RegistrationPageController;

public class RegistrationPage extends Frame
{
	Label usernamelb, passwordlb;
	TextField usernametf, passwordtf;
	Button submitbt, userbt; 
	
	
	public RegistrationPage() throws HeadlessException {
		
		this.setLayout(new FlowLayout());
		this.setResizable(false);
		this.setTitle("Registration Page");
		
		this.setVisible(true);
		this.setBounds(300,300, 250, 250);
		
		usernametf = new TextField(20);
		passwordtf = new TextField(20);
		
		usernamelb = new Label("Enter your name");
		passwordlb = new Label("Enter your password");
		
		submitbt = new Button("Submit");
		userbt = new Button("Login");
		
		passwordtf.setEchoChar('*');
		
		this.add(usernamelb);
		this.add(usernametf);
		this.add(passwordlb);
		this.add(passwordtf);
		
		this.add(submitbt);
		this.add(userbt);	
		
		controller.MyWindowListener wl = new controller.MyWindowListener(this);
		this.addWindowListener(wl);
		
		RegistrationPageController rc = new RegistrationPageController(this);
		
		submitbt.addActionListener(rc);
		userbt.addActionListener(rc);
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


	public Button getSubmitbt() {
		return submitbt;
	}


	public void setSubmitbt(Button submitbt) {
		this.submitbt = submitbt;
	}


	public Button getUserbt() {
		return userbt;
	}


	public void setUserbt(Button userbt) {
		this.userbt = userbt;
	}
	
}
