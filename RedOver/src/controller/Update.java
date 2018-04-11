package controller;

import java.io.IOException;

import javax.servlet.ServletException; 
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Anime;
import model.UtilsAnime;

 
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		UtilsAnime op = new UtilsAnime();
		Anime anime = op.ShowAnime(Long.parseLong(request.getParameter("id")));
		anime.setNombre(request.getParameter("nom"));
		anime.setApellido(request.getParameter("correo"));
		op.updateAnime(anime);
		response.sendRedirect(request.getContextPath());

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
