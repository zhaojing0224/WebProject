package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import object.UserInfoObj;

/**
 * Servlet implementation class RakutenLogin
 */
@WebServlet("/RakutenLogin")

public class RakutenLogin extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RakutenLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setCharacterEncoding("UTF-8");
		// 在 Servlet 中
		RequestDispatcher dispatcher = request.getRequestDispatcher("/RakutenLogin.jsp");
		dispatcher.forward(request, response);
		System.out.println(111);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		UserInfoObj userInfoObj = new UserInfoObj();
		
		userInfoObj.setEmail(request.getParameter("email"));
        userInfoObj.setUserId(request.getParameter("userId"));
        userInfoObj.setPassword(request.getParameter("password"));
        userInfoObj.setNameSei(request.getParameter("nameSei"));
        userInfoObj.setNameMei(request.getParameter("nameMei"));
        userInfoObj.setNameSeiKata(request.getParameter("nameSeiKata"));
        userInfoObj.setNameMeiKata(request.getParameter("nameMeiKata"));
        System.out.println(222);
		request.setAttribute("userInfoObj", userInfoObj);
		
		
        HttpSession session = request.getSession();
        session.setAttribute("userInfoObj", userInfoObj);
	    
		RequestDispatcher dispatcher = request.getRequestDispatcher("/RakutenConfirmtion.jsp");
		dispatcher.forward(request, response);
	}

	
}
