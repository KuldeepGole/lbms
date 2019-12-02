package com.lbms.services;

import java.util.List;

import com.lbms.models.BookMaster;

public interface BookService {
	public void saveBook(BookMaster bookMaster);
	
	public List<BookMaster> listBooks();
	public BookMaster getBookByCode(String bookCode);
	//public void updateBook(BookMaster bookMaster);
	//public void removeBook(Integer bookId);
}
