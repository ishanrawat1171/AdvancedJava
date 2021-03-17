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
TeamDao td=new TeamDao();
List<Team> li=td.getAllTeams();
%>
<table>
<tr>
<th>Teamid</th>
<th>Teamname</th>
<th>Teamowner</th>

<th></th>
</tr>
<%
for(Team t:li){
%>
<tr>
<td><%= t.getTeamid() %></td>
<td><%= t.getTeamname() %></td>
<td><%= t.getTeamowner() %></td>

<td><a href="editteam.jsp?id=<%=t.getTeamid()%>">Update</a></td>
</tr>
<%} %>
</table>

</body>
</html>