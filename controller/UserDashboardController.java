package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import db.BookDAO;
import view.UserDashboard;

public class UserDashboardController implements ActionListener{

	UserDashboard userDashboard;
	
	public UserDashboardController(UserDashboard userDashboard) {
		this.userDashboard = userDashboard;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == userDashboard.getViewbt()) {
			new view.BookViewPage();
			BookDAO b = new BookDAO();
			b.showBooks();
		}
		else if(e.getSource() == userDashboard.getLogoutbt()) {
			userDashboard.dispose();
			new view.HomePage();
		}
		
	}

}
