package cn.springmvc.dao;

import cn.springmvc.model.User;

public interface UserDAO {
	/**
	 * �����û�id��ѯ�û���Ϣ
	 * @param id
	 * @return
	 */
	public User getUserById(long id);
}
