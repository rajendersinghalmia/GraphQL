package com.bcone.graphql.mutation;

import org.springframework.beans.factory.annotation.Autowired;

import com.coxautodev.graphql.tools.GraphQLResolver;

public class PostResolver implements GraphQLResolver<Post> {
	@Autowired
    private AuthorDao authorDao;
 
    public Author getAuthor(Post post) {
        return authorDao.getAuthorById(post.getAuthorId());
    }
}
