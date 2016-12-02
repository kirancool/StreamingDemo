package com.gridedge.twitter.dao;

import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.gridedge.twitter.meta.LocationCount;
import com.gridedge.twitter.meta.TwitCount;
import com.gridedge.twitter.meta.TwitterData;



	public interface ILocationCountDao extends MongoRepository<LocationCount, String> {
		@Query(value="{ 'country' : ?0 }")
		 public LocationCount findCountOnCountry(String country, Sort sort);

	}
