package org.o7planning.tutorial.servlet.other;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RedirectDemoServlet
 */
@WebServlet("/other/redirectDemo")
public class RedirectDemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RedirectDemoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// Obtenez de la valeur de param�tre (parameter) sur URL.
				String redirect = request.getParameter("redirect");

				if ("true".equals(redirect)) {
					System.out.println("Redirect to ShowMeServlet");

					// contextPath: est une chaine vide "" ou non-vide.
					// Si elle est non vide, elle commence toujours par /
					// et ne se termine pas par /
					String contextPath = request.getContextPath();

					// ==> /ServletTutorial/showMe
					response.sendRedirect(contextPath + "/showMe");
					return;
				}

				ServletOutputStream out = response.getOutputStream();
				out.println("<h3>Text of RedirectDemoServlet</h3>");
				out.println("- servletPath=" + request.getServletPath());

				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
