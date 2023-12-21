package com.phj.board.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.phj.board.command.BwriteCommand;

@Controller
public class BoardController {
	
	@RequestMapping(value = "/write_form")
	public String write_form() {
		return "write_form";
	}
	
	@RequestMapping(value = "/write")
	public String write(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		// 글쓴이, 글제목, 글내용이 저장되어 있는 request 객체를 model 객체에 넣음
		
		BwriteCommand command = new BwriteCommand();
		command.excute(model); // request 객체가 실려있는 model객체를 BWriteCommand 객체에게 전달
		
		return "";
	}
}