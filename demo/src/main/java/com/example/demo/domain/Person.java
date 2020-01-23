package com.example.demo.domain;

import java.util.ArrayList;
import java.util.List;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class Person {
	@Id
	@GeneratedValue
	private Long id;
	private String born;
	private String name;
	private String titles;
	
	public String getBorn() {
		return born;
	}
	
	public void setBorn(String born) {
		this.born = born;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTitles() {
		return titles;
	}
	
	public void setTitles(String titles) {
		this.titles = titles;
	}
	
	@Relationship(type = "APPEARS_IN")
	private List<Book> movies = new ArrayList<>();
	
}
