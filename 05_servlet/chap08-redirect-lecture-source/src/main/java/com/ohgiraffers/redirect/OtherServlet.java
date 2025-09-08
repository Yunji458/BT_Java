package com.ohgiraffers.redirect;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/otherservlet")
public class OtherServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("test", "abc");

        // sendRedirect가 302코드만 사용가능 >> 302코드는 브라우저에서 브라우저로 다시 돌아갈수 있음
        // 301번 코드는 돌아가기 불가능 옮기면 없어짐
        resp.sendRedirect("redirect?test=abc");
    }
}
