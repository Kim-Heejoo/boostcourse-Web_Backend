package examples;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LifecycleServlet")
public class LifecycleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public LifecycleServlet() {
        System.out.println("LifecycleServlet 생성!!");
    }


	public void init(ServletConfig config) throws ServletException {
		System.out.println("init test 호출!!");
	}


	public void destroy() {
		System.out.println("destroy 호출!!");
	}


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service 호출!!");
	}

}
