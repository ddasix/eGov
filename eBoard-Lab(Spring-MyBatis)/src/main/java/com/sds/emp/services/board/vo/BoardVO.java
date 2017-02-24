package com.sds.emp.services.board.vo;

import java.sql.Timestamp;
import java.util.Date;

public class BoardVO {
	private String boardNo;
	private String title;
	private String writer;
	private String content;
	private Timestamp regDate = new java.sql.Timestamp(new java.util.Date().getTime());;
	private int cnt;

	
	public String getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(String boardNo) {
		this.boardNo = boardNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	@Override
	public String toString() {
		return "BoardVO [cnt=" + cnt + ", content=" + content + ", regDate="
				+ regDate + ", boardNo=" + boardNo + ", title=" + title + ", writer="
				+ writer + "]";
	}	
}
