package com.bs.spring.model.service;

import java.util.List;

import com.bs.spring.model.vo.Board;

public interface BoardService {
	List<Board> selectBoardList();
	Board selectBordByNo(int boardNo);
	List<Board> selectBoardByTitel(String titel);
	
	int insertBoard(Board newBoard);
	int updateBoard(Board board);
	int deleteBoard(int boardNo);
}
