<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
   <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Gamerscore App</title>
</head>
<body>
   <h1>Gamerscore login</h1>
   <form action="userAction">
      <label for="name">Enter your login name</label><br/>
      <input type="text" name="name"/>
      <input type="submit" value="login"/>
   </form>
</body>
</html>