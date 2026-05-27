<%--
  Created by IntelliJ IDEA.
  User: adrien
  Date: 26/05/2026
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simulação</title>
</head>
<body>
    <h1>Simulação de Financiamento de Veículo</h1>
    <form action="simulate" method="post">
        <label for="valorVeiculo">Valor do Veículo (R$):</label><br>
        <input type="number" step="0.01" name="valorVeiculo" id="valorVeiculo" required><br><br>

        <label for="entrada">Valor da Entrada (R$):</label><br>
        <input type="number" step="0.01" name="entrada" id="entrada" required><br><br>

        <label for="taxaJuros">Taxa de Juros Mensal (%):</label><br>
        <input type="number" step="0.01" name="taxaJuros" id="taxaJuros" required><br><br>

        <label for="prazo">Prazo (em meses):</label><br>
        <input type="number" name="prazo" id="prazo" required><br><br>

        <button type="submit">Simular Financiamento</button>
    </form>
</body>
</html>
