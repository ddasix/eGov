<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Class Name : activeTab2.jsp
  Description :  UX Tabs component
  Modification Information

      수정일         수정자           수정내용
    -------------    --------    ---------------------
     2011.07.14    윤병욱          최초 생성
 
    author   : 모바일 실행환경 개발팀 윤병욱
    since    : 2011.07.06
--%>
<!DOCTYPE html> 
<html> 
    <head> 
        <title>eGovframe</title> 
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />    
        
        <!-- eGovFrame Common import -->        
        <link rel="stylesheet" href="<c:url value="/css/egovframework/mbl/cmm/jquery.mobile-1.0b3.min.css" />" />
        <link rel="stylesheet" href="<c:url value="/css/egovframework/mbl/cmm/EgovMobile.css" />" />
        <script type="text/javascript" src="<c:url value="/js/egovframework/mbl/cmm/jquery-1.6.2.min.js"/>"></script>
		<!-- History.js -->
		<script type="text/javascript" src="<c:url value="/js/egovframework/mbl/cmm/jquery.history.js"/>"></script> 
        <script type="text/javascript" src="<c:url value="/js/egovframework/mbl/cmm/jquery.mobile-1.0b3.min.js" />"></script>
        <script type="text/javascript" src="<c:url value="/js/egovframework/mbl/cmm/EgovMobile.js" />"></script>
    
	</head>

    <body> 

        <!-- 모바일 페이지 start -->
        <div data-role="page">

            <!-- header start -->
            <div data-role="header" data-position="inline" data-theme="a">
                <a href="<c:url value="/guide/guide.do"/>" data-icon="home" class="ui-btn-left" data-ajax="false">Home</a>
                <a href="<c:url value="/guide/components/tabs/tabs.do"/>" data-icon="back" class="ui-btn-right" data-ajax="false">Back</a>
                <h1><img src="<c:url value="/images/egovframework/mbl/rte/guide/h1_logo.png"/>" /></h1>
                <div data-role="navbar" role="navigation">
                    <ul>
                        <li><a href="activeTab1.do" data-icon="star">활성화1</a></li>
                        <li><a href="activeTab2.do" data-icon="grid" class="ui-btn-active ui-state-persist">활성화2</a></li>
                        <li><a href="activeTab3.do" data-icon="gear">활성화3</a></li>
                    </ul>
                </div>                  
            </div>  
            <!-- header end -->

			<!-- contents start -->
			<div data-role="content">
                <h1><font color="blue">문서간 이동 : 활성화 2</font></h1><br/><br/>
                <a href="<c:url value="/guide/components/tabs/tabs.do" />" data-ajax="false" data-role="button">Back to Tab Home</a>
                
			</div>
			<!-- contents end -->

            <!-- footer start -->
            <div data-role="footer" data-theme="z">
                 <h4 class="main">Copyright(c)2011 Ministry of Public Administration and Security.</h4>
            </div>
            <!-- footer end --> 

        </div>
        <!-- 모바일 페이지 end -->

    </body>
    
</html>