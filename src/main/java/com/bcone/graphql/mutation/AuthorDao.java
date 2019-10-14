package com.bcone.graphql.mutation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class AuthorDao 
{
	List<Author> AuthorRepo = new ArrayList<Author>();

	public AuthorDao() {
		super();
		AuthorRepo.add(new Author("1", "Aakash"));
		AuthorRepo.add(new Author("2", "Ravi"));
	}
	Author	getAuthorById(String id) 
	{
		Author authorResult =new Author();
		for(Author author : AuthorRepo) 
		{
			if(author.getAuthorId().equalsIgnoreCase(id)) 
			{
				authorResult= author;
				break;
			}
		}
	return authorResult;
	}
	

}
