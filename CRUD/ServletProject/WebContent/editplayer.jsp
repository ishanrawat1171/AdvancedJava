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
int id=Integer.parseInt(request.getParameter("id"));
PlayerDao pd=new PlayerDao();
Player p1=pd.getPlayerById(id);
%>
<form action="./UpdatePlayerServlet" method="post">
Player PlayerId: <input type="text" value="<%= p1.getPlayerid() %>" name="Playerid"><br><br>
Player Teamid: <input type="text" value="<%= p1.getTeamid() %>" name="Teamid"><br><br>
Player Name: <input type="text" value="<%= p1.getName() %>" name="Name"><br><br>
Player DOB: <input type="text" value="<%= p1.getDOB() %>" name="DOB"><br><br>
Player Email: <input type="text" value="<%= p1.getEmail() %>" name="Email"><br><br>
Player Matches: <input type="text" value="<%= p1.getMatches() %>" name="Matches"><br><br>
Player Runs: <input type="text" value="<%= p1.getRuns() %>" name="Runs"><br><br>
Player Wickets: <input type="text" value="<%= p1.getWickets() %>" name="Wickets"><br><br>
Player Achievements: <input type="text" value="<%= p1.getAchievements() %>" name="Achievements"><br><br>
<input type="submit" value="Update Player">

</form>
</body>
</html>