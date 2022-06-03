package com.springcrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springcrud.mapper.BoardMapper;
import com.springcrud.model.Board;

@Controller
public class BoardController {

	@Autowired
	BoardMapper boardMapper;

	@RequestMapping("board/list")
	public String list(Model model) {
		model.addAttribute("boards", boardMapper.findAll());
		return "board/list";
	}

	@RequestMapping("board/detail")
    public String detail(Model model, Integer id) {
        if (id == null) id = 1;
        model.addAttribute("board", boardMapper.findById(id));
        return "board/detail";
    }


	@GetMapping("board/create")
	public String create(Model model) {
		Board board = new Board();
		model.addAttribute("board", board);
		return "board/create";
	}

	@PostMapping("board/create")
	public String create(Model model, Board board) {
		boardMapper.insert(board);
		return "redirect:list";
	}

    @GetMapping("board/edit")
    public String edit(Model model, int id) {
        Board board = boardMapper.findById(id);
        model.addAttribute("board", board);
        return "board/edit";
    }

    @PostMapping("board/edit")
    public String edit(Model model, Board board) {
        boardMapper.update(board);
        return "redirect:list";
    }

    @RequestMapping("board/delete")
    public String delete(int id) {
        boardMapper.delete(id);
        return "redirect:list";
    }

}
