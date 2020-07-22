package com.xc.web;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class HelloServlet implements Servlet {
    public HelloServlet() {
        System.out.println("1构造器方法");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

        System.out.println("init时候Name为：" + servletConfig.getServletName());
        System.out.println("参数name1：" +servletConfig.getInitParameter("name01") );
        System.out.println("参数name2：" +servletConfig.getInitParameter("name02") );
        System.out.println("context: " + servletConfig.getServletContext());
        System.out.println("2.init方法");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("3service方法");
        HttpServletRequest httpServlet = (HttpServletRequest)servletRequest;
        if ("GET".equals(httpServlet.getMethod()))
            System.out.println("这是GET请求");
        else
            System.out.println("这是POST请求");


    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("4destory方法");

    }
}
