package com.wipro.dao;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wipro.model.StaffBean;



@Repository("studentdao")
public class StudentDao {
	
@Autowired
SessionFactory factory;

@Transactional
public StaffBean doLogin(String id,String passwd)
{
	Session session=factory.getCurrentSession();
	StaffBean login =(StaffBean) session.get(StaffBean.class, id);
	if(login != null && login.getPasswd().equals(passwd))
		return login;
	return null;
}
@Transactional 
public String doRegister(StaffBean bean)
{
	factory.getCurrentSession().save(bean);
	return "studentdetails";
}
}
