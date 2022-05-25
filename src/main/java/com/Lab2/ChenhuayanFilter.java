package com.Lab2;

import javax.servlet.*;
import java.io.IOException;

public class ChenhuayanFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("ChenhuayanFilter-->before chain");
        chain.doFilter(req, resp);
        System.out.println("ChenhuayanFilter-->after chain");
    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("ChenhuayanFilter-->before chain");
        System.out.println("LoginFilter-->before chain");
        System.out.println("LoginFilter-->after chain");
        System.out.println("ChenhuayanFilter-->after chain");

    }

}