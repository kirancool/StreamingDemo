package com.gridedge.twitter.kafka;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;

import com.mongodb.MongoClient;

public class MongoData 
{
    static Gson gson=new GsonBuilder().create();
    static List<String> user_count_list = new ArrayList<String>(); 
    static List<String> country_count_list = new ArrayList<String>();
    static List<String> retweet_count_list = new ArrayList<String>();
    static int count=0;
    static int ctyCount=0;
    static int retweets=0;
    static Map<String, Object> userDocument = new HashMap<String, Object>();
    static BasicDBObject mongoObj = new BasicDBObject();
    static BasicDBObject locCountObj = new BasicDBObject();
    static BasicDBObject reCountObj = new BasicDBObject();
    static BasicDBObject whereQuery = new BasicDBObject();
    
    
    static MongoClient mongo=new MongoClient("localhost:27017");
    static DB db=mongo.getDB("Twitter");
    static DBCollection collection = db.getCollection("userTweets");
    static DBCollection countryCollection = db.getCollection("countryTweets");
    static DBCollection retweetCollection = db.getCollection("reTweets");
    
    public static String getData(String jsonData)
    {   
        
    	reCountObj = new BasicDBObject();
        JsonObject job = new JsonParser().parse(jsonData).getAsJsonObject(); 
        String tweet_id = job.getAsJsonObject().get("user").getAsJsonObject().get("id_str").toString();
        String location = job.getAsJsonObject().get("user").getAsJsonObject().get("location").toString();
        String user_name = job.getAsJsonObject().get("user").getAsJsonObject().get("name").toString();
        String retweet = job.getAsJsonObject().get("retweet_count").toString();
        
        String user_id=tweet_id.replace("\"","");
        String name=user_name.replace("\"","");
        String loc=location.replace("\"","");
        
        String rt=retweet.replace("\"","");
        
        String str = user_id.toString();
        StringBuilder sb = new StringBuilder();
        user_count_list.add(user_id);
        country_count_list.add(loc);
        retweet_count_list.add(rt);
        count = Collections.frequency(user_count_list, user_id);
        ctyCount = Collections.frequency(country_count_list, loc);
        retweets=Collections.frequency(retweet_count_list, rt);
        	mongoObj.put("user_Id", user_id);
        	mongoObj.put("name", name);
        	if(count == 1)
            {
        		mongoObj.put("count", count);
        		collection.insert(new BasicDBObject(mongoObj));
            }
        	else
        	{
        		BasicDBObject whereQuery = new BasicDBObject().append("$set", 
            		    new BasicDBObject().append("count", count));
            	collection.update(new BasicDBObject().append("user_Id", user_id), whereQuery);
        	}
            //Location basis count.
        	locCountObj.put("country", loc);
        	if(ctyCount == 1)
        	{
        		locCountObj.put("count", ctyCount);
        		countryCollection.insert(new BasicDBObject(locCountObj));
        	}
        	else
        	{
        		BasicDBObject countryWhereQuery = new BasicDBObject().append("$set", 
            		    new BasicDBObject().append("count", ctyCount));
        		countryCollection.update(new BasicDBObject().append("country", loc), countryWhereQuery);
        	}
        	/*******retweet*/
        	reCountObj.put("user_Id", user_id);
        	reCountObj.put("retweet", retweets);
        	retweetCollection.insert(reCountObj);
        	BasicDBObject retweetWhereQuery = new BasicDBObject().append("$set",new BasicDBObject().append("retweet", retweets));
        	retweetCollection.update(new BasicDBObject().append("user_Id", user_id),retweetWhereQuery);
        /*	if(retweets == 1)
        	{
        		reCountObj.put("retweets", retweets);
        		retweetCollection.insert(new BasicDBObject(reCountObj));
        	}
        	else
        	{*/
        		/*BasicDBObject retweetWhereQuery = new BasicDBObject().append("$set", 
            		    new BasicDBObject().append("retweets", reCountObj));*/
        	/*BasicDBObject retweetWhereQuery = new BasicDBObject().append("$set",new BasicDBObject().append("retweets", retweets));
        	retweetCollection.update(new BasicDBObject().append("user_Id", user_id), retweetWhereQuery);*/
        	//}
                return str;
    }

	}