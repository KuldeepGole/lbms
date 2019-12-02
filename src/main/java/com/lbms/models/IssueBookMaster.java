package com.lbms.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bookissue_mst")
public class IssueBookMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer issueBookId;
	private String issBookCode;
	private String issStuName;
	private String issStuRollNo;
	private String issStuContact;

	public Integer getIssueBookId() {
		return issueBookId;
	}

	public void setIssueBookId(Integer issueBookId) {
		this.issueBookId = issueBookId;
	}

	public String getIssBookCode() {
		return issBookCode;
	}

	public void setIssBookCode(String issBookCode) {
		this.issBookCode = issBookCode;
	}

	public String getIssStuName() {
		return issStuName;
	}

	public void setIssStuName(String issStuName) {
		this.issStuName = issStuName;
	}

	public String getIssStuRollNo() {
		return issStuRollNo;
	}

	public void setIssStuRollNo(String issStuRollNo) {
		this.issStuRollNo = issStuRollNo;
	}

	public String getIssStuContact() {
		return issStuContact;
	}

	public void setIssStuContact(String issStuContact) {
		this.issStuContact = issStuContact;
	}
}
