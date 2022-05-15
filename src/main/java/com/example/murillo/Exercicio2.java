package com.example.murillo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/exercicio2")
public class Exercicio2 extends HttpServlet {
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

        out.println("<h1>Exercicio 2</h1>");

        String nomeTime1 = request.getParameter("nome1");
        String nomeTime2 = request.getParameter("nome2");

        int golTime1 = Integer.parseInt(request.getParameter("gol1"));
        int golTime2 = Integer.parseInt(request.getParameter("gol2"));
        out.println("<br>");
        out.println("<h1>" + nomeTime1 + " X "+ nomeTime2);
        out.println("<br>");
        out.println("<br>");

        if (golTime1 > golTime2) {
            out.println("quem ganhou a partida foi o time: " + nomeTime1 + " com " + golTime1 + " gols ");
        } else if(golTime2>golTime1) {
            out.println("quem ganhou a partida foi o time: " + nomeTime2+ " com " + golTime2 + " gols ");
        }else{
            out.println("houve um empate. ambos times marcaram: " + golTime1 + " gols ");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
