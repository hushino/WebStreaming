package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Anime;
import model.UtilsAnime;

@WebServlet(name = "Editar", urlPatterns = {"/Editar"})
public class Editar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		 response.setContentType("text/html;charset=UTF-8");
		 UtilsAnime op = new UtilsAnime();
		 Anime anime = op.showAnime(Long.parseLong(request.getParameter("id")));
		 long id = anime.getId();
		 String title = anime.getTitle();
		 String sinopsis = anime.getSynopsis();
		 String state = anime.getState();
		 String type = anime.getType();/*
		 String tags = anime.getTags();*/
		 String frontimage = anime.getFrontimage();
		 String backgroundimage = anime.getBackgroundimage();
		 request.setAttribute("id", id);
		 request.setAttribute("title", title);
		 request.setAttribute("sinopsis", sinopsis);
		 request.setAttribute("state", state);
		 request.setAttribute("type", type);/*
		 request.setAttribute("tags", tags);*/
		 request.setAttribute("frontimage", frontimage);
		 request.setAttribute("backgroundimage", backgroundimage);
		 request.getRequestDispatcher("editar.jsp").forward(request, response);
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		processRequest(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		processRequest(request, response);
	}

}
