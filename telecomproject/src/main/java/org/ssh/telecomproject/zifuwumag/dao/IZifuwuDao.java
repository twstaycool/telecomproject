package org.ssh.telecomproject.zifuwumag.dao;

import org.ssh.telecomproject.beans.AccountBean;

public interface IZifuwuDao {
	/**
	 *用户查看自己信息
	 * @param userName
	 * @return
	 */
	public AccountBean getAccountById(AccountBean account);
	/**
	 * 用户修改信息
	 * @param userName
	 */
	public void updateAccountById(AccountBean account);
}
