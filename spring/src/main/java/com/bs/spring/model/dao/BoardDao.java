package com.bs.spring.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.bs.spring.model.vo.Board;

public interface BoardDao {
	List<Board> selectBoardList(SqlSession sesion);
	Board selectBoardByNo(SqlSession sesion,int boardNo);
	List<Board> selectBoardByTitle(SqlSession sesion, String title);
	
	int insertBoard(SqlSession sesion,Board newBoard);
	int updateBoard(SqlSession sesion, Board board);
	int delectBoard(SqlSession sesion, int boardNo);
}
