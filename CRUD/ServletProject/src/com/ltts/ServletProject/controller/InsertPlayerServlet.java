package com.ltts.ServletProject.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.ServletProject.model.Player;

import com.ltts.ServletProject.Dao.PlayerDao;

/**
 * Servlet implementation class InsertPlayerServlet
 */
@WebServlet("/InsertPlayerServlet")
public class InsertPlayerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public InsertPlayerServlet() {
        // TODO Auto-generated constructor stub
    	super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 PrintWriter out = response.getWriter(); 
		int Playerid=Integer.parseInt(request.getParameter("Playerid"));
		int Teamid=Integer.parseInt(request.getParameter("Teamid"));
		String Name=request.getParameter("Name");
		String DOB=request.getParameter("DOB");
		String Email=request.getParameter("Email");
		int Matches=Integer.parseInt(request.getParameter("Matches"));
		int Runs=Integer.parseInt(request.getParameter("Runs"));
		int Wickets=Integer.parseInt(request.getParameter("Wickets"));
		String Achievements=request.getParameter("Achievements");
		Player p = new Player(Playerid,Teamid,Name,DOB,Email,Matches,Runs,Wickets,Achievements);
		System.out.println("Inside Player Servlet: "+p);
		PlayerDao pd=new PlayerDao();
		boolean b=false;
		RequestDispatcher rd=null;
		try {
			b=pd.insertPlayer(p); // Control TRanfers to Dao file
			rd=request.getRequestDispatcher("success.html");
			rd.forward(request, response);
			//System.out.println("Successfully Inserted...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			out.write("Already Player id Used: "+e);
			rd=request.getRequestDispatcher("addplayer.html");
			rd.include(request, response);
			e.printStackTrace();
		}

		
		
		
	}

}
