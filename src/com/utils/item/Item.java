package com.utils.item;

public class Item {
	
	private String Name;
	private String Extension;
	private String Path;
	
	
	/**
	 * 
	 * @param Name Nombre del fichero
	 * @param Extension Tipo de fichero [XML, TXT... ETC]
	 * @param Path Ruta del fichero
	 */
	public Item (String Name, String Extension, String Path) {
		this.Name = Name;
		this.Extension = Extension;
		this.Path = Path;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getExtension() {
		return Extension;
	}

	public void setExtension(String extension) {
		Extension = extension;
	}

	public String getPath() {
		return Path;
	}

	public void setPath(String path) {
		Path = path;
	}

	@Override
	public String toString() {
		return "Item [Name=" + Name + ", Extension=" + Extension + ", Path=" + Path + "]";
	}

	
	
}
