package org.ssh.telecomproject.usermag.service;

import org.ssh.telecomproject.beans.AccountBean;

public interface UserService {
	/**
	 * 用户登录
	 * @return
	 */
	public AccountBean loginByUser(String userName,String pwd);
}
