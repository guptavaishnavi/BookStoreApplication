package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import db.BookDAO;
import view.BookDeletePage;

public class BookDeletePageController implements ActionListener{

	BookDeletePage bookDeletePage;
	
	public BookDeletePageController(BookDeletePage bookDeletePage) {
		this.bookDeletePage = bookDeletePage;
 	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == bookDeletePage.getDeletebt()) {
			
			String strid = bookDeletePage.getIdtf().getText();
			String title = bookDeletePage.getTitletf().getText();
			
			if(strid.equals(null)) {
				JOptionPane.showMessageDialog(bookDeletePage, "Enter all values");
			}
			else {
				BookDAO d1 = new BookDAO();
				int id = Integer.valueOf(strid);
				d1.deleteBook(id);
				d1.deleteBook(title);
				JOptionPane.showMessageDialog(bookDeletePage, "Successfully Deleted!");
				bookDeletePage.dispose();
			}
		}
		else if(e.getSource() == bookDeletePage.getBackbt()) {
			bookDeletePage.dispose();
		}
		
	}

}
