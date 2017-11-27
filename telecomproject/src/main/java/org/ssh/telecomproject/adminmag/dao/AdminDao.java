package org.ssh.telecomproject.adminmag.dao;

import org.ssh.telecomproject.beans.AdminBean;
import org.ssh.telecomproject.pojos.PagerBean;

public interface AdminDao {
	/**
	 * 新增一个管理员
	 * @param admin
	 */
	public void saveAdminBean(AdminBean admin);
	/**
	 * 修改管理员
	 * @param id
	 */
	public void updateAdminBean(Long id);
	/**
	 * 查询管理员
	 * @param id
	 * @return
	 */
	public AdminBean getAdminBean(Long id);
	/**
	 * 删除管理员
	 * @param id
	 */
	public void deleteAdminBean(AdminBean admin);
	/**
	 * 分页查询管理员
	 * @param map
	 * @return
	 */
	public PagerBean findAdminBeanByMap(PagerBean page);
}
