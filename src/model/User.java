package model;

import javafx.beans.property.StringProperty;

public class User {
	private StringProperty userName;
	private StringProperty passWord;
	public User() {}
	
	public User(StringProperty userName, StringProperty passWord) {
		super();
		this.userName = userName;
		this.passWord = passWord;
	}

	public void setUserName(StringProperty userName) {
		this.userName = userName;
	}
	public StringProperty getUserName() {
		return userName;
	}
	public void setPassWord(StringProperty passWord) {
		this.passWord = passWord;
	}
	public StringProperty getPassWord() {
		return passWord;
	}
}
