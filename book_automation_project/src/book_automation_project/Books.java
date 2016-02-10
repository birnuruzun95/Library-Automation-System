package book_automation_project;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Books implements Serializable {
	private String writer, book_name;
	private int isbn;

	private List<VIS> vis;

	public Books() {
		isbn = 0;
		writer = null;
		book_name = null;
		vis = new ArrayList<VIS>();
	}

	public Books(String writer, String book_name, int isbn) {
		this.isbn = isbn;
		this.writer = writer;
		this.book_name = book_name;
	}

	public void addVIS(VIS v) {
		vis.add(v);
	}

	public String getBook_name() {
		return book_name;
	}

	public VIS getVISByName(String name) {
		VIS v = null;
		Iterator<VIS> i = vis.iterator();
		while (i.hasNext()) {
			v = i.next();
			if (v.getName().toLowerCase().contentEquals(name.toLowerCase())) {
				return v;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		String visName = " ";
		String visAmount = "(" + String.valueOf(vis.size()) + ")";

		Iterator<VIS> i = vis.iterator();
		while (i.hasNext()) {
			visName += i.next().getName() + ",";
		}

		return "\nBook's Name:" + book_name + "\nWriter:" + writer + 
				"\nisbn no:" + isbn + "\nVIS files" + visAmount + ":" + visName+ "\n";
	}

}
