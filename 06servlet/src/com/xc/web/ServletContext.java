package com.xc.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sound.midi.Soundbank;
import java.io.IOException;

public class ServletContext extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        javax.servlet.ServletContext servletContext = getServletConfig().getServletContext();
        String userName = servletContext.getInitParameter("userName").toString();
        String password = servletContext.getInitParameter("password").toString();
        System.out.println("userName " + userName);
        System.out.println("password " + password);
        String contextPath = servletContext.getContextPath();
        System.out.println("获取的工程路径ContextPath " + contextPath);
        String realPath = servletContext.getRealPath("/");
        System.out.println("获取工程的磁盘路径： " + realPath);


    }
}
