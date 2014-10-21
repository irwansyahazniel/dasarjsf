package id.co.skyworx.basicjsf;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		
		String name = req.getParameter("name");
		String age = req.getParameter("age");
//		resp.getWriter().print("<html>");
//		resp.getWriter().print("<body>");
//		resp.getWriter().print(
//				"<h3>Hello " + name + " This is my first servlet</h3>");
//		resp.getWriter().print("</body>");
//		resp.getWriter().print("</html>");
//		name = name + " 1234";
//		age = age + " 1234";
		req.setAttribute("name", name);
		req.setAttribute("age", age);
		
		// untuk memanggil servlet
		req.getRequestDispatcher("output.jsp").forward(req, resp);
	}

}
