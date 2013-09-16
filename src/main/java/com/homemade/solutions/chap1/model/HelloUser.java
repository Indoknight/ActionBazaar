package com.homemade.solutions.chap1.model;

import javax.ejb.Remote;


@Remote
public interface HelloUser {
	public void sayHello(String name);
}