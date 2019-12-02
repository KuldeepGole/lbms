package com.lbms.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lbms.dao.IssueBookDao;
import com.lbms.models.IssueBookMaster;

@Repository("defaultIssueBookDao")
public class IssueBookDaoImpl implements IssueBookDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public void saveIssueBook(IssueBookMaster issueBookMaster) {
		this.sessionFactory.getCurrentSession().save(issueBookMaster);
	}
}
