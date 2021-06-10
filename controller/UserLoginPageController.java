package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.User;
import view.UserLoginFrame;

public class UserLoginPageController implements ActionListener{

	UserLoginFrame userLoginFrame;
	
	public UserLoginPageController(UserLoginFrame userLoginFrame) {
		this.userLoginFrame = userLoginFrame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == userLoginFrame.getUserbt()) {
			
			String username = userLoginFrame.getUsernametf().getText();
			String password = userLoginFrame.getPasswordtf().getText();

			User u1 = new User();
			u1.setUsername(username);
			u1.setPassword(password);
			
			db.UserDAO d1 = new db.UserDAO();
			u1 = d1.validate(u1);
			
			if(u1!=null)
			{
				JOptionPane.showMessageDialog(userLoginFrame, "Login Successful");
				new view.UserDashboard(u1);
				userLoginFrame.dispose();
			}
			else 
			{
				JOptionPane.showMessageDialog(userLoginFrame, "Login Again!");
				userLoginFrame.dispose();
				new view.UserLoginFrame();
			}
			
		}
		else if(e.getSource() == userLoginFrame.getAdminbt()) {
			userLoginFrame.dispose();
			new view.AdminLoginFrame();
		}
		else if(e.getSource() == userLoginFrame.getRegisterbt())
		{
			userLoginFrame.dispose();
			new view.RegistrationPage();
		}
		
	}

}
