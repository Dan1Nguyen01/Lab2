/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ca.sait.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dan Nguyen
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String mess = "---";
        
        request.setAttribute("mess", mess);
       this.getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String numStr1 = request.getParameter("firstNum");
       String numStr2 = request.getParameter("secondNum");
       String operation = request.getParameter("operation");
         String mess;
      
    try{
         double first = Double.parseDouble(numStr1);
       double second = Double.parseDouble(numStr2);
       
      
       Double result;
         switch(operation){
           case  "+":{
               result = second + first;
               break;
           }
           case  "-":{
               result  =second -first;
              break; 
           }
           case  "*":{
               result = first *second;
           }break;
           case  "%":{
               result=first%second;
           }break;
           default :{
               result=Double.NaN;
           }
           
       }
      
       request.setAttribute("result",result);
       
       
        if (Double.isNaN(result)){
           mess = "Please enter both numbers";
         
       }else{
            mess = Double.toString(result);
                
       }
    }catch (Exception ex){
        mess = "Invalid";
    }
           
       
      
     
       
       request.setAttribute("mess",mess);
       this.getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

  
}
