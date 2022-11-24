package com.sportyshoes1.DAO;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.sportyshoes1.model.PurchaseReport;

@Repository
public class PurchaseReportDAO {
	
	private HibernateTemplate hibernateTemplate;

	public PurchaseReportDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PurchaseReportDAO(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@SuppressWarnings("deprecation")
    public List<PurchaseReport>getReport(){
        
        @SuppressWarnings("unchecked")
        List<PurchaseReport>report = (List<PurchaseReport>) hibernateTemplate.find("from PurchaseReport order by reportProductName,reportDate");
        
        return report;
    }

}
