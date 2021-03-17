package com.ltts.ServletProject.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ltts.ServletProject.configure.MyConnection;
import com.ltts.ServletProject.model.Player;

public class PlayerDao {

	
	public boolean insertPlayer(Player p) throws Exception
	{
		
		
		Connection c=MyConnection.getConnection();
		PreparedStatement ps=c.prepareStatement("insert into Player values(?,?,?,?,?,?,?,?,?)");
		ps.setInt(1, p.getPlayerid());
		ps.setInt(2, p.getTeamid());	
		ps.setString(3,p.getName());
		ps.setString(4, p.getDOB());
		ps.setString(5, p.getEmail());
		ps.setInt(6, p.getMatches());
		ps.setInt(7, p.getRuns());
		ps.setInt(8, p.getWickets());
		ps.setString(9, p.getAchievements());
		
	
	return ps.execute();
	
	}
	public List<Player> getAllPlayers() throws Exception{
		List<Player> li=new ArrayList<Player>();
		Connection c=MyConnection.getConnection(); // TRanfers control to another 
		Statement ps=c.createStatement();
		ResultSet rs=ps.executeQuery("select * from Player");
		Player p=new Player();
		while(rs.next()) {
			li.add(new Player(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getInt(7),rs.getInt(8),rs.getString(9)));
			
		}
		return li;
	}
		public Player getPlayerById(int id) throws Exception {
			Player p=new Player();
			List<Player> li=getAllPlayers();
			for(Player p1:li) {
				if(p1.getPlayerid() == id) {
					p.setPlayerid(id);
					p.setTeamid(p1.getTeamid());
					p.setName(p1.getName());
					p.setDOB(p1.getDOB());
					p.setEmail(p1.getEmail());
					p.setMatches(p1.getMatches());
					p.setRuns(p1.getRuns());
					p.setWickets(p1.getWickets());
					p.setAchievements(p1.getAchievements());
				
			
					
					
				}
			}
			
			return p;
		
	}
		public boolean updatePlayer(int playerid, int teamid, String name, String dOB, String email, int matches,
				int runs, int wickets, String achievements) throws Exception {
			// TODO Auto-generated method stub
			
			Connection c=MyConnection.getConnection();
			PreparedStatement ps=c.prepareStatement("UPDATE Player SET Name = ?,DOB = ?,Email = ?,Matches = ?,Runs = ?,Wickets = ?,Achievements = ? where Playerid=?");
			ps.setString(1,name);
			ps.setString(2, dOB);
			ps.setString(3, email);
			ps.setInt(4, matches);
			ps.setInt(5, runs);
			ps.setInt(6, wickets);
			ps.setString(7, achievements);
			ps.setInt(8, playerid);
			
		
		return ps.execute();
		}
	

}
