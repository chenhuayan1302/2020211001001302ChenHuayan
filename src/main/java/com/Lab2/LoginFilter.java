package com.Lab2;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "Lab2.LoginFilter",
        urlPatterns = {"/Lab2/validation.jsp","/welcome.jsp"})
public class LoginFilter implements Filter {
    public void destroy() {
        System.out.println("i am in Lab2.LoginFilter--destroy()");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("i am in Lab2.LoginFilter--doFilter()-- request before chain()");
        HttpServletRequest request= (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        if (request.getSession(false)!=null&&request.getSession(false).getAttribute("login")!=null) {
            System.out.println(request.getSession(false).getAttribute("login"));
            request.getRequestDispatcher("/Lab2/welcome.jsp").forward(request,response);
        } else {
            response.sendRedirect("login.jsp");
            return;//to resolve the error java.lang.IllegalStateException
        }
        chain.doFilter(req, resp);
        System.out.println("i am in Lab2.LoginFilter--destroy()-- response after chain()");
    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("i am in Lab2.LoginFilter--init()");
    }

}
