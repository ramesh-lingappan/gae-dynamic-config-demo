package com.rameshl.gaeconfig.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * GaeDynamicConfig Created by ramesh on 03/11/18.
 */
@SuppressWarnings("serial")
@WebServlet(name = "helloworld", value = "/")
public class HelloServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter out = resp.getWriter();
        out.println("Hello World Servlet");
    }
}
