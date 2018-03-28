package com.bxd.smsmanagement.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Description: TODO
 * Package: com.bxd.smsmanagement.redis
 *
 * @author Leeves
 * @date 2018-03-28
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {
    @Autowired

    StringRedisTemplate stringRedisTemplate;

    @Test
    public void redisTest() throws Exception {
        //保存字符串
        stringRedisTemplate.opsForValue().set("aaa", "2222288888");
        //读取字符串
        String aaa = stringRedisTemplate.opsForValue().get("aaa");
        System.out.println(aaa);
    }

}
