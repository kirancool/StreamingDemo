package com.gridedge.twitter.dao;

import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.gridedge.twitter.meta.LocationCount;
import com.gridedge.twitter.meta.TwitCount;


public interface ITwitCountDao extends MongoRepository<TwitCount, String>{
	@Query(value="{ 'user_Id' : ?0 }")
	 public LocationCount findCountOnCountry(String user_Id, Sort sort);

}
