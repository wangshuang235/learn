package cn.ws.h2;

import cn.ws.jpa.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * @Author: cool
 * @Date: 2018/6/12 13:05
 */
@Repository
public class UserDao {


    private JdbcOperations jdbcOperations;

    @Autowired
    public UserDao(JdbcOperations jdbcOperations) {
        this.jdbcOperations = jdbcOperations;
    }

    public void addUser(User user) {
        String sql = "insert into sys.sys_user values(?, ?)";
        jdbcOperations.update(sql, 2222, "lusha");
    }

    public String searchUserName(int id) {
        // 简单查询，按照ID查询，返回字符串
        String sql = "select name from sys.sys_user where id=?";
        // 返回类型为String(String.class)
        return jdbcOperations.queryForObject(sql, String.class, id);
    }



    public User findOne(long id) {
        String sql = "select * from sys.sys_user where id = ?";
        return jdbcOperations.queryForObject(sql, new UserRowMapper(), id);
    }

    private static final class UserRowMapper implements RowMapper<User> {

        @Override
        public User mapRow(ResultSet resultSet, int i) throws SQLException {
            return new User(
                    resultSet.getLong("id"),
                    resultSet.getString("name")
            );
        }

    }


}
