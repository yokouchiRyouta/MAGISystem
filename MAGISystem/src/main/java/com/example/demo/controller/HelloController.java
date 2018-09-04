package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/")
	public String firstView(Model model) {
		model.addAttribute("hello", "ごはんが美味しい季節です");
		model.addAttribute("gmsg1", "グローバルメッセージ1");
		model.addAttribute("gmsg2", "グローバルメッセージ2");
		model.addAttribute("gmsg3", "グローバルメッセージ3");

		return "layout";
	}
}