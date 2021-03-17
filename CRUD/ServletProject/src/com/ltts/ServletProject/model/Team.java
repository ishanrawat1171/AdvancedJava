package com.ltts.ServletProject.model;

public class Team {
	
	private int Teamid;
	private String Teamname;
	private String Teamowner;
	
	
	public Team() {
		super();
	}
	public Team(int teamid, String teamname, String teamowner) {
		super();
		Teamid = teamid;
		Teamname = teamname;
		Teamowner = teamowner;
	}
	public int getTeamid() {
		return Teamid;
	}
	public void setTeamid(int teamid) {
		Teamid = teamid;
	}
	public String getTeamname() {
		return Teamname;
	}
	public void setTeamname(String teamname) {
		Teamname = teamname;
	}
	public String getTeamowner() {
		return Teamowner;
	}
	public void setTeamowner(String teamowner) {
		Teamowner = teamowner;
	}
	@Override
	public String toString() {
		return "Team [Teamid=" + Teamid + ", Teamname=" + Teamname + ", Teamowner=" + Teamowner + "]";
	}
	
	
	

}
