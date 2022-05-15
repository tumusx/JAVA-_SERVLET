package com.example.murillo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/exercicio4")
public class Exercicio4 extends HttpServlet {
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
        out.println("<h1>Login IFG</h1>");

        String nome = request.getParameter("nome");
        int senha = Integer.parseInt(request.getParameter("senha"));

        if(senha == 123 && nome.equals("IFG")){
            out.println("<ul>");
            out.println("<li>Nome: " + nome + "</li>");
            out.println("<li>Turno: " + senha + "</li>");
            out.println("login realizado com sucesso");
        }else{
            out.println("dados incorretos " + nome + " tente mais uma vez");
        }

        out.println("</ul>");

        out.println("</ul>");

        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
