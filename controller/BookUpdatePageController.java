package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import db.BookDAO;
import model.Book;
import view.BookUpdatePage;

public class BookUpdatePageController implements ActionListener {

	BookUpdatePage bookUpdatePage;
	
	public BookUpdatePageController(BookUpdatePage bookUpdatePage) {
		this.bookUpdatePage = bookUpdatePage;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == bookUpdatePage.getSavebt()) {
			
			String strid = bookUpdatePage.getIdtf().getText();
			String title = bookUpdatePage.getTitletf().getText();
			String author = bookUpdatePage.getAuthortf().getText();
			String pricestr = bookUpdatePage.getPricetf().getText();
			
			if(strid.equals(null) || title.equals(null) || author.equals(null) || pricestr.equals(null)) {
				JOptionPane.showMessageDialog(bookUpdatePage, "Enter all values");
			}
			else {
				int id = Integer.valueOf(strid);
				float price = Float.valueOf(pricestr);
				Book b = new Book(id, title, author, price);
				BookDAO d1 = new BookDAO();
				
				d1.UpdateBook(b);
				JOptionPane.showMessageDialog(bookUpdatePage, "Successfully Updated!");
				bookUpdatePage.dispose();
			}
		}
		else if(e.getSource() == bookUpdatePage.getBackbt()) {
			System.out.println("backbutton");
			bookUpdatePage.dispose();
		}
		
	}

}
