package com.dynamicimplementation.classes.dynamicclassselection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dynamicimplementation.classes.dynamicclassselection.entity.Animal;

@RestController
@RequestMapping("/classes/test")
public class ClassController {

	@Autowired
	ApplicationContext applicationContext;

	Animal animal;

	@GetMapping("/path/{type}")
	public String test(@PathVariable("type") String type) {
		animal = applicationContext.getBean(type, Animal.class);
		return animal.noise();
	}

}
