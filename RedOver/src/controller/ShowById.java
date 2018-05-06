package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Anime;  
import model.UtilsAnime;

 
@WebServlet("/Show")
public class ShowById extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@Override 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		UtilsAnime op = new UtilsAnime();
		long id=Long.parseLong(request.getParameter("id"));
		Anime datos = op.showAnime(id);
		request.setAttribute("datos", datos);
		request.getRequestDispatcher("AnimeStat.jsp").forward(request, response);
	}

	@Override 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		doGet(request, response);
	}

}
