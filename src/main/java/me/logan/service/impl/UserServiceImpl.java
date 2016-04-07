package me.logan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.logan.dao.UserMapper;
import me.logan.domain.User;
import me.logan.service.UserServiceI;

/**
 * @author L
 *	使用@Service注解将UserServiceImpl类标注为一个Service
 *	service的id是userService
 */
@Service("userService")
public class UserServiceImpl implements UserServiceI {

	/**
	 * 使用@Autowired注解标注userMapper变量，
	 * 当需要使用UserMapper时，Spring就会自动注入UserMapper
	 * @see me.logan.service.UserServiceI#addUser(me.logan.domain.User)
	 */
	@Autowired
	private UserMapper userMapper;
	@Override
	public void addUser(User user) {
		userMapper.insert(user);

	}

	@Override
	public User getUserById(String userId) {
		return userMapper.selectByPrimaryKey(userId);
	}

}
