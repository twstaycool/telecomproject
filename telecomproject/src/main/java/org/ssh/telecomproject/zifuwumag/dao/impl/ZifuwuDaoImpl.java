package org.ssh.telecomproject.zifuwumag.dao.impl;

import org.springframework.stereotype.Repository;
import org.ssh.telecomproject.BaseDao;
import org.ssh.telecomproject.beans.AccountBean;
import org.ssh.telecomproject.zifuwumag.dao.IZifuwuDao;
@Repository
public class ZifuwuDaoImpl extends BaseDao implements IZifuwuDao {

	@Override
	public AccountBean getAccountById(AccountBean account) {
		// TODO Auto-generated method stub
		return (AccountBean)getSession().get(AccountBean.class, account.getId());
	}

	@Override
	public void updateAccountById(AccountBean account) {
		// TODO Auto-generated method stub
		getSession().update(account.getId());
	}

}
