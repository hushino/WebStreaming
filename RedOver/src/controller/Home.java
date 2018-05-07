package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Anime;
import model.UtilsAnime; 


@WebServlet("/Anime")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Home() {
		super();
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// init
	}
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		response.setContentType("text/html;charset=UTF-8");
		UtilsAnime op = new UtilsAnime();
		List<Anime> datos = op.getAnime();
		/*UtilsTags op2 = new UtilsTags();
		List<Tags> tag = op2.getTags();*/
		request.setAttribute("datos", datos);
		/*request.setAttribute("tag", tag);*/
		request.getRequestDispatcher("Anime.jsp").forward(request, response);
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
