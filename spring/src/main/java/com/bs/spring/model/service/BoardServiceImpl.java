package com.bs.spring.model.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.spring.model.dao.BoardDao;
import com.bs.spring.model.vo.Board;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardDao dao;
	@Autowired
	private SqlSession session;

	@Override
	public List<Board> selectBoardList() {
		// TODO Auto-generated method stub
		return dao.selectBoardList(session);
	}

	@Override
	public Board selectBordByNo(int boardNo) {
		// TODO Auto-generated method stub
		return dao.selectBoardByNo(session, boardNo);
	}

	@Override
	public List<Board> selectBoardByTitel(String titel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertBoard(Board newBoard) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateBoard(Board board) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteBoard(int boardNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
