package org.ssh.telecomproject.zifuwumag.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.ssh.telecomproject.beans.AccountBean;
import org.ssh.telecomproject.zifuwumag.dao.IZifuwuDao;
import org.ssh.telecomproject.zifuwumag.service.IZifuwuService;
@Service
public class ZifuwuServiceImpl implements IZifuwuService {
	@Resource
	private IZifuwuDao ZifuwuDaoImpl;

	@Override
	public AccountBean getAccountByUserName(AccountBean account) {
		// TODO Auto-generated method stub
		return ZifuwuDaoImpl.getAccountById(account);
	}

	@Override
	public void updateAccountById(AccountBean account) {
		// TODO Auto-generated method stub
		ZifuwuDaoImpl.updateAccountById(account);
	}

}
