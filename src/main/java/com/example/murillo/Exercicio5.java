package com.example.murillo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/exercicio5")
public class Exercicio5 extends HttpServlet {
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

        String prato = request.getParameter("prato");
        String sobremesa = request.getParameter("sobremesa");
        String bebida = request.getParameter("bebidas");

        switch (bebida) {
            case "Chá": {
                out.println("Chá: 20 calorias");
                out.println("<br>");
                break;
            }
            case "Suco de laranja": {
                out.println("Suco de laranja: 70 calorias");
                out.println("<br>");
                break;
            }
            case "Refrigerante": {
                out.println("Refrigerante: 100 calorias");
                out.println("<br>");
                break;
            }
            case "Suco de melão": {
                out.println("Suco de melão: 65 calorias");
                out.println("<br>");
                break;
            }
            default:
                out.println("dados incorretos;");
                out.println("<br>");
                break;
        }

        switch (prato) {
            case "Vegetariano": {
                out.println("Vegetariano: 180 calorias");
                out.println("<br>");
                break;
            }
            case "Peixe": {
                out.println("Peixe: 230 calorias");
                out.println("<br>");
                break;
            }
            case "Frango": {
                out.println("Frango: 250 calorias");
                out.println("<br>");
                break;
            }
            case "Carne": {
                out.println("Carne: 350 calorias");
                out.println("<br>");
                break;
            }
            default:
                out.println("dados incorretos;");
                out.println("<br>");
                break;
        }

        switch (sobremesa) {
            case "Abacaxi": {
                out.println("Abacaxi: 75 calorias");
                out.println("<br>");
                break;
            }
            case "Sorvete": {
                out.println("Sorvete: 110 calorias");
                out.println("<br>");
                break;
            }
            case "Mousse": {
                out.println("Mousse: 170 calorias");
                out.println("<br>");
                break;
            }
            case "Torta": {
                out.println("<br>");
                out.println("Torta: 200 calorias");
                break;
            }
            default:
                out.println("escolha pelo menos um docinho. Faz bem para a glicose :D ");
                out.println("<br>");
                break;
        }

        out.println("</ul>");
        out.println("</ul>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}