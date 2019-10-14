package com.bcone.graphql.mutation;

public class Author {
	String authorId,name;
	
	public Author() {
	}
	public Author(String authorId, String name) {
		super();
		this.authorId = authorId;
		this.name = name;
	}

	public String getAuthorId() {
		return authorId;
	}

	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



}
