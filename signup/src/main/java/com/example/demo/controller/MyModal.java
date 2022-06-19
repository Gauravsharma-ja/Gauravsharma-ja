package com.example.demo.controller;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MyModal {

String email;
String pwd;
String Rpwd;
@Id
public int id;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public String getRpwd() {
	return Rpwd;
}
public void setRpwd(String rpwd) {
	Rpwd = rpwd;
}
@Override
public String toString() {
	return "MyModal [email=" + email + ", pwd=" + pwd + ", Rpwd=" + Rpwd + ", id=" + id + "]";
}





	
}
