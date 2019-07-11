package com.psl;

public class Employee {
String id,firstName,lastName,sal,email;

@Override
public String toString() {
	return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", sal=" + sal + ", email="
			+ email + "]";
}

public Employee(String id, String firstName, String lastName, String sal, String email) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.sal = sal;
	this.email = email;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getSal() {
	return sal;
}

public void setSal(String sal) {
	this.sal = sal;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

}
