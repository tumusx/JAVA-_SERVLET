package com.example.murillo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/exercicio3")
public class Exercicio3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("</body>");
        out.println("<meta charset=\"ISO-8859-1\">");
        out.println("<title>Insert title here</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Exercicio 3</h1>");

        int number = Integer.parseInt(request.getParameter("number"));
        out.println("numbero: " + number);
        int multiplicador = 0;
        while(multiplicador<=10){
            int resultado = number * multiplicador;
            out.println("<br>");
            out.println(resultado);
            multiplicador++;
            out.println("<br>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
