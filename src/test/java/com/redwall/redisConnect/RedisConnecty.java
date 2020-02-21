package com.redwall.redisConnect;

import org.junit.Test;
import redis.clients.jedis.Jedis;

public class RedisConnecty {

    @Test
    public void test(){
        Jedis jedis = new Jedis("192.168.29.128",6379);
        String s = jedis.get("foo");
        System.out.println(s);
    }

    @Test
    public void test1(){
        System.out.println(System.getenv("ldc"));
        System.out.println(System.getenv("VBOX_INSTALL_PATH"));
    }

}
