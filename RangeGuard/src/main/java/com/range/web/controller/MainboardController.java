package com.range.web.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.range.web.model.dto.Mainboard;
import com.range.web.model.service.MainboardService;


@RestController
@RequestMapping("/mainboard")
public class MainboardController {
	@Autowired
	private MainboardService boardService;
	
	@GetMapping("/")
	public ResponseEntity<List<Mainboard>> list(String category, @RequestParam(defaultValue ="")String mode, @RequestParam(defaultValue = "")String keyword){
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("category", category);
		params.put("keyword",keyword);
		params.put("mode",mode);
		return new ResponseEntity<List<Mainboard>>(boardService.getBoardList(params),HttpStatus.OK);
	}
	
	@PostMapping("/")
	public ResponseEntity<String> write(Mainboard board){
		boardService.writeBoard(board);
		return new ResponseEntity<String>("success",HttpStatus.CREATED);
	}
	
	@GetMapping("/{seq}")
	public ResponseEntity<Mainboard> board(@PathVariable int seq){
		return new ResponseEntity<Mainboard>(boardService.getBoard(seq),HttpStatus.OK);
	}
	
	@DeleteMapping("/{seq}")
	public ResponseEntity<String> delete(@PathVariable int seq){
		if(boardService.removeBoard(seq)) {
			return new ResponseEntity<String>("success", HttpStatus.OK);
		}
		return new ResponseEntity<String>("fail", HttpStatus.NO_CONTENT);
	}
	
	@PutMapping("/{seq}")
	public ResponseEntity<String> update(Mainboard board){
		boardService.modifyBoard(board);
		return new ResponseEntity<String>("success", HttpStatus.OK);
	}
	//test
}
