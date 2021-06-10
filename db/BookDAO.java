package db;

import java.util.ArrayList;
import java.util.List;

import model.Book;

public class BookDAO {
	
	static ArrayList<Book> booklist;
	static {
		booklist = new ArrayList<>();
	}
	
	public void showBooks(){
		//return booklist;
		if(booklist.size()==0) {
			System.out.println("Empty");
			return;
		}
		for(int i=0;i<booklist.size();i++) {
			System.out.print(booklist.get(i).getId()+" ");
			System.out.print(booklist.get(i).getTitle()+" ");
			System.out.print(booklist.get(i).getAuthor()+" ");
			System.out.print(booklist.get(i).getPrice()+" ");
			System.out.println();
		}
	}
	
	public ArrayList<Book> show(){
		return booklist;
	}
	
	public Book getBook(int id) {
		for(int i=0; i<booklist.size(); i++) {
			if(booklist.get(i).getId() == id) {
				return booklist.get(i);
			}
		}
		return null;
	}

	public Book getBook(String title) {
		for(int i=0; i<booklist.size(); i++) {
			if(booklist.get(i).getTitle().equalsIgnoreCase(title)) {
				return booklist.get(i);
			}
		}
		return null;
	}
	
	public boolean insertBook(Book b) {
		int id = b.getId();
		for(int i=0; i<booklist.size(); i++) {
			if(booklist.get(i).getId() == id) {
				return false;
			}
		}
		booklist.add(b);
		return true;
	}
	
	public boolean deleteBook(int id) {
		for(int i=0; i<booklist.size(); i++) {
			if(booklist.get(i).getId() == id) {
				booklist.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public boolean deleteBook(String title) {
		for(int i=0; i<booklist.size(); i++) {
			if(booklist.get(i).getTitle().equalsIgnoreCase(title)) {
				booklist.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public void UpdateBook(Book b) {
		int id = b.getId();
		int flag=0;
		for(int i=0; i<booklist.size(); i++) {
			if(booklist.get(i).getId() == id) {
				booklist.remove(i);
				booklist.add(b);
				flag=1;
			}
		}
		if(flag==0)
			booklist.add(b);
	}

	public boolean AnyNullValue(Book b) {
		if(b.getId()==0 || b.getTitle().equals(null) || b.getAuthor().equals(null) || b.getPrice()==0) {
			return false;
		}
		return true;
	}
}
