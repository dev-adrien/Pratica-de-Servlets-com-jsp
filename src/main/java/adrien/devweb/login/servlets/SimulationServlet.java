package adrien.devweb.login.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.util.Locale;

@WebServlet("/simulate")
public class SimulationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double valorVeiculo = Double.parseDouble(req.getParameter("valorVeiculo"));
        double entrada = Double.parseDouble(req.getParameter("entrada"));
        double taxaJurosPercentual = Double.parseDouble(req.getParameter("taxaJuros"));
        int prazoMeses = Integer.parseInt(req.getParameter("prazo"));

        double valorFinanciado = valorVeiculo - entrada;
        double taxaJurosMensal = taxaJurosPercentual / 100.0;
        
        double valorParcela = 0;
        if (taxaJurosMensal > 0) {
            valorParcela = (valorFinanciado * taxaJurosMensal * Math.pow(1 + taxaJurosMensal, prazoMeses)) / (Math.pow(1 + taxaJurosMensal, prazoMeses) - 1);
        } else {
            valorParcela = valorFinanciado / prazoMeses;
        }

        double totalPago = (valorParcela * prazoMeses) + entrada;
        double totalJuros = (valorParcela * prazoMeses) - valorFinanciado;

        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();

        String responseHTML = """
            <!DOCTYPE html>
            <html lang='pt-br'>
            <head><title>Resultado da Simulação</title></head>
            <body>
                <h1>Resultado da Simulação usando Java Text Blocks</h1>
                <hr>
                <ul>
                   <li><strong>Valor Financiado:</strong> %s</li>
                   <li><strong>Quantidade de Parcelas:</strong> %d meses</li>
                   <li><strong>Valor da Parcela:</strong> %s</li>
                   <li><strong>Total Pago de Juros:</strong> %s</li>
                   <li><strong>Valor Total Pago (com entrada):</strong> %s</li>
                </ul>
                <br>
                <a href='simulation.jsp'>Refazer simulação</a>
            </body>
            </html>
            """.formatted(
                formatoMoeda.format(valorFinanciado),
                prazoMeses,
                formatoMoeda.format(valorParcela),
                formatoMoeda.format(totalJuros),
                formatoMoeda.format(totalPago)
            );

        out.println(responseHTML);
    }
}
