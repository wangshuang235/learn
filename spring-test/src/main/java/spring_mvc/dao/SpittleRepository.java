package spring_mvc.dao;

import spring_mvc.entity.Spittle;

import java.util.List;

/*
 * @Author: cool
 * @Date: 2018/6/8 7:53
 */
public interface SpittleRepository {
    List<Spittle> findSpittles(long max, int count);
}
