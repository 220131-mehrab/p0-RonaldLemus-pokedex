package com.revature.pokedex;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.tomcat.util.http.fileupload.IOUtils;

import java.io.IOException;
import java.io.InputStream;

public class DefaultServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fileName = req.getPathInfo().replaceFirst("/",""); //Get file from path
        if(fileName.equals(""))
            fileName = "index.html";

        InputStream file = getClass().getClassLoader().getResourceAsStream(fileName); //Open file from path
        if (file == null){
            resp.setStatus(404);
            resp.getWriter().println("File Not Found");
            return;
        }

        IOUtils.copy(file, resp.getOutputStream()); //Copy contents of file input stream to output stream
    }
}
