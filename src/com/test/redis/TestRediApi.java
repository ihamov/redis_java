package com.test.redis;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public class TestRediApi {
	@Test
	public void testPing(){
		Jedis jedis = new Jedis("192.168.64.128", 6379);
		System.out.println(jedis.ping());
		System.out.println(jedis.get("k1"));
	}
}
