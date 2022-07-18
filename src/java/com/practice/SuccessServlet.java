/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practice;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hp
 */
public class SuccessServlet extends HttpServlet {
    
 protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException   
 {
  response.setContentType("text/html");
  PrintWriter out=response.getWriter();
  out.println("this is success servlet");
  out.println("<h2>Successfull Registered");
 }    
}
