package view;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

import controller.MyWindowListener;
import controller.UserDashboardController;
import model.User;

public class UserDashboard extends Frame{

	Button viewbt, logoutbt;
	
	public UserDashboard(User u1) {
		
		viewbt = new Button("View Books");
		logoutbt = new Button("Logout");
		
		this.setBounds(300,300, 300, 100);
		this.setVisible(true);
		this.setTitle("User Dashboard");
		this.setResizable(false);
		this.setLayout(new FlowLayout());
		
		MyWindowListener wl = new MyWindowListener(this);
		this.addWindowListener(wl);
		
		this.add(viewbt);
		this.add(logoutbt);
		
		UserDashboardController udc = new UserDashboardController(this);
		viewbt.addActionListener(udc);
		logoutbt.addActionListener(udc);
		
	}

	public Button getViewbt() {
		return viewbt;
	}

	public void setViewbt(Button viewbt) {
		this.viewbt = viewbt;
	}

	public Button getLogoutbt() {
		return logoutbt;
	}

	public void setLogout(Button logoutbt) {
		this.logoutbt = logoutbt;
	}

}
