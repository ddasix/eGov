package com.multicampus.biz.board.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.multicampus.biz.board.BoardDAO;
import com.multicampus.biz.board.vo.BoardVO;

@Repository
public class BoardDAOSpring implements BoardDAO {
	@Autowired
	private JdbcTemplate spring;

	// SQL 명령어들
	private final String BOARD_ADD = "insert into board(seq, title, writer, content) values((select nvl(max(seq), 0)+1 from board),?,?,?)";
	private final String BOARD_UPDATE = "update board set title=?, content=? where seq=?";
	private final String BOARD_DELETE = "delete board where seq=?";
	private final String BOARD_GET = "select * from board where seq=?";
	private final String BOARD_LIST = "select * " +
			                          "from board " +
			                          "order by seq desc";

	public void addBoard(BoardVO vo){
		spring.update(BOARD_ADD, vo.getTitle(), vo.getWriter(), vo.getContent());
	}
	
	public void updateBoard(BoardVO vo){	
		spring.update(BOARD_UPDATE, vo.getTitle(), vo.getContent(), vo.getSeq());
	}	
	
	public void deleteBoard(BoardVO vo){	
		spring.update(BOARD_DELETE, vo.getSeq());
	}
	
	public BoardVO getBoard(BoardVO vo){	
		Object[] args = {vo.getSeq()};
		return spring.queryForObject(BOARD_GET, 
				                     args, 
				                     new BoardRowMapper());
	}
	
	public List<BoardVO> getBoardList(BoardVO vo){		
		return spring.query(BOARD_LIST, new BoardRowMapper());
	}	
}

class BoardRowMapper implements RowMapper<BoardVO>{
	public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		BoardVO board = new BoardVO();
		board.setSeq(rs.getInt("SEQ"));
		board.setTitle(rs.getString("TITLE"));
		board.setWriter(rs.getString("WRITER"));
		board.setContent(rs.getString("CONTENT"));
		board.setRegDate(rs.getDate("REGDATE"));
		board.setCnt(rs.getInt("CNT"));
		return board;
	}
}






























