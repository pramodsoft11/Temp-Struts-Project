<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
	<meta name="keywords" content="" />
	<meta name="description" content="" />
	<meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <LINK href="style/style.css" rel="stylesheet" type="text/css" media="screen" />
</head>

<body>
<div id="wrapper">
	<div id="gamertag"><s:property value="user.name"/>
		<form action="logoutAction"><input type="submit" value="logout"/></form>
	</div>
	<div id="menu">
		<ul>
			<li class="current_page_item"><a href="#">Summary</a></li>
			<li><a href="lastgame.jsp">Last Game</a></li>
		</ul>
	</div>
	<div id="profileContent">
		<div class="profileStat">Kills: <s:property value="user.totalStats.kills"/></div>
		<div class="profileStat">Deaths: <s:property value="user.totalStats.deaths"/></div>
		<div class="profileStat">Wins: <s:property value="user.totalStats.wins"/></div>
		<div class="profileStat">Losses: <s:property value="user.totalStats.losses"/></div>
		<div class="profileStat">Time Played: <s:property value="user.totalStats.time"/></div>
		<div class="profileStat">Shots: <s:property value="user.totalStats.shots"/></div>
		<div class="profileStat">Hits: <s:property value="user.totalStats.hits"/></div>
		<div class="profileStat">Accuracy: <s:property value="user.totalStats.accuracy"/></div>
	</div>
	
</div>
</body>
</html>