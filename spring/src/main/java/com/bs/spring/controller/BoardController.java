package com.bs.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bs.spring.model.service.BoardService;
import com.bs.spring.model.vo.Board;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService service;
	
	@RequestMapping("/board/boardlist.do")
	public String boardList(Model m) {
		//DB의 board 테이블에 있는 데이터를 가져오기
		List<Board> boardList=service.selectBoardList();
		System.out.println(boardList);
		//화면구성하기
		m.addAttribute("boardList",boardList);
		
		return "board/boardList";
	}
	@RequestMapping("/board/boardview.do")
	public String boardView(int boardNo, Model m) {
		Board b= service.selectBordByNo(boardNo);
		System.out.println(b);
		m.addAttribute("board", b);
		
		return "board/boardView";
	}
}
