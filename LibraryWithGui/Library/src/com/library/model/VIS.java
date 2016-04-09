package com.library.model;

import java.io.Serializable;

public class VIS implements Serializable{
	
	private static final long serialVersionUID = 1L;
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
