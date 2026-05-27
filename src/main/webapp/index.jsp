<%--
  Created by IntelliJ IDEA.
  User: adrien
  Date: 25/05/2026
  Time: 09:00
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="pt-br">
<head>
    <title>Login</title>
</head>
<body>
    <h1>Login:</h1>
    <% if (request.getAttribute("erro") != null) { %>
        <script>
            alert("<%= request.getAttribute("erro")%>")
        </script>
    <% } %>
    <form action="login" method="post">
        <label for="userName">Usuário: </label>
        <input type="text" name="userName" id="userName">

        <label for="passWord">Senha: </label>
        <input type="text" name="passWord" id="passWord">

        <button type="submit">Enviar</button>
    </form>
</body>
</html>
