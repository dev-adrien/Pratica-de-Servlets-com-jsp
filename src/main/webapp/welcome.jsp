<%--
  Created by IntelliJ IDEA.
  User: adrien
  Date: 26/05/2026
  Time: 10:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
  <title>Bem Vindo</title>
</head>
<body>
<h1>Sistema Java + Servlet</h1>
<p>Olá, <%= request.getAttribute("usuarioLogado") %>! Seja bem-vindo!</p>
</body>
</html>