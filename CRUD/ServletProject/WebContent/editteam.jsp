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
int tid=Integer.parseInt(request.getParameter("id"));
TeamDao td=new TeamDao();
Team t1=td.getTeamById(tid);
%>
<form action="./UpdateTeamServlet" method="post">
Teamid: <input type="text" value="<%= t1.getTeamid() %>" name="Teamid"><br><br>
Teamname: <input type="text" value="<%= t1.getTeamname() %>" name="Teamname"><br><br>
Teamowner: <input type="text" value="<%= t1.getTeamowner() %>" name="Teamowner"><br><br>

<input type="submit" value="Update Team">

</form>
</body>
</html>