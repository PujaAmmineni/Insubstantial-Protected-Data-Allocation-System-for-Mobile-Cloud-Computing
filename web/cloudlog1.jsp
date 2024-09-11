<%-- 
    Document   : cloudlog1
    Created on : May 23, 2017, 3:43:04 PM
    Author     : java3
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%

    String name = request.getParameter("name");
    String pass = request.getParameter("pass");
    try {
        if (name.equalsIgnoreCase("cloud") && pass.equalsIgnoreCase("cloud")) {
            response.sendRedirect("cloudhome.jsp");
        } else {
            response.sendRedirect("cloudlog.jsp");
        }
    } catch (Exception ex) {
        ex.printStackTrace();
           }
%>