<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/jquery-3.4.1.min.js"></script>
<title>Insert title here</title>
<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
		<div class="alert alert-success alert-dismissable">
				 <button type="button" class="close" data-dismiss="alert" aria-hidden="true">×</button>
				<h4>
					注意!
				</h4> <strong>Warning!</strong> Imperfect system  Please handle with care <!-- <a href="#" class="alert-link">alert link</a> -->
			</div>
		</div>
	</div>
	<!-- ---------------------- -->
	<div class="row clearfix">
		<div class="col-md-2 column" style="background: url('<%=request.getContextPath()%>/static/jpg/plief.jpg');">
			阿萨德
		</div>
		<!-- ---------↑左---↓中---------- -->
		<div class="col-md-6 column">
			阿萨德
		</div>
		<!-- ---------↑中---↓右---------- -->
		<div class="col-md-4 column">
		
		</div>
	</div>
</div>
</body>
</html>