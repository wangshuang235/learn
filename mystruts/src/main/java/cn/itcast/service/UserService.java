package cn.itcast.service;

import cn.itcast.dao.UserDao;
import cn.itcast.entity.User;


public class UserService {
	
	private UserDao ud = new UserDao();

	// ģ���½
	public User login(User user){
		return ud.login(user);
	}
	
	// ģ��ע��
	public void register(User user) {
		ud.register(user);
	}
}
