
package com.gridedge.twitter.services;


import static org.springframework.data.mongodb.core.aggregation.Aggregation.newAggregation;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;



import static org.springframework.data.mongodb.core.aggregation.Aggregation.sort;

import com.gridedge.twitter.dao.ILocationCountDao;
import com.gridedge.twitter.dao.ITwitCountDao;
import com.gridedge.twitter.dao.IUserTweetsDao;
import com.gridedge.twitter.meta.LocationCount;
import com.gridedge.twitter.meta.TwitCount;
import com.gridedge.twitter.meta.UserTweets;



@Service
public class TwitterServiceImpl{


	@Autowired
	ILocationCountDao iLocationCountDao;
	@Autowired
	ITwitCountDao iTwitCountDao;

	@Autowired
	IUserTweetsDao iUserTweetsDao;
	@Autowired
	MongoTemplate mongoTemplate;
	
	public List<UserTweets> findAll()
	{
		return iUserTweetsDao.findAll();
	}
	public List<LocationCount> findAll1()
	{
		return iLocationCountDao.findAll();
	}
	public List<TwitCount> findAll2()
	{
		return iTwitCountDao.findAll();
	}
	
	
	public List<UserTweets> findCountOnUser(){
		List<UserTweets> s=iUserTweetsDao.findAll();
		Aggregation agg = newAggregation(
				
				sort(Sort.Direction.DESC, "count"));
		AggregationResults<UserTweets> results
		= mongoTemplate.aggregate(agg, "userTweets", UserTweets.class);
	List<UserTweets> result = results.getMappedResults();
           Query query=new Query();
		query.limit(5).with(new Sort(Sort.Direction.DESC, "count"));
	List<UserTweets> user=mongoTemplate.find(query, UserTweets.class);	
	return user;
	}
	public List<LocationCount> findCountOnCountry(){
		List<LocationCount> ss=iLocationCountDao.findAll();
		Aggregation agg = newAggregation(
				
				sort(Sort.Direction.DESC, "count"));
		AggregationResults<LocationCount> results
		= mongoTemplate.aggregate(agg, "countryTweets", LocationCount.class);
	List<LocationCount> result = results.getMappedResults();
	   Query query=new Query();
		
		query.limit(5).with(new Sort(Sort.Direction.DESC, "count"));
		List<LocationCount> userr=mongoTemplate.find(query, LocationCount.class);	
	return userr;
	}
	public List<TwitCount> findCountOnretweet(){
		List<TwitCount> sss=iTwitCountDao.findAll();
		Aggregation agg = newAggregation(
				
				sort(Sort.Direction.DESC, "count"));
		AggregationResults<TwitCount> results
		= mongoTemplate.aggregate(agg, "reTweets", TwitCount.class);
	List<TwitCount> result = results.getMappedResults();
	   Query query=new Query();
		
		query.limit(5).with(new Sort(Sort.Direction.DESC, "retweet"));
		List<TwitCount> user1=mongoTemplate.find(query, TwitCount.class);	
	return user1;
	}
}
