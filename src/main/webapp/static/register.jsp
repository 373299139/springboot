<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<shiro:hasPermission name="user">
	<a id="addbtn" class="easyui-linkbutton" data-options="iconCls:'icon-add'">新增</a>
</shiro:hasPermission>
</br>
 <shiro:hasRole name="user">

        <p>具备有user角色</p>

  </shiro:hasRole>
  </br>
 <shiro:hasRole name="admin">

        <p>具备有admin角色</p>

  </shiro:hasRole>
</br>
${user}
</body>
</html>