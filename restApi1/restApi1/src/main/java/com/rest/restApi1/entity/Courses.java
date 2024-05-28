package com.rest.restApi1.entity;

public class Courses {
	
	private long id;
	private String tiltle;
	private String description;
	
	public Courses() {
		// TODO Auto-generated constructor stub
	}

	public Courses(long id, String tiltle, String description) {
		super();
		this.id = id;
		this.tiltle = tiltle;
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTiltle() {
		return tiltle;
	}

	public void setTiltle(String tiltle) {
		this.tiltle = tiltle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Courses [id=" + id + ", tiltle=" + tiltle + ", description=" + description + "]";
	}
	
	

}
