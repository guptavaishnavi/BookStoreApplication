package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import db.BookDAO;
import model.Book;
import view.BookInsertPage;

public class BookInsertPageController implements ActionListener{

	BookInsertPage bookInsertPage;
	
	public BookInsertPageController(BookInsertPage bookInsertPage) {
		this.bookInsertPage = bookInsertPage;
	}

	@Override
	public void actionPerformed(ActionEvent e) {


		if(e.getSource() == bookInsertPage.getSavebt()) {
			
			int id = Integer.valueOf(bookInsertPage.getIdtf().getText());
			String title = bookInsertPage.getTitletf().getText();
			String author = bookInsertPage.getAuthortf().getText();
			float price = Float.valueOf(bookInsertPage.getPricetf().getText());
			
			Book b = new Book(id, title, author, price);
			BookDAO d1 = new BookDAO();
			
			if(d1.AnyNullValue(b)) {
				if(d1.insertBook(b)) {
					JOptionPane.showMessageDialog(bookInsertPage, "Successfully Inserted!");
					bookInsertPage.dispose();
				}
				else {
					JOptionPane.showMessageDialog(bookInsertPage, "This Book id already exist!");
				}
			}else {
				JOptionPane.showMessageDialog(bookInsertPage, "Enter all values");
			}
			
		}
		else if(e.getSource() == bookInsertPage.getBackbt()) {
			bookInsertPage.dispose();
		}
		
	}

}
