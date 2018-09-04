package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.domain.Magi;
import com.example.demo.domain.Orders;

@Controller
@RequestMapping("/")
public class IndexController {
	private static Logger logger = LoggerFactory.getLogger(IndexController.class);

	@RequestMapping(value = "content1", method = RequestMethod.GET)
	public String content1(Model model) {
		logger.debug("IndexController:[content1] Passing through...");
		model.addAttribute("gmsg1", "グローバルメッセージ1");
		model.addAttribute("gmsg2", "グローバルメッセージ2");
		model.addAttribute("gmsg3", "グローバルメッセージ3");

		model.addAttribute("msg1", "メッセージ1");
		model.addAttribute("msg2", "メッセージ2");
		model.addAttribute("msg3", "メッセージ3");

		List<Orders> list = new ArrayList<>();

		Orders order1 = new Orders();
		order1.setId("1");
		order1.setOrderNumber(10100L);
		order1.setStatus("Shipped");
		order1.setComments(null);
		order1.setCustomerNumber(363L);
		list.add(order1);

		Orders order2 = new Orders();
		order2.setId("2");
		order2.setOrderNumber(10101L);
		order2.setStatus("Shipped");
		order2.setComments("Check on availability.");
		order2.setCustomerNumber(128L);
		list.add(order2);

		model.addAttribute("list", list);
		return "Index/content1";
	}

	@RequestMapping(value = "content2", method = RequestMethod.GET)
	public String content2(Model model) {
		logger.debug("IndexController:[content2] Passing through...");
		model.addAttribute("gmsg1", "グローバル電文1");
		model.addAttribute("gmsg2", "グローバル電文2");
		model.addAttribute("gmsg3", "グローバル電文3");

		Orders order = new Orders();
		order.setId("1");
		order.setOrderNumber(10100L);
		order.setStatus("Shipped");
		order.setComments(null);
		order.setCustomerNumber(363L);

		model.addAttribute("order", order);

		return "Index/content2";
	}

	@RequestMapping(value = "MAGI-MERCHIOR", method = RequestMethod.GET)
	public String merchior(Model model) {
		logger.debug("IndexController:[content1] Passing through...");

		Magi magiMerchior = new Magi();
		magiMerchior.setId("1");
		magiMerchior.setName("MAGI-MERCHIOR");
		magiMerchior.setConcept("scientist");
		magiMerchior.setStatus("第一のマギ");

		model.addAttribute("magi", magiMerchior);

		return "Magi/merchior";
	}

	@RequestMapping(value = "MAGI-BALTHASAR", method = RequestMethod.GET)
	public String balthasar(Model model) {
		logger.debug("IndexController:[content2] Passing through...");
		Magi magiMerchior = new Magi();
		magiMerchior.setId("2");
		magiMerchior.setName("MAGI-BALTHASAR");
		magiMerchior.setConcept("mother");
		magiMerchior.setStatus("第二のマギ");

		model.addAttribute("magi", magiMerchior);

		return "Magi/balthasar";
	}

	@RequestMapping(value = "MAGI-CASPER", method = RequestMethod.GET)
	public String casper(Model model) {
		logger.debug("IndexController:[content2] Passing through...");
		Magi magiMerchior = new Magi();
		magiMerchior.setId("3");
		magiMerchior.setName("MAGI-CASPER");
		magiMerchior.setConcept("woman");
		magiMerchior.setStatus("第三のマギ");

		model.addAttribute("magi", magiMerchior);

		return "Magi/casper";
	}

}