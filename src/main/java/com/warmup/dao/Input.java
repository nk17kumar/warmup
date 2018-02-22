package com.warmup.dao;

/**
 * Container class to organize command line inputs
 * @author nk17kumar
 */
public class Input {
	
	private String fileName;
	private Person person1;
	private Person person2;
	
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Person getPerson1() {
		return person1;
	}

	public void setPerson1(String person1) {
		this.person1.setName(person1);
	}

	public Person getPerson2() {
		return person2;
	}

	public void setPerson2(String person2) {
		this.person2.setName(person2);
	}
	
	@Override
	public String toString() {
		return "Input [fileName=" + fileName + ", person1=" + person1 + ", person2=" + person2 + "]";
	}

	public Input(String fileName, String person1, String person2) {
		super();
		this.fileName = fileName;
		this.person1 = new Person(person1);
		this.person2 = new Person(person2);
	}

	public Input() {
		super();
		this.fileName = "";
		this.person1 = new Person();
		this.person2 = new Person();
	}
	
	
}
