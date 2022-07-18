/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practice;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

public class RegisterServlet extends HttpServlet {
    
    @Override
    public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
//        request object ki help se data fetch kr skte hae 
//        response object ki help se dynamic response generate kr skte 
//                hae like html 
      response.setContentType("text/html");
//      In servlets the output can be either character or byte. for character data (i.e text) u can use PrintWriter for others use ServletOutputStream
//     PrintWriter: prints text data to a character stream. 
//
//getWriter :Returns a PrintWriter object that can send character text to the client.
      PrintWriter out=response.getWriter();
      out.println("<h2>Welcome to register servlet</h2>");
      String name = request.getParameter("user_name");
      String password = request.getParameter("user_password");
      String email = request.getParameter("user_email");
      String gender = request.getParameter("user_gender");
      String course = request.getParameter("user_course");
//      String getParameter(String name) Returns the value of a request parameter as a String, or null if the parameter does not exist
      String cond = request.getParameter("condition");
      out.println(cond);
      if(cond!=null){
      
      if(cond.equals("checked")){
          out.println("<h2> Name : " + name + "<h2>");
          out.println("<h2> Password : "+ password + "<h2>");
          out.println("<h2> Email : "+ email + "<h2>");
          out.println("<h2> Gender : "+ gender + "<h2>");
          out.println("<h2> Course : "+ course + "<h2>");
          
          //JDBC
          //
          //Saved to db
          RequestDispatcher rd = request.getRequestDispatcher("success");
//         Defines an object that receives requests from the client and sends them to any resource (such as a servlet, HTML file, or JSP file) on the server.
          rd.forward(request,response);
      }
      else{
          out.println("<h2>You have not accepted terms and conditions </h2>");
      }
      }
      else {
            out.println("<h2>You have not accepted terms and conditions </h2>");
          //i want to include output of  index.html
          //get the object of RequestDispatcher
          
          RequestDispatcher rd = request.getRequestDispatcher("index.html");
          //include 
          rd.include(request, response);
      }
    }
    
}
