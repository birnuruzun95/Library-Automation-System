package book_automation_project;

import java.io.Serializable;

public class VIS implements Serializable{
	
	private String name; //mp3 vb formatta tutacaðým dosyalarýn ismi
	private byte[]data;
	
	public VIS(){
		name = null;
		data = null;
	}
	public VIS(String name, byte[] data){
		this.name = name;
		this.data = data;
	}
	public String getName(){
		return name;
	}
	public byte[] getData(){
		return data;
	}
}
