package cn.ws.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by wangshuang on 17-7-20.
 */
public interface BaseDao<T> {
    void save(T t);
    void update(T t);
    T findById(Serializable id);
    List<T> getAll();
    List<T> getAll(String name);
    List<T> getAll(int index, int count);
}
