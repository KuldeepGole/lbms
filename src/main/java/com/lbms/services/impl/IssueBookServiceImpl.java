package com.lbms.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lbms.dao.IssueBookDao;
import com.lbms.models.IssueBookMaster;
import com.lbms.services.IssueBookService;

@Service("defaultIssueBookService")
@Transactional
public class IssueBookServiceImpl implements IssueBookService {
	
	@Autowired
	private IssueBookDao issueBookDao;
	
	public void saveIssueBook(IssueBookMaster issueBookMaster) {
		issueBookDao.saveIssueBook(issueBookMaster);
	}
}
