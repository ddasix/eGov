<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%--
  Class Name : back.jsp
  Description :  UX dialog component
  Modification Information

      수정일         수정자           수정내용
    -------------    --------    ---------------------
     2011.07.14    황민희          최초 생성
 
    author   : 모바일 실행환경 개발팀 황민희
    since    : 2011.07.06
--%>
<!DOCTYPE html> 
<html> 
  <head> 
    <title>UX Component - Dialog</title> 
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" /> 
            
        <!-- eGovFrame Common import -->
        <link rel="stylesheet" href="<c:url value="/css/egovframework/mbl/cmm/jquery.mobile-1.0b3.min.css" />" />
        <link rel="stylesheet" href="<c:url value="/css/egovframework/mbl/cmm/EgovMobile.css" />" />
        <script type="text/javascript" src="<c:url value="/js/egovframework/mbl/cmm/jquery-1.6.2.min.js"/>"></script>
		<!-- History.js -->
		<script type="text/javascript" src="<c:url value="/js/egovframework/mbl/cmm/jquery.history.js"/>"></script> 
        <script type="text/javascript" src="<c:url value="/js/egovframework/mbl/cmm/jquery.mobile-1.0b3.min.js" />"></script>
        <script type="text/javascript" src="<c:url value="/js/egovframework/mbl/cmm/EgovMobile.js" />"></script>
    
        <!-- guide import -->
        <link rel="stylesheet" href="<c:url value="/css/egovframework/mbl/rte/guide/guide.css" />">
        <script type="text/javascript"  src="<c:url value="/js/egovframework/mbl/rte/guide/guide.js"/>"></script>
	
     </head>
     
     <body>
     <!-- dialog start -->
         <div data-role="page" data-theme="d"> 
            
            <div data-role="header" data-position="inline" data-theme="e">
            	<h1>eGovFrame</h1>	
			</div> 
            
             <div data-role="content"><!-- content start -->
			    	<h1>Dialog Sample Page !</h1>
					<br>
	             	<!-- <a href="/generate/dialog/dialog.do"" data-role="button" data-theme="b" data-ajax="false">GO TO DIALOG</a>	
 					-->
             </div><!-- content end -->	 
         </div> 
     </body>
 </html>