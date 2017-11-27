package org.ssh.telecomproject.zifuwumag.service;

import org.ssh.telecomproject.beans.AccountBean;

public interface IZifuwuService {
	/**
	 *用户查看自己信息
	 * @param userName
	 * @return
	 */
	public AccountBean getAccountByUserName(AccountBean account);
	/**
	 * 用户修改信息
	 * @param userName
	 */
	public void updateAccountById(AccountBean account);
}
