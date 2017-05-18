package com.tedu.service;

import com.tedu.pojo.User;

import java.util.List;

/**
 * Created by LYJ on 2017/3/19.
 */
public interface UserService {
	/**
	 * 通过用户ID查找用户
	 * @param userId 用户ID
	 * @return 用户信息
	 */
	User findUserByUserId(String userId);

	/**
	 * 更新用户
	 * @param user 已修改的用户版本
	 */
	void updateUser(User user);

	/**
	 * 通过用户ID查看用户密码
	 * @param userId 用户ID
	 * @return 用户密码
	 */
	String findPsdByUserId(String userId);

	/**
	 * 通过用户ID修改用户密码
	 * @param newPsd 新密码
	 * @param userId 用户
	 */
	void updatePsdByUserId(String newPsd, String userId);

	public void addUser(User user);

    public User findUserByUserName(String userName);
	/**
	 * 查找所有用户
	 * @return 所有用户的集合
	 */
	List<User> findAll();

	/**
	 * 保存新用户
	 * @param user 新用户
	 */
	void saveUser(User user);

	/**
	 * 通过用户ID删除指定用户
	 * @param userId 用户ID
	 */
	void deleteUserByUserId(String userId);

	/**
	 * 通过用户ID查找用户所有角色ID
	 * @param userId 用户ID
	 * @return 该用户所有角色ID
	 */
	List<String> findRoleIdByUserId(String userId);

	/**
	 * 保存用户所有角色ID
	 * @param roleIds 角色Id集合
	 * @param userId 用户
	 */
	void saveUserRole(String[] roleIds,String userId);

	/**
	 * 修改指定用户的启用状态
	 * @param state 启用状态
	 * @param userId 用户ID
	 */
	void changeState(Integer state,String[] userIds);

    List<String> findModuleListByUserId(String userId);

}
