package com.silvergoni.springdatatest.redis;

import org.junit.After;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.redis.DataRedisTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
/**
 * SpringDataRedisTest
 *
 * @since 2021. 01. 31.
 */
@RunWith(SpringRunner.class)
@DataRedisTest
public class SpringDataRedisTest {

	@Autowired
	private RedisTemplate redisTemplate;

	@Test
	public void 테스트() {
		//given
		redisTemplate.opsForValue().set("silvergoni", "tistory");

		//when
		String ret = (String)redisTemplate.opsForValue().get("silvergoni");

		//then
		assertThat(ret).isEqualTo("tistory");
	}

	@After
	public void after() {
		redisTemplate.delete("silvergoni");
	}
}
