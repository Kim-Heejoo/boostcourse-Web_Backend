package org.edwith.webbe.guestbook.servlet;

import org.edwith.webbe.guestbook.dao.GuestbookDao;
import org.edwith.webbe.guestbook.dto.Guestbook;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/guestbooks/write")
public class GuestbookWriteServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	GuestbookDao guestbookDao = new GuestbookDao();
    	request.setCharacterEncoding("UTF-8");
    	guestbookDao.addGuestbook(new Guestbook(request.getParameter("name"),request.getParameter("content")));
    	
    	response.sendRedirect("/guestbooks");

    }

}
