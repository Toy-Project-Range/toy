package com.range.web.model.service;

import java.util.HashMap;
import java.util.List;

import com.range.web.model.dto.Mainboard;

public interface MainboardService {
	List<Mainboard> getBoardList(HashMap<String, String> params);
	
	Mainboard getBoard(int seq);
	
	void writeBoard(Mainboard board);
	
	boolean modifyBoard(Mainboard board);
	
	boolean removeBoard(int seq);
	
	void updateLike(int seq);
}
