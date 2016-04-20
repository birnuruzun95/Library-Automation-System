package com.library.view;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class LibraryInterface extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	private AddBookPanel adp;
	private BrowseLibraryPanel blp;
	private JTabbedPane jtb;
	private String filler;
	
	public LibraryInterface(String title){
		super(title);
		jtb = new JTabbedPane();
		adp = new AddBookPanel();
		blp = new BrowseLibraryPanel();
		
		filler = "              "; //14 kez bo�luk
		jtb.addTab(filler + filler + "Add Book" + filler + filler,adp);
		jtb.addTab(filler + "Browse Librarys" + filler, blp);
		
		add(jtb);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(460,460); // pencere size'�
		setResizable(false);			
	}
	public AddBookPanel getAddBookPanel(){
		return adp;
	}
	public BrowseLibraryPanel getBrowseLibraryPanel(){
		return blp;
	}
	public JTabbedPane getTabbedPane(){
		return jtb;
	}
	public String getFiller(){
		return filler;
	}
}
