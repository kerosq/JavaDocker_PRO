package com.utils.item.factory;

import com.utils.item.Item;

public class Escribe extends Item {

	public Escribe(String Name, String Extension, String Path) {
		super(Name, Extension, Path);
	}

	public void Write () {
		System.out.println(getName());
	}	
	public void Flush () {}
	public void Close () {}
	
}
