package adrien.devweb.login.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet ("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("userName");
        String passWord = req.getParameter("passWord");

        String user = "admin";
        String pass = "12345678";

        if  (user.equals(userName) && pass.equals(passWord)){

            req.setAttribute("usuarioLogado", userName);
            req.getRequestDispatcher("welcome.jsp").forward(req, resp);

        } else {
            req.setAttribute("erro","Usuário e/ou senha incorretas!");
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        }
    }
}