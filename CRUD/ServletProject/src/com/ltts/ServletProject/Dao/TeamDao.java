package com.ltts.ServletProject.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ltts.ServletProject.configure.MyConnection;
import com.ltts.ServletProject.model.Player;
import com.ltts.ServletProject.model.Team;


public class TeamDao {

	
	public boolean insertTeam(Team t) throws Exception
	{
	
	Connection c=MyConnection.getConnection();
	PreparedStatement ps=c.prepareStatement("insert into Team values(?,?,?)");
	ps.setInt(1, t.getTeamid());
	ps.setString(2, t.getTeamname());	
	ps.setString(3,t.getTeamowner());
	return ps.execute();
	}
	
	public List<Team> getAllTeams() throws Exception{
		List<Team> li=new ArrayList<Team>();
		Connection c=MyConnection.getConnection(); // TRanfers control to another 
		Statement ps=c.createStatement();
		ResultSet rs=ps.executeQuery("select * from Team");
		Team p=new Team();
		while(rs.next()) {
			li.add(new Team(rs.getInt(1),rs.getString(2),rs.getString(3)));
			
		}
		return li;
	}
	
		public Team getTeamById(int tid) throws Exception {
			Team t=new Team();
			List<Team> li=getAllTeams();
			for(Team t1:li) {
				if(t1.getTeamid() == tid) {
					t.setTeamid(tid);
					t.setTeamid(t1.getTeamid());
					t.setTeamname(t1.getTeamname());
					t.setTeamowner(t1.getTeamowner());
					
					
			
					
					
				}
			}
			
			return t;
		
	}
	public boolean updateTeam(int teamid, String teamname, String teamowner) throws Exception {
		// TODO Auto-generated method stub
		
		Connection c=MyConnection.getConnection();
		PreparedStatement ps=c.prepareStatement("UPDATE Team SET Teamname = ?,Teamowner = ? where Teamid=?");
		ps.setString(1,teamname);
		ps.setString(2, teamowner);
		
		ps.setInt(3, teamid);
		
	
	return ps.execute();
	
	
	
		
	
	
	
	
	}
	
	
}
