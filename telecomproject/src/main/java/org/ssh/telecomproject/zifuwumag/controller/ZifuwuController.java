package org.ssh.telecomproject.zifuwumag.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.ssh.telecomproject.beans.AccountBean;
import org.ssh.telecomproject.zifuwumag.service.IZifuwuService;

@RestController
@RequestMapping("/account")
public class ZifuwuController {
	private Logger log = Logger.getLogger(this.getClass());
	@Resource
	private IZifuwuService ZifuwuServiceImpl;
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET,produces= {"application/json;charset=utf-8"})
	public AccountBean getAccountBeanById(AccountBean account) {
		try {
			account = ZifuwuServiceImpl.getAccountByUserName(account);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return account;
	}
}
