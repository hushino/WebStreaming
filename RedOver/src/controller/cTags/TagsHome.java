package controller.cTags;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Tags;
import model.UtilsTags;

@WebServlet("/Tags")
public class TagsHome extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TagsHome() {
		super();
	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		response.setContentType("text/html;charset=UTF-8");
		
		UtilsTags op2 = new UtilsTags();
		List<Tags>  tag =  op2.getTags();
		request.setAttribute("tag", tag);
		request.getRequestDispatcher("tags.jsp").forward(request, response);
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
