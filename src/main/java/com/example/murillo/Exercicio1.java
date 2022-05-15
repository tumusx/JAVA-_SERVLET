package com.example.murillo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@WebServlet("/exercicio1")
public class Exercicio1 extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("init porra do projeto(co nfig)");
        super.init(config);
    }

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

        out.println("<h1>Exercicio 1</h1>");

        String nome = request.getParameter("nome");
        int anoNascimento = Integer.parseInt(request.getParameter("ano"));

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy");
        int anoAtual = Integer.parseInt(dtf.format(LocalDateTime.now()));
        int idade = anoAtual - anoNascimento;
        int diasAnos = idade * 365;

        out.println("<p>" + nome.toUpperCase(Locale.ROOT) + ", você nasceu no ano de" + anoNascimento + ", " +
                "tem " + idade + " anos e " + diasAnos + " dias de vida</p>");

        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
