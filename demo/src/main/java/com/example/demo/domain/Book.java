package com.example.demo.domain;

import java.util.Set;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class Book {
	@Id
	@GeneratedValue
	private Long id;
	private Long published;
	private String title;
	@Relationship(type = "APPEARS_IN", direction = Relationship.INCOMING)
	private Set characters;

	public Long getId() {
		return id;
	}

	public Long getPublished() {
		return published;
	}

	public String getTitle() {
		return title;
	}

	public Set getCharacters() {
		return characters;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setPublished(Long published) {
		this.published = published;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setCharacters(Set characters) {
		this.characters = characters;
	}
}
