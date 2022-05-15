package com.example.murillo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/exercicio6")
public class Exercicio6 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("</body>");
        out.println("<meta charset=\"ISO-8859-1\">");
        out.println("<title>Insert title here</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Cardapio do IFG</h1>");

        String nome = request.getParameter("nome");
        String endereco = request.getParameter("endereco");
        String sobrenome = request.getParameter("sobrenome");
        String cidade = request.getParameter("cidade");

        out.println("<li>Nome: " + nome + "</li>");
        out.println("<li>Sobrenome: " + sobrenome + "</li>");
        out.println("<li>Cidade: " + cidade + "</li>");

        String[] lista = request.getParameterValues("produtos");
        out.println("<li>Produtos:</li>");
        out.println("<ul>");
        for (String item : lista) {
            out.println("<li>" + item + "</li>");
        }
        out.println("<li>Endereço: " + endereco + "</li>");

        out.println("</ul>");
        out.println("</ul>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}