<%@page contentType="text/html; charset=EUC-KR"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.multicampus.biz.board.vo.BoardVO"%>
<html> 
	<head> 
		<title>�� ���</title> 
	</head> 
	
<%
	String userName = (String)session.getAttribute("userName");
	// ���ǿ� ����� �� ����� �����Ѵ�.
	ArrayList<BoardVO> boardList = (ArrayList)request.getAttribute("boardList");
	
	// 2. ��� ȭ�� ����
%>	
	
	<body> 
		<center> 
		<h3>Gurum's BOARD LIST</h3> 
		<h3><font color='orange'><%= userName %></font> �� ȯ���մϴ�...........<a href='logout.do'>LOG-OUT</a></h3> 
		<hr> 
		
		<form action='./getBoardList.do' method='post'> 
		<table border='1' cellpadding='0' cellspacing='0' width='700'> 
			<tr> 		
				<td align='right'> 
				<select name='searchCondition'> 
					<option value='TITLE'>���� 
					<option value='CONTENT'>���� 
				</select> 
				<input type='text' name='searchKeyword'> 
				<input type='submit' value='�˻�'> 
				</td> 		
			</tr> 
		</table> 
		</form> 		
		
		<table border='1' cellpadding='0' cellspacing='0' width='700'> 
			<tr> 
				<th bgcolor='orange'>��ȣ</th> 
				<th bgcolor='orange'>����</th> 
				<th bgcolor='orange'>�ۼ���</th> 
				<th bgcolor='orange'>�����</th> 
				<th bgcolor='orange'>��ȸ��</th> 
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
		<a href='addBoardView.do'>���� ����</a> 
		</center> 
	</body> 
</html> 