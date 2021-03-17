package com.ltts.ServletProject.model;

public class Auction {

	private int Auctionid;
	private int Playerid;
	private int Teamid;
	private int year;
	private int amount;
	
	
	
	public Auction() {
		super();
	}
	public Auction(int auctionid, int playerid, int teamid, int year, int amount) {
		super();
		Auctionid = auctionid;
		Playerid = playerid;
		Teamid = teamid;
		this.year = year;
		this.amount = amount;
	}
	public int getAuctionid() {
		return Auctionid;
	}
	public void setAuctionid(int auctionid) {
		Auctionid = auctionid;
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
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Auction [Auctionid=" + Auctionid + ", Playerid=" + Playerid + ", Teamid=" + Teamid + ", year=" + year
				+ ", amount=" + amount + "]";
	}
	
	
	
	
}
