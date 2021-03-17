package com.ltts.ServletProject.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ltts.ServletProject.configure.MyConnection;
import com.ltts.ServletProject.model.Auction;
import com.ltts.ServletProject.model.Team;

public class AuctionDao {

	public boolean insertAuction(Auction a) throws Exception
	
	{
		
		Connection c=MyConnection.getConnection();
		PreparedStatement ps=c.prepareStatement("insert into Auction values(?,?,?,?,?)");
		ps.setInt(1, a.getAuctionid());
		ps.setInt(2, a.getPlayerid());
		ps.setInt(3, a.getTeamid());
		ps.setInt(4, a.getYear());
		ps.setInt(5, a.getAmount());
		
		return ps.execute();
		
		
	}
	public List<Auction> getAllAuctions() throws Exception{
		List<Auction> li=new ArrayList<Auction>();
		Connection c=MyConnection.getConnection(); // TRanfers control to another 
		Statement ps=c.createStatement();
		ResultSet rs=ps.executeQuery("select * from Auction");
		Auction p=new Auction();
		while(rs.next()) {
			li.add(new Auction(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getInt(5)));
			
		}
		return li;
	}
	
		public Auction getAuctionById(int aid) throws Exception {
			Auction t=new Auction();
			List<Auction> li=getAllAuctions();
			for(Auction t1:li) {
				if(t1.getAuctionid() == aid) {
					t.setAuctionid(aid);
					t.setAuctionid(t1.getAuctionid());
					t.setTeamid(t1.getTeamid());
					t.setYear(t1.getYear());
					t.setAmount(t1.getAmount());
					
					
					
			
					
					
				}
			}
			
			return t;
		
	}
	public boolean updateAuction(int auctionid, int playerid, int teamid,int Year,int Amount) throws Exception {
		// TODO Auto-generated method stub
		
		Connection c=MyConnection.getConnection();
		PreparedStatement ps=c.prepareStatement("UPDATE Auction SET year = ?,amount = ? where Auctionid=?");
		ps.setInt(1,Year);
		ps.setInt(2, Amount);
		
		ps.setInt(3, auctionid);
		
	
	return ps.execute();
	
	
	
	}
	
	
	
}
