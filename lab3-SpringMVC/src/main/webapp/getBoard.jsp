<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>�� ��</title>
</head>
<body>
<center>
	<h3>�� ��............<a href='logout.do'>LOG-OUT</a></h3>
	<hr>
		<form action="updateBoard.do?seq=${board.seq }" method="post">
		<table border="1" cellpadding="0" cellspacing="0">
			<tr>
				<td>����</td><td align="left"><input type="text" name="title" value="${board.title }"/></td>
			</tr>
			<tr>
				<td>�ۼ���</td><td align="left">${board.writer }</td>
			</tr>
			<tr>
				<td>����</td><td align="left"><textarea name="content" cols="40" rows="10">${board.content }</textarea></td>
			</tr>
			<tr>
				<td>�����</td><td align="left">${board.regDate }</td>
			</tr>
			<tr>
				<td>��ȸ��</td><td align="left">${board.cnt }</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="�� ����"/></td>
			</tr>
		</table>
		</form>
	<hr>
	<a href="addBoardView.do">�۵��</a>&nbsp;&nbsp;&nbsp;
	<a href="deleteBoard.do?seq=${board.seq }">�ۻ���</a>&nbsp;&nbsp;&nbsp;
	<a href="getBoardList.do">�۸��</a>	
</center>
</body>
</html>












