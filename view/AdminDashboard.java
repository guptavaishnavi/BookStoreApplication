package view;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

import controller.AdminDashboardController;
import controller.MyWindowListener;

public class AdminDashboard extends Frame{
	
	Button viewbt, deletebt, insertbt, updatebt, logoutbt, userbt;
	
	public AdminDashboard() {
		
		this.setBounds(300,300, 230, 230);
		this.setVisible(true);
		this.setTitle("Admin Dashboard");
		this.setResizable(false);
		this.setLayout(new FlowLayout());
		

		MyWindowListener wl = new MyWindowListener(this);
		this.addWindowListener(wl);
		
		viewbt = new Button("Show Books");
		deletebt = new Button("Delete Book");
		insertbt = new Button("Insert Book Details");
		updatebt = new Button("Update Book Details");
		logoutbt = new Button("Logout");
		userbt = new Button("View Users");
		
		this.add(viewbt);
		this.add(insertbt);
		this.add(deletebt);
		this.add(updatebt);
		this.add(userbt);
		this.add(logoutbt);
		
		AdminDashboardController adc = new AdminDashboardController(this);
		viewbt.addActionListener(adc);
		insertbt.addActionListener(adc);
		deletebt.addActionListener(adc);
		userbt.addActionListener(adc);
		updatebt.addActionListener(adc);
		logoutbt.addActionListener(adc);
		
	}

	public Button getViewbt() {
		return viewbt;
	}

	public void setViewbt(Button viewbt) {
		this.viewbt = viewbt;
	}

	public Button getDeletebt() {
		return deletebt;
	}

	public void setDeletebt(Button deletebt) {
		this.deletebt = deletebt;
	}

	public Button getInsertbt() {
		return insertbt;
	}

	public void setInsertbt(Button insertbt) {
		this.insertbt = insertbt;
	}

	public Button getUpdatebt() {
		return updatebt;
	}

	public void setUpdatebt(Button updatebt) {
		this.updatebt = updatebt;
	}

	public Button getLogoutbt() {
		return logoutbt;
	}

	public void setLogoutbt(Button logoutbt) {
		this.logoutbt = logoutbt;
	}

	public Button getUserbt() {
		return userbt;
	}

	public void setUserbt(Button userbt) {
		this.userbt = userbt;
	}
	
	

}
