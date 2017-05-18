package com.tedu.mapper;

import com.tedu.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

import java.util.List;

/**
 * Created by LYJ on 2017/3/19.
 */
public interface UserMapper {
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
	@Select("SELECT password FROM uer_p WHERE user_id=#{userId}")
	String findPsdByUserId(String userId);

	/**
	 * 通过用户ID修改用户密码
	 * @param newPsd 新密码
	 * @param userId 用户
	 */
	@Update("UPDATE user_p SET password=#{newPsd} WHERE user_id=#{userId}" )
	void updatePsdByUserId(@Param("newPsd") String newPsd, @Param("userId") String userId);

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
	@Delete("DELETE FROM user_p WHERE user_id=#{userId}")
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
	@Insert("INSERT INTO role_user_p VALUES(#{roleId},#{userId})")
	void saveUserRole(@Param("roleId") String roleId,@Param("userId") String userId);

	/**
	 * 修改指定用户的启用状态
	 * @param state 启用状态
	 * @param userId 用户ID
	 */
	void changeState(@Param("state") Integer state,@Param("userIds") String[] userIds);

    public User findUserByUserName(String userName);

	public void addUser(User user);

	@Delete("DELETE FROM role_user_p WHERE user_id=#{userId}")
	public void deleteRoleIdByUserId(String userId);

    List<String> findModuleListByUserId(String userId);

}
