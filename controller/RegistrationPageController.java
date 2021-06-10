package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.User;
import view.RegistrationPage;

public class RegistrationPageController implements ActionListener{

	RegistrationPage registrationPage;
	
	public RegistrationPageController(RegistrationPage registrationPage) {
		this.registrationPage = registrationPage;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == registrationPage.getSubmitbt()) {
			
			String uname = registrationPage.getUsernametf().getText();
			String pass = registrationPage.getPasswordtf().getText();
			
			//System.out.println(uname+" "+pass);
			
			User u1 = new User();
			u1.setUsername(uname);
			u1.setPassword(pass);
			
			db.UserDAO d1 = new db.UserDAO();
			User u2 = d1.validate(u1);
			
			//If any entry is null
			if(uname.equals(null) || pass.equals(null)) {
				JOptionPane.showMessageDialog(registrationPage, "Register Again!!!!");
				System.out.println("Entry missing");
			}
			else // if not null
			{
				if(d1.userExist(u1)) //if value exist in list
				{
					JOptionPane.showMessageDialog(registrationPage, "User Already exists!!!!");
					registrationPage.dispose();
					new view.RegistrationPage();
					
				}
				else  //if value not exist
				{
					d1.insert(u1);
					JOptionPane.showMessageDialog(registrationPage, "Successfully Registered!!!!");
					registrationPage.dispose();
					new view.UserDashboard(u1);
					System.out.println(uname+" "+pass);
				}
			}
			
		
//			db.UserDAO d1 = new db.UserDAO();
//			u1 = d1.validate(u1);
//			
//			if(u1 != null)
//			{
//				if(d1.insert(u1)) {
//					JOptionPane.showMessageDialog(registrationPage, "Successfully Registered!");
//					registrationPage.dispose();
//					new view.UserDashboard(u1);
//				}else {
//					JOptionPane.showMessageDialog(registrationPage, "User Already exists");
//				}
//				
//			}
//			else {
//				JOptionPane.showMessageDialog(registrationPage, "Register Again");
//				return;
//			}
			
		}
		else if(e.getSource() == registrationPage.getUserbt()){
			
			registrationPage.dispose();
			new view.UserLoginFrame();
		}	
	}	
}

