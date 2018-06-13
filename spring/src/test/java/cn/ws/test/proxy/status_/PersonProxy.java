package cn.ws.test.proxy.status_;

import cn.ws.test.proxy.PersonDao;

/*
 * @Author: cool
 * @Date: 2018/6/11 14:02
 */
public class PersonProxy implements PersonDao {

    private PersonDao personDao;

    public PersonProxy(PersonDao personDao) {
        this.personDao = personDao;
    }

    @Override
    public void save() {
        System.out.println("开启事物");
        personDao.save();
        System.out.println("提交事务");
    }
}
