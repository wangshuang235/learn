package cn.ws.redis;

import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class TestJedis {
    @Test
    public void testJedisSingle() {
        Jedis jedis = new Jedis("47.94.9.219", 6379);
        jedis.set("name", "wangshuang");
        String name = jedis.get("name");
        System.out.println(name);
        jedis.close();
    }

    @Test
    public void testJedisPool() {
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(30);
        config.setMaxIdle(10);

        JedisPool jedisPool = new JedisPool(config, "47.94.9.219", 6379);

        Jedis jedis = null;

        try {
            jedis = jedisPool.getResource();
            jedis.set("name", "lisi");
            String name = jedis.get("name");
            System.out.println(name);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (jedis != null) {
                jedis.close();
            }
            if (jedisPool != null) {
                jedisPool.close();            }
        }
    }
}
