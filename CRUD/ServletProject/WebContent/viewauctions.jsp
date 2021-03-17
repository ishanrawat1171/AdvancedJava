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
AuctionDao ad=new AuctionDao();
List<Auction> li=ad.getAllAuctions();
%>
<table>
<tr>
<th>Auctionid</th>
<th>Playerid</th>
<th>Teamid</th>
<th>year</th>
<th>amount</th>

<th></th>
</tr>
<%
for(Auction a:li){
%>
<tr>
<td><%= a.getAuctionid() %></td>
<td><%= a.getPlayerid() %></td>
<td><%= a.getTeamid() %></td>
<td><%= a.getYear() %></td>
<td><%= a.getAmount() %></td>

<td><a href="editauction.jsp?id=<%=a.getAuctionid()%>">Update</a></td>
</tr>
<%} %>
</table>

</body>
</html>