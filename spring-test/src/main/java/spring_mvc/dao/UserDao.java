package spring_mvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring_mvc.entity.User;

/*
 * @Author: cool
 * @Date: 2018/6/12 17:18
 */
@Repository
public interface UserDao extends JpaRepository<User, Long> {
    User findByName(String name);
}
