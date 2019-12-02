package com.lbms.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.lbms.dao.BookDao;
import com.lbms.models.BookMaster;

@Repository("defaultBookDao")
public class BookDaoImpl implements BookDao {
	private static final Logger logger = LoggerFactory.getLogger(BookDaoImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	// @Override
	public void saveBook(BookMaster bookMaster) {
		this.sessionFactory.getCurrentSession().save(bookMaster);
	}

	@SuppressWarnings("unchecked")
	// @Override
	public List<BookMaster> listBooks() {
		Session session = this.sessionFactory.getCurrentSession();
		List<BookMaster> bookList = session.createQuery("from BookMaster").list();
		for (BookMaster bookMaster : bookList)
			logger.info("Person List::" + bookMaster);
		return bookList;
	}

	public BookMaster getBookByCode(String bookCode) {
		Session session = this.sessionFactory.getCurrentSession();
		BookMaster bookMaster = (BookMaster) session.load(BookMaster.class, new String(bookCode));
		logger.info("Person loaded successfully, Book details=" + bookMaster);
		return bookMaster;
	}

	// public void updateBook(BookMaster bookMaster) {
	// }

	// public void removeBook(Integer bookId) {
	// }

}
