package com.bcone.graphql.mutation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class PostDao {
	

	List<Post> postRepo = new ArrayList<Post>();
	
	public PostDao() {
		super();
		postRepo.add(new Post("1", "Post-1", "News", "1"));
		postRepo.add(new Post("2", "Post-2", "News", "1"));
		postRepo.add(new Post("3", "Post-3", "Market", "2"));
		postRepo.add(new Post("4", "Post-4", "Market", "2"));
	}
	
	Post savePost(String postid ,String title,String text, String category)
	{
		Post post = new Post(postid, title, text,category);
		postRepo.add(post);
		return post;
	}

	List<Post> getRecentPosts(int count, int offset)
	{
		List<Post> postRepoForOffser= new ArrayList<Post>();
		int i=0;
		for(Post post : postRepo) 
		{
			if(i+1>=offset && i <= offset+count) 
			{
				postRepoForOffser.add(post);
				
			}
			i++;
		}
		return postRepoForOffser;
	}

}
