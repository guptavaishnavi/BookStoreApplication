package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.AdminLoginFrame;
import view.HomePage;
import view.UserLoginFrame;

public class HomePageController implements ActionListener
{
	HomePage home;
	
	public HomePageController(HomePage h) {
		this.home = h;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == home.getAdminbt()) {
			home.dispose();
			new AdminLoginFrame();
		}else {
			home.dispose();
			new UserLoginFrame();
		}
	}
}
