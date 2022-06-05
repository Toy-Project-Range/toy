package com.range.web.model.dao;

import java.util.HashMap;
import java.util.List;

import com.range.web.model.dto.Mainboard;

public interface MainboardDao {
	List<Mainboard> selectAll(HashMap<String, String> params);
	
	Mainboard selectOne(int seq);
	
	void insertBoard(Mainboard mainboard);
	
	int updateBoard(Mainboard mainboard);
	
	int deleteBoard(int seq);
}
