package com.bs.spring.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.bs.spring.model.vo.Board;

@Repository
public class BoardDaoImpe implements BoardDao {

	@Override
	public List<Board> selectBoardList(SqlSession session) {
		return session.selectList("board.selectBoardList");
	}

	@Override
	public Board selectBoardByNo(SqlSession session, int boardNo) {
		// TODO Auto-generated method stub
		return session.selectOne("board.selectBoardByNo",boardNo);
	}

	@Override
	public List<Board> selectBoardByTitle(SqlSession sesion, String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertBoard(SqlSession sesion, Board newBoard) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateBoard(SqlSession sesion, Board board) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delectBoard(SqlSession sesion, int boardNo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
