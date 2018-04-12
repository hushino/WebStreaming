package controller.cEpisodes;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 

@WebServlet("/CapsAdd")
public class CapsAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CapsAdd() {
		super();

	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*response.setContentType("text/html;charset=UTF-8");
		UtilsCaps op = new UtilsCaps();
		UtilsAnime op2 = new UtilsAnime();
		Anime animt = op2.ShowAnime(Long.parseLong(request.getParameter("id")));
		 
		op.AddCapitulo(new Episodio(request.getParameter("title"),
				request.getParameter("imageCap"),
				0,
				null,
				null,
				animt
				
				)
				
				);*/
	}
	
	/*request.getParameter("title"),
	
	request.getParameter("imageCap"),
						
	request.getParameter("chapter"),
						
	request.getParameter("server"),*/
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
