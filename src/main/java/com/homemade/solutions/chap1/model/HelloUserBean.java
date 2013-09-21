package com.homemade.solutions.chap1.model;

import javax.ejb.Stateless;

@Stateless
public class HelloUserBean implements HelloUser {
	public String sayHello(String name) {
		return "Hello " + name + " welcome to EJB 3 In Action!";
	}
}