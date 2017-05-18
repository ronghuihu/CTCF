package com.tedu.service.serviceImpl;

import com.tedu.mapper.UserMapper;
import com.tedu.pojo.User;
import com.tedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.List;
import java.util.UUID;
import java.util.Date;

/**
 * Created by LYJ on 2017/3/19.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


	@Override
	public User findUserByUserId(String userId) {
		return userMapper.findUserByUserId(userId);
	}

	@Override
	public void addUser(User user) {
    	user.setUserId(UUID.randomUUID().toString());
    	user.setCreateTime(new Date());
    	user.setState(1);
		userMapper.addUser(user);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void updateUser(User user) {
		user.setUpdateTime(new Date());
		userMapper.updateUser(user);
	}

	@Override
	public String findPsdByUserId(String userId) {
		return userMapper.findPsdByUserId(userId);
	}

	@Override
	public void updatePsdByUserId(String newPsd, String userId) {
		userMapper.updatePsdByUserId(newPsd,userId);
	}

	@Override
	public List<User> findAll() {
		return userMapper.findAll();
	}

	@Override
	public void saveUser(User user) {
		user.setUserId(UUID.randomUUID().toString());
		user.setCreateTime(new Date());
		userMapper.saveUser(user);
	}

	@Override
	public void deleteUserByUserId(String userId) {
		userMapper.deleteUserByUserId(userId);
	}

	@Override
	public List<String> findRoleIdByUserId(String userId) {
		return userMapper.findRoleIdByUserId(userId);
	}

	@Override
	public void saveUserRole(String[] roleIds, String userId) {
		userMapper.deleteRoleIdByUserId(userId);
		for(String roleId:roleIds){
			userMapper.saveUserRole(roleId,userId);
		}
	}

	@Override
	public void changeState(Integer state, String[] userIds) {
		userMapper.changeState(state,userIds);
	}

	@Override
	public User findUserByUserName(String userName) {
		return userMapper.findUserByUserName(userName);
	}

	@Override
	public List<String> findModuleListByUserId(String userId) {
		return userMapper.findModuleListByUserId(userId);
	}
}
