package com.gridedge.twitter.dao;


import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.gridedge.twitter.meta.LocationCount;
import com.gridedge.twitter.meta.TwitterData;
import com.gridedge.twitter.meta.UserTweets;


public interface IUserTweetsDao extends MongoRepository<UserTweets, String> {

	@Query(value="{ 'user_Id' : ?0 }")
	public UserTweets getOneById(String user_Id, Sort sort);
				
}
