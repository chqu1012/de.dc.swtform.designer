package de.dc.swtform.example.control.model;

public class BaseContactsModel {
	
	public BaseContactsModel() {
	}
	public BaseContactsModel(String name, String vorname, int handy) {
		this.name=name;
		this.vorname=vorname;
		this.handy=handy;
	}
	
	private String name;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	private String vorname;
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getVorname() {
		return vorname;
	}
	private int handy;
	public void setHandy(int handy) {
		this.handy = handy;
	}
	public int getHandy() {
		return handy;
	}
}	
