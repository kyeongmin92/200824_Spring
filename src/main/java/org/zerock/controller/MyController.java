package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.log4j.Log4j;

@Controller					//Component랑 같은 기능, 요청을 전달받을 수 있음
@RequestMapping("/my/*") 	//ContextPath 제외하고 my라는 경로로 오면 일을 수행
@Log4j
public class MyController {
		
	@RequestMapping("")
	public void myHandler1() {
		log.info("my controller is working.....");
	}
	
	@RequestMapping("/a")
	public void myHandler2() {
		log.info("myHandler2 is working.......");
	}
	
	@RequestMapping("/b")
	public void myHandler3() {
		log.info("myHandler3 is working..........");
	}
	
	@RequestMapping(value = "/c", method = RequestMethod.GET)
	public void myHandler4() {
		log.info("myHandler4...............");
	}
	
	@RequestMapping(value = "/c", method = RequestMethod.POST)
	public void myHandler5() {
		log.info("myHandler5...............");
	}
	
	@GetMapping("/d")
	public void myHandler6() {
		log.info("myHandler6............");
	}
	
	@PostMapping("/d")
	public void myHandler7() {
		log.info("myHandler7............");
	}
}
