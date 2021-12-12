package com.sample;

import com.sample.model.BooksType;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

//@WebServlet(name = "selectBookServlet",
//        urlPatterns = "/SelectBooks"
//        )
public class gitSelectBookServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
            String BookType = req.getParameter("Language");

            BookService bookService = new BookService();
            BooksType b = BooksType.valueOf(BookType);

            List avlBooks = bookService.getAvailableBooks(b);

            req.setAttribute("bname",avlBooks);

            RequestDispatcher view = req.getRequestDispatcher("result.jsp");
            view.forward(req, res);
    }
}
