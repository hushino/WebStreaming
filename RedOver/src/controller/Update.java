package controller;

import java.io.IOException; 

import javax.servlet.ServletException; 
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Anime;
import dao.Episodio;
import model.UtilsAnime;
import model.UtilsCaps;

@WebServlet("/Update")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws IOException {

		response.setContentType("text/html;charset=UTF-8");
		UtilsAnime op = new UtilsAnime();
		UtilsCaps op2 = new UtilsCaps();
		Anime anime = op.showAnime(Long.parseLong(request.getParameter("id")));
		anime.setTitle(request.getParameter("title"));
		anime.setSynopsis(request.getParameter("sinopsis"));
		anime.setState(request.getParameter("state"));
		anime.setType(request.getParameter("type"));/*
		anime.setTags(request.getParameter("tags"));*/
		anime.setFrontimage(request.getParameter("frontimage"));
		anime.setBackgroundimage(request.getParameter("backgroundimage"));
		op.updateAnime(anime);

		op2.AddCapitulo(new Episodio(request.getParameter("titleCap"),
				request.getParameter("imageCap"),
				Integer.parseInt(request.getParameter("chapter")),
				request.getParameter("server"),
				Long.parseLong(request.getParameter("parentId")),
				null,
				anime
				
				));
		 
		 response.sendRedirect(request.getContextPath());
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			processRequest(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			processRequest(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
