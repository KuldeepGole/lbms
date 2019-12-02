package com.lbms.dao;

import java.util.List;
import com.lbms.models.BookMaster;

public interface BookDao {
	public void saveBook(BookMaster bookMaster);
	
	public BookMaster getBookByCode(String bookCode);
	public List<BookMaster> listBooks();
	//public void updateBook(BookMaster bookMaster);
	//public void removeBook(Integer bookId);
}
