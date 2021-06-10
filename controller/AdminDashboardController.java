package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import db.BookDAO;
import db.UserDAO;
import view.AdminDashboard;
import view.BookViewPage;
import view.UserViewPage;

public class AdminDashboardController implements ActionListener{

	AdminDashboard adminDashboard;
	
	public AdminDashboardController(AdminDashboard adminDashboard) {
		this.adminDashboard = adminDashboard;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == adminDashboard.getViewbt()) 
		{
			new BookViewPage();
			BookDAO b1 = new BookDAO();
			b1.showBooks();
		}
		else if(e.getSource() == adminDashboard.getUpdatebt()) 
		{
			System.out.println("Up");
			new view.BookUpdatePage();
		}
		else if(e.getSource() == adminDashboard.getInsertbt()) 
		{
			new view.BookInsertPage();
		}
		else if(e.getSource() == adminDashboard.getUserbt()) 
		{
			new UserViewPage();
			UserDAO d1 = new UserDAO();
			d1.showUsers();
		}
		else if(e.getSource() == adminDashboard.getLogoutbt()) 
		{
			adminDashboard.dispose();
			new view.HomePage();
		}
		else if(e.getSource() == adminDashboard.getDeletebt()) 
		{
			new view.BookDeletePage();
		}
		
	}
	
	

}
