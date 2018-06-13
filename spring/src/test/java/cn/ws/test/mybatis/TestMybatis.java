package cn.ws.test.mybatis;

import cn.ws.dao.DaoConfig;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/*
 * @Author: cool
 * @Date: 2018/6/11 23:57
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DaoConfig.class)
public class TestMybatis {
    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Test
    public void testFind() {
        SqlSession session = sqlSessionFactory.openSession();
        Object employee = session.selectOne("EmployeeMapper.selectEmployee", 1);
        System.out.println(employee);
    }
}
