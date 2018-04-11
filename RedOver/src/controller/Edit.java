package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Anime;
import model.UtilsAnime;

@WebServlet(name = "Update", urlPatterns = {"/Update"})
public class Edit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		 response.setContentType("text/html;charset=UTF-8");
		 UtilsAnime op = new UtilsAnime();
		 Anime anime = op.ShowAnime(Long.parseLong(request.getParameter("id")));
		 long id = anime.getId();
		 String nombre = anime.getNombre();
		 String correo = anime.getApellido();
		 request.setAttribute("nombre", nombre);
		 request.setAttribute("correo", correo);
		 request.setAttribute("id", id);
		 request.getRequestDispatcher("Update.jsp").forward(request, response);
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
