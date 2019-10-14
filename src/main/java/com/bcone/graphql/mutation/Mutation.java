package com.bcone.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLResolver;

public class Mutation implements GraphQLResolver {
    private PostDao postDao;
 
    public Post writePost(String postid,String title, String text, String category) {
        return postDao.savePost(postid,title, text, category);
    }
}
