

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="POST">
            <p><label>First: </label>
        <input type="number" id="firstNum" name="firstNum"></p>
            
            <p< <label>Second: </label>
        <input type="number" id="secondNum" name="secondNum"></p>
        
            <p>  
        <button type="submit" value="+" name="operation">+</button>
        <button type="submit" value="-" name="operation">-</button>
        <button type="submit" value="*" name="operation">*</button>
        <button type="submit" value="%" name="operation">%</button>
            </p>
      
        </form>
        <% if (request.getAttribute("mess") != null) {%>
        <p>Result: <%= request.getAttribute("mess")%></p>
        <%}%>
   
        
        
        <a href=".">Age Calculator</a>
        
    </body>
</html>
