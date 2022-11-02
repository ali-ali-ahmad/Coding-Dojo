package com.assignment.ninjagoldgame.controllers;

import java.util.ArrayList;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class MainController {
	ArrayList<String> activities = new ArrayList<String>();
	int counter = 0;
	
	@RequestMapping("/")
	public String index(HttpSession session) {
		return "index.jsp";
	}


	@RequestMapping("/collect/collect1")
	public String collect1(HttpSession session, ServletRequest request){
		RandomNumber goldNum1 = new RandomNumber();
		int goldGenerator1 = goldNum1.randomNumber1();
		counter = counter + goldGenerator1;
		session.setAttribute("counter", counter);
		session.setAttribute("goldGenerator1", goldGenerator1);
		String message1 = "you have earned" + goldGenerator1;
		activities.add(message1);
		session.setAttribute("activity", activities);
	    return "redirect:/";
	}
	
	@RequestMapping("/collect/collect2")
	public String collect2(HttpSession session, ServletRequest request){
		RandomNumber goldNum2 = new RandomNumber();
		int goldGenerator2 = goldNum2.randomNumber2();
		counter = counter + goldGenerator2;
		session.setAttribute("counter", counter);
		session.setAttribute("goldGenerator1", goldGenerator2);
		String message2 = "you have earned" + goldGenerator2;
		activities.add(message2);
		session.setAttribute("activity", activities);
	    return "redirect:/";
	}
	
	@RequestMapping("/collect/collect3")
	public String collect3(HttpSession session, ServletRequest request){
		RandomNumber goldNum3 = new RandomNumber();
		int goldGenerator3 = goldNum3.randomNumber3();
		counter = counter + goldGenerator3;
		session.setAttribute("counter", counter);
		session.setAttribute("goldGenerator1", goldGenerator3);
		String message3 = "you have earned" + goldGenerator3;
		activities.add(message3);
		session.setAttribute("activity", activities);
	    return "redirect:/";
	}
	
	@RequestMapping("/collect/collect4")
	public String collect4(HttpSession session, ServletRequest request){
		RandomNumber goldNum4 = new RandomNumber();
		int goldGenerator4 = goldNum4.randomNumber4();
		counter = counter + goldGenerator4;
		session.setAttribute("counter", counter);
		session.setAttribute("goldGenerator1", goldGenerator4);
		String message4 = "you have earned" + goldGenerator4;
		activities.add(message4);
		session.setAttribute("activity", activities);
	    return "redirect:/";
	}
	
	@RequestMapping("/collect/collect5")
	public String collect5(HttpSession session, ServletRequest request){
		RandomNumber goldNum5 = new RandomNumber();
		int goldGenerator5 = goldNum5.randomNumber5();
		counter = counter + goldGenerator5;
		session.setAttribute("counter", counter);
		session.setAttribute("goldGenerator1", goldGenerator5);
		String message5 = "you have earned" + goldGenerator5;
		activities.add(message5);
		session.setAttribute("activity", activities);
	    return "redirect:/";
	}
	
	@RequestMapping("/reset")
	public String reset(HttpSession session, ServletRequest request){
		session.setAttribute("counter", counter=0);
		activities.clear();
	    return "redirect:/";
	}

	
}
