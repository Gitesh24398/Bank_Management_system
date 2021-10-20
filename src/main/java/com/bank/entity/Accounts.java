package com.bank.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="accounts")
public class Accounts {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="accountid")
	private int accountid;
	
	@Column(name="accountno")
	private String accountNumber;
	
	@Column(name="accounttype")
	private String accountType;
	
	@Column(name="nameOfBank")
	private String nameOfBank;
	
	@Column(name="balance")
	private int balance;
	
	@OneToOne(cascade = CascadeType.ALL)
	@Column(name="userid")
	private User userid;
	
	public Accounts() {}

	public Accounts(int accountid, String accountNumber, String accountType, String nameOfBank, int balance,
			User userid) {
		super();
		this.accountid = accountid;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.nameOfBank = nameOfBank;
		this.balance = balance;
		this.userid = userid;
	}

	public int getAccountid() {
		return accountid;
	}

	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getNameOfBank() {
		return nameOfBank;
	}

	public void setNameOfBank(String nameOfBank) {
		this.nameOfBank = nameOfBank;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public User getUserid() {
		return userid;
	}

	public void setUserid(User userid) {
		this.userid = userid;
	}

	@Override
	public String toString() {
		return "Accounts [accountid=" + accountid + ", accountNumber=" + accountNumber + ", accountType=" + accountType
				+ ", nameOfBank=" + nameOfBank + ", balance=" + balance + ", userid=" + userid + "]";
	}
	
	
	
	

}
