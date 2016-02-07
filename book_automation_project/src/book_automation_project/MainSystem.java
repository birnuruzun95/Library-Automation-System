package book_automation_project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class MainSystem {

	static String fileName = null;
	static Library lib = new Library();
	static Scanner in = new Scanner(System.in);
	static Boolean running = true;

	public static void main(String[] args) {
		while (running) {
			System.out.println("\nEnter 0 for load a library." 
		                      + "\nEnter 1 for save and quit"
					          + "\nEnter 2 for list all books in library" 
					          + "\nEnter 3 for add book to library"
					          + "\nEnter 4 for add video/image to archive"
					          + "\nEnter 5 for load and export video/image/sounds file from archive and play it");
			int answer = in.nextInt();
			switch (answer) {
			case 0:
				System.out.println("enter the file name to load!");				
				loadscript(in.next());
				break;
			case 1:
				saveAndQuit();
				break;
			case 2:
				System.out.println(lib.toString());				
				break;
			case 3:
				addBook();
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			}
		}
		System.exit(0);
	}

	private static void addBook() {
		// TODO Auto-generated method stub
	    String writer,book_name;
		int isbn;
		
		System.out.println("\nEnter book name:");
		book_name = in.next();
		System.out.println("\nEnter writer:");
		writer = in.next();
		System.out.println("\nEnter ISBN:");
		isbn = in.nextInt();
			
		Books b = new Books(book_name,writer,isbn);
		lib.addBook(b);
	}

	private static void saveAndQuit() {
		// TODO Auto-generated method stub
		System.out.println("Enter file name:");
		fileName= in.next() + ".ser";
		running = false;
		FileOutputStream fos = null;
		ObjectOutputStream out = null;
		
		try {
			fos = new FileOutputStream(fileName);
			out = new ObjectOutputStream(fos);
			out.writeObject(lib);
			fos.close();
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void loadscript(String fileName2) {
		// TODO Auto-generated method stub
	
		FileInputStream fis = null;
		ObjectInputStream in = null;
		
		File file = new File (fileName);
		if (file.exists()){
		try {
			fis = new FileInputStream(fileName + ".ser");
			in = new ObjectInputStream(fis);
			lib = (Library)in.readObject();	
			fis.close();
			in.close();				 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}else{
			System.out.println("\nThe file does not exist!");
		}
	}
	
}
