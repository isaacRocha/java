
// arquivo MinhaServlet.java
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/nome")
public class MinhaServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		String paramNome = request.getParameter("pNome");
		request.setAttribute("nome", paramNome); // insere atributo
		RequestDispatcher dispatcher = request.getRequestDispatcher("hora.jsp"); // aponta p/ hora.jsp
		dispatcher.forward(request, response); // encaminha p/ JSP

//		String paramNome = request.getParameter("pNome");
//		PrintWriter out = response.getWriter();
//		out.println("<html><head/><body>O nome digitado é " + paramNome + "</body></html>");
	}
}
