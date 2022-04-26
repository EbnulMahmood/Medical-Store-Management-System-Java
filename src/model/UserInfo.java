package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

public class UserInfo extends User {
	private StringProperty firstName;
	private StringProperty lastName;
	private StringProperty email;
	private StringProperty bloodgroup;
	private IntegerProperty age;
	public UserInfo() {}
	public UserInfo(StringProperty firstName, StringProperty lastName, StringProperty email, StringProperty bloodgroup,
			IntegerProperty age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.bloodgroup = bloodgroup;
		this.age = age;
	}
	public StringProperty getFirstName() {
		return firstName;
	}
	public void setFirstName(StringProperty firstName) {
		this.firstName = firstName;
	}
	public StringProperty getLastName() {
		return lastName;
	}
	public void setLastName(StringProperty lastName) {
		this.lastName = lastName;
	}
	public StringProperty getEmail() {
		return email;
	}
	public void setEmail(StringProperty email) {
		this.email = email;
	}
	public StringProperty getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(StringProperty bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public IntegerProperty getAge() {
		return age;
	}
	public void setAge(IntegerProperty age) {
		this.age = age;
	}
	@Override
	public void setUserName(StringProperty userName) {
		super.setUserName(userName);
	}
	@Override
	public void setPassWord(StringProperty passWord) {
		super.setPassWord(passWord);
	}
}
