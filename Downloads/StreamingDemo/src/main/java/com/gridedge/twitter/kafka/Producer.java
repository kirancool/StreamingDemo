package com.gridedge.twitter.kafka;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import org.apache.kafka.clients.producer.ProducerRecord;
import org.spark_project.guava.collect.Lists;

import org.apache.kafka.clients.producer.KafkaProducer;

import com.twitter.hbc.ClientBuilder;
import com.twitter.hbc.core.Client;
import com.twitter.hbc.core.Constants;
import com.twitter.hbc.core.endpoint.StatusesFilterEndpoint;
import com.twitter.hbc.core.processor.StringDelimitedProcessor;
import com.twitter.hbc.httpclient.auth.Authentication;
import com.twitter.hbc.httpclient.auth.OAuth1;
public class Producer {
			
	
	private static final String topic = "data";

	
	public static void run(String consumerKey, String consumerSecret,
			String token, String secret) throws InterruptedException, IOException {

		Properties properties = new Properties();
		properties.put("bootstrap.servers", "localhost:9092");
		properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		properties.put("client.id", "camus");
		
		
		KafkaProducer<String, String> producer = new KafkaProducer <String , String>(properties);
			
		BlockingQueue<String> queue = new LinkedBlockingQueue<String>(10000);
		StatusesFilterEndpoint endpoint = new StatusesFilterEndpoint();
		
		endpoint.trackTerms(Lists.newArrayList("twitterapi",
				"#Travel"));

		Authentication auth = new OAuth1(consumerKey, consumerSecret, token,
				secret);
				Client client = new ClientBuilder().hosts(Constants.STREAM_HOST)
				.endpoint(endpoint).authentication(auth)
				.processor(new StringDelimitedProcessor(queue)).build();

		client.connect();

		
		for (int msgRead = 0; msgRead >= 0; msgRead++) {
			ProducerRecord<String, String> message = null;
			try {
				message = new ProducerRecord<String, String>(topic, queue.take());
			     // System.out.println(message);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			producer.send(message);
			
		
			
		}
		producer.close();
		client.stop();
	}	
	public static void main(String args[])
	{

	try {
		
		Producer.run("aNPb8I5K38fcqwTfsLnWmEt3T", "QdHNj9ZqYO8nm0qrK8PRh5IZu7zmXR1lwD2zDugoYCJ7JnpItN", "448151930-gdKcYgCFuWAmAelnvxI9DX3u0Y9nEPGDeU3QtN1B", "up63kCzrpdn6wKdL1LBS4M40TiCJMSiDXJNrUUEdForIP");
	
	} catch (InterruptedException | IOException e) {
		
		e.printStackTrace();
	}

    }
}