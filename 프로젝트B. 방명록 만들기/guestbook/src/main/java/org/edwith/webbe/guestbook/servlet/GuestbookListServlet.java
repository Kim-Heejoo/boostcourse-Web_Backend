package org.edwith.webbe.guestbook.servlet;

import org.edwith.webbe.guestbook.dao.GuestbookDao;
import org.edwith.webbe.guestbook.dto.Guestbook;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/guestbooks")
public class GuestbookListServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("text/html;charset=UTF-8");
    	
    	GuestbookDao guestbookDao = new GuestbookDao();
        
        List<Guestbook> list = new ArrayList<>();
        list = guestbookDao.getGuestbooks();
        
        request.setAttribute("list", list);
        
        RequestDispatcher rd = request.getRequestDispatcher("/guestbooks.jsp");
        rd.forward(request, response);

    }

}
