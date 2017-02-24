<%@page contentType="text/html; charset=EUC-KR"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.multicampus.biz.board.vo.BoardVO"%>
<html> 
	<head> 
		<title>글 목록</title> 
	</head> 
	
<%
	String userName = (String)session.getAttribute("userName");
	// 세션에 저장된 글 목록을 추출한다.
	ArrayList<BoardVO> boardList = (ArrayList)request.getAttribute("boardList");
	
	// 2. 결과 화면 구성
%>	
	
	<body> 
		<center> 
		<h3>Gurum's BOARD LIST</h3> 
		<h3><font color='orange'><%= userName %></font> 님 환영합니다...........<a href='logout.do'>LOG-OUT</a></h3> 
		<hr> 
		
		<form action='./getBoardList.do' method='post'> 
		<table border='1' cellpadding='0' cellspacing='0' width='700'> 
			<tr> 		
				<td align='right'> 
				<select name='searchCondition'> 
					<option value='TITLE'>제목 
					<option value='CONTENT'>내용 
				</select> 
				<input type='text' name='searchKeyword'> 
				<input type='submit' value='검색'> 
				</td> 		
			</tr> 
		</table> 
		</form> 		
		
		<table border='1' cellpadding='0' cellspacing='0' width='700'> 
			<tr> 
				<th bgcolor='orange'>번호</th> 
				<th bgcolor='orange'>제목</th> 
				<th bgcolor='orange'>작성자</th> 
				<th bgcolor='orange'>등록일</th> 
				<th bgcolor='orange'>조회수</th> 
			</tr> 
<% 	for(BoardVO board : boardList){ %>
			<tr> 
				<td align='center' width='50'><%= board.getSeq() %></td> 
				<td align='left' width='300'><a href='getBoard.do?seq=<%= board.getSeq() %>'><%= board.getTitle() %></a></td> 
				<td align='center' width='100'><%= board.getWriter() %></td> 
				<td align='center' width='150'><%= board.getRegDate() %></td> 
				<td align='center' width='100'><%= board.getCnt() %></td> 
			</tr> 
<%	} %>
		</table> 
		<hr> 
		<br> 
		<a href='addBoardView.do'>새글 쓰기</a> 
		</center> 
	</body> 
</html> 