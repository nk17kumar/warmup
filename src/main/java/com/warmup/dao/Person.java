package com.warmup.dao;

import java.util.Map;

import org.jgrapht.io.Attribute;
import org.jgrapht.io.VertexProvider;

/**
 * Data Object Class to organize the features of the GOT 
 * characters. This class acts as the vertex for the directed
 * graph.
 * 
 * @author nk17kumar
 */

public class Person implements VertexProvider<Person>{
	
	private String id;
	private String name;
	
	public Person(String id,String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Person(String id) {
		super();
		this.id = id;
	}

	public Person() {
		
	}

	public String getName() {
		return id;
	}

	public void setName(String name) {
		this.id = name;
	}
	
	/**
	 * Builds Person from the specified input parameters
	 *  
	 * @see org.jgrapht.io.VertexProvider#buildVertex(java.lang.String, java.util.Map)
	 * @param id distinct string to identify a person
	 *        attributes mapping of additional features of the person
	 * @return Person object with specified features
	 */
	public Person buildVertex(String id, Map<String, Attribute> attributes) {
		String name = id;
		if(attributes.containsKey("label")) {
			name = attributes.get("label").toString();
		}
		return new Person(id,name);
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Person)) {
	           return false;
	       }
	       return this.id.equals(((Person) obj).id);
	}

	@Override
	public String toString() {
		return this.name;
	}
	
	public int hashCode() {
		return this.id.hashCode();
	}
	
}
