package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Anime;
import model.UtilsAnime;

@WebServlet("/Add")
public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Add() {
		super();
	}
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");

		UtilsAnime op = new UtilsAnime();
		
		/*String[] tec = request.getParameterValues("tags");
		String tecs = String.join(",", tec);*/
		
		op.addAnime(new Anime(
				
								request.getParameter("title"), 
								request.getParameter("sinopsis"),
								request.getParameter("state"),
								request.getParameter("type"),
								request.getParameter("frontimage"),
								request.getParameter("backgroundimage"), null
				             )
				
				   );
		//response.sendRedirect("");
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

}
