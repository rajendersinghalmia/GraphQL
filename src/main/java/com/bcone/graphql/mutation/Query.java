package com.bcone.graphql.mutation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.coxautodev.graphql.tools.GraphQLResolver;

public class Query implements GraphQLResolver {
	@Autowired
    private PostDao postDao;
    public List<Post> getRecentPosts(int count, int offset) 
    {
        return postDao.getRecentPosts(count, offset);
    }
}
