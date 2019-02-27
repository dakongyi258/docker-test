package com.example.fn.dockertest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.fn.dockertest.service.CalculateService;

@RestController
@RequestMapping("/math")
public class CalculateController {
	@Autowired
	private CalculateService calculateService;

	@RequestMapping("/cal/{x}/{operate}/{y}")
	public int cal(@PathVariable int x, @PathVariable String operate, @PathVariable int y) {
		System.out.println("Provider1 提供服务...........................................");
		return calculateService.cal(x, y, operate);
	}

	@RequestMapping(value = "/say/{name}", method = RequestMethod.GET)
	public String say(@PathVariable String name) {
		System.out.println("Provider1 提供服务...........................................");
		return "hello " + name;
	}
}