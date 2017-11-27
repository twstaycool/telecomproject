package org.ssh.telecomproject.aspects;

import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;

public class loginAspectJ {
	
	@AfterReturning(value="execution(* org.ssh.telecomproject.usermag.service.impl.*ServiceImpl.*(..))")
	public void beforeAdvice(JoinPoint jp) {
		
		Date loginTime = new Date();
	}
}
