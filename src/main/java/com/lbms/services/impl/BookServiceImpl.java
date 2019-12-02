package com.lbms.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lbms.dao.BookDao;
import com.lbms.models.BookMaster;
import com.lbms.services.BookService;

@Service("defaultBookService")
@Transactional
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDao bookDao;

	// @Override
	public void saveBook(BookMaster bookMaster) {
		bookDao.saveBook(bookMaster);
	}

	// @Override
	@Transactional
	public List<BookMaster> listBooks() {
		return this.bookDao.listBooks();
	}

	public BookMaster getBookByCode(String bookCode) {
		return this.bookDao.getBookByCode(bookCode);
	}

	/*
	 * public void updateBook(BookMaster bookMaster) { }
	 * 
	 * public void removeBook(Integer bookId) { }
	 */
}
