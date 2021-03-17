package com.ltts.ServletProject.model;

import java.sql.Date;

public class Player {
	private int Playerid;
	private int Teamid;
	private String Name;
	private String DOB;
	private String Email;
	private int Matches;
	private int Runs;
	private int Wickets;
	private String Achievements;
	
	
	public Player() {
		super();
	}
	public Player(int playerid, int teamid, String name, String dOB, String email, int matches, int runs, int wickets,
			String achievements) {
		super();
		Playerid = playerid;
		Teamid = teamid;
		Name = name;
		DOB = dOB;
		Email = email;
		Matches = matches;
		Runs = runs;
		Wickets = wickets;
		Achievements = achievements;
	}
	public int getPlayerid() {
		return Playerid;
	}
	public void setPlayerid(int playerid) {
		Playerid = playerid;
	}
	public int getTeamid() {
		return Teamid;
	}
	public void setTeamid(int teamid) {
		Teamid = teamid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getMatches() {
		return Matches;
	}
	public void setMatches(int matches) {
		Matches = matches;
	}
	public int getRuns() {
		return Runs;
	}
	public void setRuns(int runs) {
		Runs = runs;
	}
	public int getWickets() {
		return Wickets;
	}
	public void setWickets(int wickets) {
		Wickets = wickets;
	}
	public String getAchievements() {
		return Achievements;
	}
	public void setAchievements(String achievements) {
		Achievements = achievements;
	}
	@Override
	public String toString() {
		return "Player [Playerid=" + Playerid + ", Teamid=" + Teamid + ", Name=" + Name + ", DOB=" + DOB + ", Email="
				+ Email + ", Matches=" + Matches + ", Runs=" + Runs + ", Wickets=" + Wickets + ", Achievements="
				+ Achievements + "]";
	}
	
	
	
}
