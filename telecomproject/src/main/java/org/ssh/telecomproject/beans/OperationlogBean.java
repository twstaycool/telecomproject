package org.ssh.telecomproject.beans;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


/**
 * 操作日志
 * @author 😘
 *
 */
@Entity
@Table(name="t_operationlog")
public class OperationlogBean {
	@Id
	@GenericGenerator(name="hibernate.identity",strategy="identity")
	@GeneratedValue(generator="hibernate.identity")
	private Long id;//操作日志id
	@Column(name="operation_type")
	private Integer operationType;//操作类型
	@Column(name="param",length=20)
	private String patam;//方法参数
	@Column(name="method",length=20)
	private String method;//方法名
	@Column(name="time")
	private Date dateTime;//操作时间
	@Column(name="classpath",length=20)
	private String classPath;//方法属于哪个类
	/*@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="fk_account_id")
	private AccountBean account;//账务账号ID
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="fk_admin_id")
	private AdminBean admin;//管理员ID
*/	@Column(name="pid")
	private Integer pid;//逻辑事务
	@Column(name="resulttype",length=20)
	private String resultType;//返回结果类型
	
	public OperationlogBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
