<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import ="java.util.*,com.ltts.ServletProject.model.*,com.ltts.ServletProject.Dao.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
PlayerDao pd=new PlayerDao();
List<Player> li=pd.getAllPlayers();
%>
<table>
<tr>
<th>Player Id</th>
<th>Team ID</th>
<th>Name</th>
<th>DOB</th>
<th>Email</th>
<th>Matches</th>
<th>Runs</th>
<th>Wickets</th>
<th>Achievements</th>
<th></th>
</tr>
<%
for(Player p:li){
%>
<tr>
<td><%= p.getPlayerid() %></td>
<td><%= p.getTeamid() %></td>
<td><%= p.getName() %></td>
<td><%= p.getDOB() %></td>
<td><%= p.getEmail() %></td>
<td><%= p.getMatches() %></td>
<td><%= p.getRuns() %></td>
<td><%= p.getWickets() %></td>
<td><%= p.getAchievements() %></td>
<td><a href="editplayer.jsp?id=<%=p.getPlayerid()%>">Update</a></td>
</tr>
<%} %>
</table>

</body>
</html>