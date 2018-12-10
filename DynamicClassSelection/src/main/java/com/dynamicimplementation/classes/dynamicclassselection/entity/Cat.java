package com.dynamicimplementation.classes.dynamicclassselection.entity;

import org.springframework.stereotype.Service;

@Service
public class Cat implements Animal {

	@Override
	public String noise() {
		// TODO Auto-generated method stub
		return "meow";
	}

}
