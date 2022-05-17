package com.range.web.model.dto;

public class AlgoboardComment {
	private int seq;
	private int boardSeq;
	private String writer;
	private String comment;
	private String regDate;
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public int getBoard_seq() {
		return boardSeq;
	}
	public void setBoard_seq(int board_seq) {
		this.boardSeq = board_seq;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getReg_date() {
		return regDate;
	}
	public void setReg_date(String reg_date) {
		this.regDate = reg_date;
	}
}
