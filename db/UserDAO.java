package db;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import model.User;

public class UserDAO {
	
	static ArrayList<User> userArray;
	
	static {
		userArray = new ArrayList<>();
	}
	
	public User validate(User u1) {
		for(int i=0; i<userArray.size(); i++){
			if(u1.getUsername().equals(userArray.get(i).getUsername()) && u1.getPassword().equals(userArray.get(i).getPassword())){
				return u1;
			}
		}
		return null;
	}
	
	public ArrayList<User> show() {
		return userArray;
	}
	
	public void showUsers()
	{
		if(userArray.size()==0) {
			System.out.println("No users");
		}
		for(int i=0; i<userArray.size(); i++) {
			System.out.println(userArray.get(i).getUsername());
		}
	}
	
	public boolean valueExist(User u1) {
		for(int i=0; i<userArray.size(); i++){
			if(u1.getUsername().equals(userArray.get(i).getUsername()) && u1.getPassword().equals(userArray.get(i).getPassword()))
			{
				return true;
			}
		}
		return false;
	}
	
	public boolean userExist(User u1) {
		for(int i=0; i<userArray.size(); i++){
			if(u1.getUsername().equalsIgnoreCase(userArray.get(i).getUsername())) {
				return true;
			}
		}
		return false;
	}

	public void insert(User u1) {
		userArray.add(u1);
	}
}
