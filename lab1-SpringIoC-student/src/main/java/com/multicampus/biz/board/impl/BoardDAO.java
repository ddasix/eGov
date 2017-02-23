package com.multicampus.biz.board.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.multicampus.biz.board.vo.BoardVO;
import com.multicampus.biz.common.JDBCUtil;

//TODO1. BoardDAO Ŭ������ Bean ���� ����ϴ� Annotation �� �����Ͻÿ�.
@Repository("boardDAO")
public class BoardDAO {
	// DB ���� ����
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	
	// SQL ��ɾ��
	private final String BOARD_ADD = "insert into board(seq, title, writer, content) values((select nvl(max(seq), 0)+1 from board),?,?,?)";
	private final String BOARD_UPDATE = "update board set title=?, content=? where seq=?";
	private final String BOARD_DELETE = "delete board where seq=?";
	private final String BOARD_LIST_TITLE = "select * from board where title like ? order by seq desc";
	private final String BOARD_LIST_CONTENT = "select * from board where content like ? order by seq desc";
	private final String BOARD_GET = "select * from board where seq=?";
	
	public void addBoard(BoardVO vo){
		//TODO2. ���� ��� JDBC ������ �����Ͻÿ�.
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BOARD_ADD);
			stmt.setString(1, vo.getTitle());
			stmt.setString(2, vo.getWriter());
			stmt.setString(3, vo.getContent());
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally{
			JDBCUtil.close(stmt, conn);
		}
	}
	
	public void updateBoard(BoardVO vo){
		//TODO3. �� ���� JDBC ������ �����Ͻÿ�.
		try {

			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BOARD_UPDATE);
			stmt.setString(1, vo.getTitle());
			stmt.setString(2, vo.getWriter());
			stmt.setString(3, vo.getContent());
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally{
			JDBCUtil.close(stmt, conn);
		}
	}	
	
	public void deleteBoard(BoardVO vo){
		//TODO4. �� ���� JDBC ������ �����Ͻÿ�.
		try {

			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BOARD_DELETE);
			stmt.setInt(1, vo.getSeq());
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally{
			JDBCUtil.close(stmt, conn);
		}
	}
	
	public BoardVO getBoard(BoardVO vo){
		BoardVO boardVO = null;
		//TODO5. �� �� �˻� JDBC ������ �����Ͻÿ�.
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BOARD_GET);
			stmt.setInt(1,vo.getSeq());
			rs = stmt.executeQuery();
			if(rs.next()){
				boardVO = new BoardVO();
				boardVO.setSeq(rs.getInt("SEQ"));
				boardVO.setTitle(rs.getString("TITLE"));
				boardVO.setWriter(rs.getString("WRITER"));
				boardVO.setContent(rs.getString("CONTENT"));
				boardVO.setRegDate(rs.getDate("REGDATE"));
				boardVO.setCnt(rs.getInt("CNT"));
			}
					
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally{
			JDBCUtil.close(rs, stmt, conn);
		}
		return boardVO;
	}
	
	public ArrayList<BoardVO> getBoardList(BoardVO vo){
		ArrayList<BoardVO> boardList = new ArrayList<BoardVO>();
		//TODO3. �� �����ȸ JDBC ������ �����Ͻÿ�.
		try {
			conn = JDBCUtil.getConnection();
			if(vo.getSearchCondition().equals("TITLE")){
				stmt = conn.prepareStatement(BOARD_LIST_CONTENT);
			}else if(vo.getSearchCondition().equals("CONTENT")){
				stmt = conn.prepareStatement(BOARD_LIST_CONTENT);				
			}
			stmt.setString(1,"%"+vo.getSearchKeyword()+"%");
			rs = stmt.executeQuery();
			while(rs.next()){
				BoardVO boardVO = new BoardVO();
				boardVO.setSeq(rs.getInt("SEQ"));
				boardVO.setTitle(rs.getString("TITLE"));
				boardVO.setWriter(rs.getString("WRITER"));
				boardVO.setContent(rs.getString("CONTENT"));
				boardVO.setRegDate(rs.getDate("REGDATE"));
				boardVO.setCnt(rs.getInt("CNT"));
				boardList.add(boardVO);
			}
					
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			JDBCUtil.close(rs, stmt, conn);
		}
		return boardList;
	}	
}
