<%-- 
    Document   : Login
    Created on : Sep 30, 2016, 10:11:10 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/stylelogin.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
   <body>
<div id="loginpanelwrap">
  	
	<div class="loginheader">
    <div class="logintitle"><a href="#">login</a></div>
    </div>

    <form action="LoginServlet" method="POST">
    <div class="loginform">
        
        <div class="loginform_row">
        <label>Username:</label>
        <input type="text" class="loginform_input" name="t1" />
        </div>
        <div class="loginform_row">
        <label>Password:</label>
        <input type="password" class="loginform_input" name="t2" />
        </div>
        <div class="loginform_row">
        <input type="submit" class="loginform_submit" value="Login" />
        </div> 
        <div class="clear"></div>
    </div>
    </form>

</div>

    	
</body>
</html>
