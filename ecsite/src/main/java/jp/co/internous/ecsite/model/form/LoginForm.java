package jp.co.internous.ecsite.model.form;

import java.io.Serializable;

public class LoginForm implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String userName;
	private String password;
	
	//ユーザー名
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	//パスワード
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
}
