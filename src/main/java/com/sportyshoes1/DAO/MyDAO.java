package com.sportyshoes1.DAO;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.HibernateTemplate;

import org.springframework.stereotype.Repository;

import com.sportyshoes1.model.Admin;

//@SuppressWarnings("deprecation")
@Repository
public class MyDAO {
	
	private HibernateTemplate hibernateTemplate;

	public MyDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyDAO(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public boolean forgotPassword(String email,String password,String username) {
        Session session = hibernateTemplate.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();  
       @SuppressWarnings("unchecked")
        Query<Admin> q = session.createQuery("update Admin set password=:p where email=:e");  
        q.setParameter("e",email);  
        q.setParameter("p",password);  
          
        int status = q.executeUpdate();  
        System.out.println(status);  
        transaction.commit();  
        return status>0?true:false;
    }

}
