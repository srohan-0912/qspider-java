package model;

public class student {
private int id;
private String name;
private int age;
private String gender;
private String mail;
private long phno;
private double fees;


static int baseId=101;


public student(int id, String name, int age, String gender, String mail, long phno, double fees) {
	super();
	this.id = ++baseId;
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.mail = mail;
	this.phno = phno;
	this.fees = fees;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
public long getPhno() {
	return phno;
}
public void setPhno(long phno) {
	this.phno = phno;
}
public double getFees() {
	return fees;
}
public void setFees(double fees) {
	this.fees = fees;
}
 

 
}

