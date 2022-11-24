package com.sportyshoes1.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.HibernateTemplate;

import org.springframework.stereotype.Repository;

import com.sportyshoes1.model.Admin;

@Repository
public class AdminDAO {
	
	private HibernateTemplate hibernateTemplate;

	public AdminDAO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public AdminDAO(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public boolean verifyAdmin(Admin a) {
        Session session = hibernateTemplate.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        
        String hql = "from Admin where email=:email and password=:password";
        Query<Admin>query = session.createQuery(hql,Admin.class);
        query.setParameter("username", a.getUserName());
        query.setParameter("password", a.getPassword());
        List<Admin>results = query.getResultList();
        transaction.commit();
        session.close();
        return results.size()>0;    
    }
}


