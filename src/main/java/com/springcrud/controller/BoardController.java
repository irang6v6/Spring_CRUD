package com.springcrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springcrud.mapper.BoardMapper;

@Controller
public class BoardController {

	@Autowired BoardMapper boardMapper;

	@RequestMapping("board/list")
	public String list(Model model) {
		model.addAttribute("boards",boardMapper.findAll());
		return "board/list";
	}

}
