<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Class Name : designRule.jsp
  Description :  지원 플랫폼
  Modification Information

      수정일         수정자           수정내용
    -------------    --------    ---------------------
     2011.07.20    구지연          최초 생성
 
    author   : 모바일 실행환경 개발팀 구지연
    since    : 2011.07.19
--%>
<!DOCTYPE html> 
<html lang="kr"> 
    <head> 
        <title>eGovFrame</title> 
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />    
        
        <!-- eGovFrame Common import -->        
        <link rel="stylesheet" href="<c:url value="/css/egovframework/mbl/cmm/jquery.mobile-1.1.1.css" />" />
        <link rel="stylesheet" href="<c:url value="/css/egovframework/mbl/cmm/EgovMobile-1.1.1.css" />" />
        <script type="text/javascript" src="<c:url value="/js/egovframework/mbl/cmm/jquery-1.7.1.min.js"/>"></script>
		
		 
        <script type="text/javascript" src="<c:url value="/js/egovframework/mbl/cmm/jquery.mobile-1.1.1.js" />"></script>
        <script type="text/javascript" src="<c:url value="/js/egovframework/mbl/cmm/EgovMobile-1.1.1.js" />"></script>
        
        <!-- guide import -->
        <link rel="stylesheet" href="<c:url value="/css/egovframework/mbl/rte/guide/guide.css" />">
        <script type="text/javascript"  src="<c:url value="/js/egovframework/mbl/rte/guide/guide.js"/>"></script>
	</head>

    <body> 

        <!-- 모바일 페이지 start -->
		<div data-role="page" class="type-index">
		
            <!-- header start -->
            <div data-role="header" data-position="inline" data-theme="z" class="egovBarHeader">
                <a href="<c:url value="/guide/guide.do"/>" data-icon="home" class="ui-btn-left" data-ajax="false">Home</a>
                <a href="<c:url value="/guide/guide.do"/>" data-icon="back" class="ui-btn-right" data-ajax="false">Back</a>
                <h1><img src="<c:url value="/images/egovframework/mbl/rte/guide/h1_logo.png"/>" alt="egovframework" /></h1>
            </div>  
            <!-- header end -->
			
			<!-- content start -->		
			<div data-role="content" data-theme="d">
			
                <!-- content-primary start -->
				<div class="content-primary">
					<div class="egov-tit">
						<h1>디자인 원칙</h1>
					</div>
					
					<dl class="egov-deth3">
						<dt>이미지는 로딩(Loading)이 신속하게 진행될 수 있도록 제작해야 한다.</dt>
						<dd class="egovArr">시스템의 심미성 향상을 위해 사용되는 이미지와 그래픽 블릿(Bullet), 아이콘 등의 시각적 요소들은 페이지의 복잡도를 줄이기 위해 사용을 최소화해야 한다. 
						페이지의 로딩 속도에 영향을 미치지 않고 효과를 극대화시키기 위해서는 이미지의 사이즈를 작게 설정하고 컬러의 수를 줄여서 사용해야 한다.</dd>
						
						<dt>이미지의 표현방식은 일관되게 제시해야 한다.</dt>
						<dd class="egovArr">시스템 전반에 걸쳐서 사용자에게 통일된 이미지의 콘셉트를 보여주고, 시스템에 대한 일관된 이미지를 전달 할 수 있어야 한다.</dd>
						
						<dt>시스템이 기본적으로 제공하는 폰트 타입을 사용해야 한다.</dt>
						<dd class="egovArr">폰트의 스타일은 가능하면 시스템에서 제공하는 기본 폰트 스타일을 사용하여 특정 폰트 지원여부에 영향을 받지 않도록 해야 한다. 
						폰트의 사용은 가독성(Readability)을 우선적으로 고려해야 하며, 시각적으로 명확하지 않은 폰트를 사용하여 텍스트를 읽을 때 불편함이 생기지 않도록 해야한다.</dd>
						
						<dt>폰트는 정보의 분류 체계, 중요도, 목적에 따라 차별되게 적용되어야 한다.</dt>
						<dd class="egovArr">Bold 체와 Italic 체는 중요도가 높거나 구분될 필요가 있는 경우에만 사용해야 하며, 지나치게 자주 사용하면 정보의 가독성을 저해할 수 있다.</dd>
						<dd class="egovArr">폰트 하단의 밑줄은 링크와 혼동될 수 있으므로 가급적 사용을 자제한다.</dd>
						
						<dt>동일한 페이지에서 폰트 스타일과 크기는 3종류 이내로 제한하여 사용한다.</dt>
						<dd class="egovArr">한 페이지 안에 3종류 이상의 폰트 스타일을 사용하면 일관성이 저해되어 가독성이 떨어진다. 따라서 시각적 통일성을 유지하는 범위 내에서 사용해야 한다.</dd>
						
						<dt>한 페이지 내에 표현할 수 있는 최대 컬러 군은 5가지 이다.</dt>
						<dd class="egovArr">5가지가 넘는 컬러 군을 사용할 경우 페이지 구성을 혼란하게 하여 수행 능력을 저해할 수 있다.</dd>
						
						<dt>컬러는 시스템의 고유 아이덴티티(Identity)가 적용될 수 있어야 한다.</dt>
						<dd class="egovArr">사용자들에게 대상 시스템이나 제품에 대한 공통적인 브랜드 이미지를 심어 줄 수 있도록 시스템의 특성이 반영된 컬러(CI)를 적극적으로 적용해야 한다.</dd>
						
						<dt>아이콘은 텍스트와 결합하여 제시해야 한다.</dt>
						<dd class="egovArr">아이콘은 시각적 효과가 높지만 정확한 메타포(metaphor)를 표현하기가 어려우므로 텍스트와 결합하여 정확도를 높여야 한다.</dd>
						
						<dt>동일한 모양의 아이콘에 중복된 기능을 부여하지 않는다.</dt>
						<dd class="egovArr">하나 이상의 기능을 동일한 모양의 아이콘에  부여하지 말아야 한다.</dd>
						
						<dt>아이콘은 일정한 위치에 배치해야 한다.</dt>
						<dd class="egovArr">아이콘을 페이지 별로 상이한 곳에 배치하면 사용자가 아이콘을 직관적으로 이해하는데 방해가 되어 아이콘 이용에 어려움을 줄 수 있다.</dd>
					</dl>
					<br>
					<div class="egov-tit">
						<h1>제약 사항</h1>
					</div>
					
					<table class="egov-table-spceial">
                    <colgroup><col class="egov-colwidth15"><col class="egov-colwidth20"><col class="egov-colwidth65"></colgroup>
                    <thead>
                    <tr>
                        <th>제약대상</th>
                        <th>제약사항</th>
                        <th>문제원인</th>
                    </tr>
                    </thead>
                    <tbody>
                    
                    <tr>
                        <td class="type1"><strong>Android 2.3 Browser Back Button</strong></td>
                        <td class="type1">안드로이드 2.3 기본 브라우저에서 Back Button을 통한 이전 페이지 이동의 문제</td>
                        <td>안드로이드 2.3 기본 브라우저에서의 Page History 관리상의 결함으로 인해, 
                        	일반 페이지 그리고 iFrame 내에 새로운 페이지를 로딩한 후 Back Button을 통해 
                        	이전 페이지로 돌아갈 때 원하지 않는 페이지로 돌아가게 된다.<br>
                        	안드로이드 2.3 환경에서 기본 브라우저를 제외한 나머지 모바일 브라우저 및 안드로이드 4.0 버전 에서는 이 문제가 발생하지 않으며,
                        	개선 방법으로는 "jquery.history.js" 파일을 페이지에 포함시켜서 어느정도 효과를 볼 수 있지만, 근본적인 문제 해결이 될 수 없다.</td>
                    </tr>                                        
                                        
                    <tr>
                        <td rowspan="2" class="type1"><strong>Fixed Footer(Header)</strong></td>
                        <td class="type1">오페라 모바일 브라우저에서 Fixed Footer(Header)의 위치가 올바르지 않은 문제</td>
                        <td>오페라 모바일 브라우저에서는 Position: fixed 를 지원하지 않으므로, Fixed Component 에 대한 Position 
                        	계산 시 다른 모바일 브라우저와 상이한 값으로 나타난다.</td>
                    </tr>
                    <tr>                        
                        <td class="type1">안드로이드 기본 브라우저에서의 Fixed Toolbar 문제</td>
                        <td>다양한 스타일에 대해 안드로이드 기본 브라우저에서 position: fixed; 에 의해 발생하는 문제점들을 jQueryMobile 사이트에서 
                        	설명하고 있고, 앞으로도 계속 개선할 목표를 가지고 있다고 언급하였다.</td>
                    </tr>
                     
                    <tr>
                        <td rowspan="2" class="type1"><strong>Dialog Transition</strong></td>
                        <td class="type1">오페라 모바일 브라우저 및 안드로이드 2.3 브라우저에서는 전환 효과가 발생하지 않는 문제</td>
                        <td>오페라 모바일 브라우저 및 안드로이드 2.3 기본 브라우저에서는 3D Transform을 지원하지 않으므로, 전환효과가 발생하지 않는다.</td>
                    </tr>
                    <tr>                        
                        <td class="type1">안드로이드 4.0 기본 브라우저에서 전환효과의 마지막에 화면이 깜빡이는 현상</td>
                        <td>안드로이드 4.0 기본 브라우저에서의 아직 불완전한 3D Transform 지원으로 jQueryMobile 사이트에서도 
                        	안드로이드 브라우저에서의 깜빡이는 현상 및 불안정함을 언급하고 있다.</td>
                    </tr>
                    
                    <tr>
                        <td class="type1"><strong>Progress Dialog</strong></td>
                        <td class="type1">오페라 모바일 브라우저에서 Progress Dialog 내에 있는 원형 이미지가 회전하지 않는 문제</td>
                        <td>회전하는 효과는 CSS 3 3D Transform 및 Aniamation 으로 구현되어 있으나, 오페라 모바일 브라우저에서는 지원하지 않으므로,
                        	원형 이미지가 회전하지 않는다.</td>
                    </tr>
                    
                    <tr>
                        <td class="type1"><strong>Switch</strong></td>
                        <td class="type1">안드로이드 4.0 기본 브라우저 상에서 Switch 컴포넌트가 밀리지 않는 문제</td>
                        <td>안드로이드 4.0 기본 브라우저는 현재 TouchStart 및 TouchMove Event 가 불안정하며 드래그 진행 시 TouchMove Event가 발생한 후, 
                        	Event가 먹통이 되어버리는 현상이 있으며, 이는 가이드 페이지 내에 있는 Switch 컴포넌트의 두가지 변경 방식
                        	(원형 컨트롤을 밀어서 값 변경하기, 터치하여 값 변경하기) 중 원형 컨트롤을 통한 값 변경이 
                        	Selector의 팝업 효과에 있는 vmouse event의 영향을 받아 정상적으로 동작하지 않는 문제가 있다.</td>
                    </tr>
                        
                    </tbody>
                    </table>
	             </div> 
	            
	             <div class="content-secondary"> 
					<jsp:include page="../introMenu.jsp"></jsp:include>
				</div>
			</div>	             
            
			<!-- footer start -->
			<div data-role="footer" data-theme="z"  class="egovBar">
				<h4>Copyright(c)2012 Ministry of Public Administration and Security.</h4>
			</div>
			<!-- footer end --> 
      
        </div> 
        <!-- 모바일 페이지 end -->

    </body>
    
</html>