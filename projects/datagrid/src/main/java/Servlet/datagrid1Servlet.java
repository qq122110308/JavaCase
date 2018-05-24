package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author ry
 * @date 2018-05-23
 */
public class datagrid1Servlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();//设定传参变量
		 
		out.print("{\"rows\":[{\"code\":\"张三\",\"name\":\"Code\",\"price\":100},{\"code\":\"李四\",\"name\":\"code\",\"price\":100},{\"code\":\"王五\",\"name\":\"code\",\"price\":100}]}");//结果传到前台
	}
	
}
