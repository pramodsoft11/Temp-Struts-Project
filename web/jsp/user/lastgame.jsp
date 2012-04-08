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
	<div id="gamertag"><s:property value="#session.user.name"/>
		<form action="logout"><input type="submit" value="logout"/></form>
	</div>
	<div id="menu">
		<ul>
			<li><a href="<s:url action="nav"><s:param name="target" value="%{'summary'}"/></s:url>">Summary</a></li>
			<li class="current_page_item"><a href="#">Last Game</a></li>
		</ul>
	</div>
	<div id="profileContent">
		<div class="profileStat">Kills: <s:property value="#session.user.lastGameStats.kills"/></div>
		<div class="profileStat">Deaths: <s:property value="#session.user.lastGameStats.deaths"/></div>
		<div class="profileStat">Wins: <s:property value="#session.user.lastGameStats.wins"/></div>
		<div class="profileStat">Losses: <s:property value="#session.user.lastGameStats.losses"/></div>
		<div class="profileStat">Time Played: <s:property value="#session.user.lastGameStats.time"/></div>
		<div class="profileStat">Shots: <s:property value="#session.user.lastGameStats.shots"/></div>
		<div class="profileStat">Hits: <s:property value="#session.user.lastGameStats.hits"/></div>
		<div class="profileStat">Accuracy: <s:property value="#session.user.lastGameStats.accuracy"/></div>
	</div>
</div>
</body>
</html>