package cn.ws.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
 * @Author: cool
 * @Date: 2018/6/12 17:18
 */
@Repository
public interface UserDao extends JpaRepository<User, Long> {
    User findByName(String name);
}
