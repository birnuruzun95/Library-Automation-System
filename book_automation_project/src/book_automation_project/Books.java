package book_automation_project;

import java.io.Serializable;

public class Books implements Serializable{
	private String writer,book_name;
	private int isbn;
	
	public Books(){
		isbn = 0;
		writer = null;
		book_name = null;
	}
	public Books(String writer,String book_name,int isbn){
		this.isbn = isbn;
		this.writer = writer;
		this.book_name = book_name;				
	}
	@Override
	public String toString(){
		return "\nBook's Name:"+ book_name+"\nWriter:"+writer+"\nisbn no:"+isbn+"\n";
	}
	
}
