package com.xx.test1;

import java.util.List;

import redis.clients.jedis.Jedis;

public class TestRedis {
  public static void main(String[] args){
	  Jedis jedis =new Jedis("127.0.0.1");
	  System.out.println("���ӳɹ�");
      //�鿴�����Ƿ�����
      System.out.println("������������: "+jedis.ping());
      List<String> list = jedis.lrange("list", 0, 4);
      System.out.println("list "+list);
     // jedis.set("xx", "Hello");
      String xx = jedis.get("xx");
      System.out.println("xx"+xx);
      
  }
}
