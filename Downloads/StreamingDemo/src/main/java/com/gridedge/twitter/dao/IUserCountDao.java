package com.gridedge.twitter.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gridedge.twitter.meta.TwitCount;
import com.gridedge.twitter.meta.UserCount;

public interface IUserCountDao extends MongoRepository<UserCount, String>{

}
