package com.ralitzaraynova.template.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/template")
public class templateController {
	
	@RequestMapping("/new")
	public String template () {
		return "layout/Layout";
	}
}
