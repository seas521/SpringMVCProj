package cn.springmvc.dao;

import cn.springmvc.model.User;

public interface UserDAO {
	/**
	 * 根据用户id查询用户信息
	 * @param id
	 * @return
	 */
	public User getUserById(long id);
}
