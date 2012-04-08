<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
   <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<head>
	<meta name="keywords" content="" />
	<meta name="description" content="" />
	<meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <LINK href="style/style.css" rel="stylesheet" type="text/css" media="screen" />
</head>
<title>Gamerscore App</title>
</head>

<body>
	<div id="wrapper">
		<div id="header">
			Welcome to the Generic Gamer Profile Project.
		</div>
		<div id="login">
			<form action="user">
				<label>Please enter your name to "login"</label><br/>
				<input type="text" name="name"/>
				<input type="submit" value="login"/>
			</form>
		</div>
	</div>
</body>
</html>