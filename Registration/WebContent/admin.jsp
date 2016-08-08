<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="ko">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Registration Admin</title>

    <link href="<%=request.getContextPath()%>/css/bootstrap.min.css" rel="stylesheet">

    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
  	<div class="container">
	    <h1>Registration</h1>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>number</th>
					<th>name</th>
					<th>attendance</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>1</td>
					<td>Mark</td>
					<td><button type="button" class="btn btn-default">Default</button></td>
				</tr>
				<tr>
					<td>1</td>
					<td>Mark</td>
					<td><button type="button" class="btn btn-default">Default</button></td>
				</tr>			
			</tbody>
		</table>
	</div>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="<%=request.getContextPath()%>/js/bootstrap.min.js"></script>
  </body>
</html>