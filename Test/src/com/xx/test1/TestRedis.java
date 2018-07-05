package com.xx.test1;

import java.util.List;

import redis.clients.jedis.Jedis;

public class TestRedis {
  public static void main(String[] args){
	  Jedis jedis =new Jedis("127.0.0.1");
	  System.out.println("连接成功");
      //查看服务是否运行
      System.out.println("服务正在运行: "+jedis.ping());
      List<String> list = jedis.lrange("list", 0, 4);
      System.out.println("list "+list);
     // jedis.set("xx", "Hello");
      String xx = jedis.get("xx");
      System.out.println("xx"+xx);
      
  }
}
