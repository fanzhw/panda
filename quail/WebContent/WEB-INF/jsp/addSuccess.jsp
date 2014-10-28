<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/my.css">

welcome: ${aaa_name}、${bbb_name}、${string}
<br/>
<c:choose>
	<c:when test="${aaa_name=='aaa_jadyer'}">
		From:/mydemo/sayaaa
	</c:when>
	<c:when test="${bbb_name=='bbb_jadyer'}">
		From:/mydemo/saybbb${sessionScope.loginUser}
	</c:when>
	<c:otherwise>
		From:others
	</c:otherwise>
</c:choose>
<br/>
${redirectName}