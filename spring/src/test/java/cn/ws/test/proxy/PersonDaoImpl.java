package cn.ws.test.proxy;

/*
 * @Author: cool
 * @Date: 2018/6/11 14:00
 */
public class PersonDaoImpl implements PersonDao {

    @Override
    public void save() {
        System.out.println("save");
    }
}
