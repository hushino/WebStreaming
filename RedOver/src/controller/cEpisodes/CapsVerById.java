package controller.cEpisodes;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
import dao.Episodio; 
import model.UtilsCaps;

@WebServlet("/Ver")
public class CapsVerById extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		UtilsCaps op = new UtilsCaps();
		long id=Long.parseLong(request.getParameter("id"));
		//String titleCap = request.getParameter("id");
		Episodio capitulos = op.ShowEpisodio(id);
		request.setAttribute("capitulos", capitulos);
		request.getRequestDispatcher("Ver.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
