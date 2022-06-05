package com.range.web.model.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.range.web.model.dao.MainboardDao;
import com.range.web.model.dto.Mainboard;

@Service
public class MainboardServiceImpl implements MainboardService{
	
	@Autowired
	MainboardDao boardDao;
	
	@Override
	public List<Mainboard> getBoardList(HashMap<String, String> params) {
		return boardDao.selectAll(params);
	}

	@Override
	public Mainboard getBoard(int seq) {
		return boardDao.selectOne(seq);
	}

	@Override
	public void writeBoard(Mainboard mainboard) {
		boardDao.insertBoard(mainboard);
		
	}

	@Override
	public boolean modifyBoard(Mainboard board) {
		boardDao.updateBoard(board);
		return boardDao.updateBoard(board)==1;
	}

	@Override
	public boolean removeBoard(int seq) {
		// TODO Auto-generated method stub
		return boardDao.deleteBoard(seq)==1;
	}

	@Override
	public void updateLike(int seq) {
		Mainboard board = boardDao.selectOne(seq);
		board.setLike(board.getLike()+1);
	}

}
