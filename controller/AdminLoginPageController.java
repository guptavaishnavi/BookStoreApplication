package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view.AdminLoginFrame;

public class AdminLoginPageController implements ActionListener{

	AdminLoginFrame adminLoginFrame;
	static String adminname, adminpass;
	
	static {
		adminname = "xyz";
		adminpass = "12345";
	}
	
	public AdminLoginPageController(AdminLoginFrame adminLoginFrame) {
		this.adminLoginFrame = adminLoginFrame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String id = adminLoginFrame.getUsernametf().getText();
		String pass = adminLoginFrame.getPasswordtf().getText();
		
		System.out.println(id+" --- "+pass);
		
		if(e.getSource() == adminLoginFrame.getLoginbt()) {
			
			if(id.equals(adminname) && pass.equals(adminpass)) {
				JOptionPane.showMessageDialog(adminLoginFrame, "Login Successful");
				adminLoginFrame.dispose();
				new view.AdminDashboard();
			}
			else {
				JOptionPane.showMessageDialog(adminLoginFrame, "Invalid Access");
				adminLoginFrame.dispose();
				new view.AdminLoginFrame();
			}
			
		}
		else {
			adminLoginFrame.dispose();
			new view.UserLoginFrame();
		}
		
	}
	
	public static String getAdminname() {
		return adminname;
	}

	public static void setAdminname(String adminname) {
		AdminLoginPageController.adminname = adminname;
	}

	public static String getAdminpass() {
		return adminpass;
	}

	public static void setAdminpass(String adminpass) {
		AdminLoginPageController.adminpass = adminpass;
	}

	

	

}
