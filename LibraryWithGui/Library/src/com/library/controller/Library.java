package com.library.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.library.model.Books;

public class Library extends Object implements Serializable{

	private static final long serialVersionUID = 1L;
	private List<Books> collection;
	
	public Library(){
		collection = new ArrayList<Books>();
		/*bunu da kullanabiliriz. 
		 * ArrayList<Books> collection= new ArrayList<Books>();*/
	}
	public void addBook(Books book){
		collection.add(book);
	}
	
	public Books getBookByName(String name){
		Books v = null;
		Iterator<Books> i = collection.iterator();
		while(i.hasNext()){
			v = i.next();
			if(v.getBook_name().toLowerCase().contentEquals(name.toLowerCase())){
				return v;
			}
		}
		return null; 		
	}
	
	@Override
	public String toString(){
		String total = "\n";
		/*for(int i=0; i<collection.size() ;i++){
			Books b = collection.get(i);
			total = total+b.toString();
		}*/
		/*burda listeye eleman atamanýn farlý yollarýný denedik. Burada Book bir obje türü ve
		 * biz bunu library e extend ediyoruz.		 
		*/
		Iterator<Books> i = collection.iterator();
		while(i.hasNext()){
			Books b =(Books)i.next(); // burda bir cast iþlemi gerçekleþtirdik.yani deðiþken deðiþtirme iþlemi
			total = total+b.toString();			
		}
		return total;
	}
}
