<%-- 
    Document   : Administrator
    Created on : Sep 30, 2016, 10:12:45 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body
        <div>
        <center>
            <div class="logo"><img src="images/logo.png" height="150px" width="300px"></div>
     <form action="TaikhoanServlet" method="GET">
                <h1> Thêm tài khoản </h1>
                
                <table  border="0px" > 
                <span style="text-align: left ">
                    <tr>
                        <th>Username: </th><td><input type="text" name="username" value="" size="20" /> </td>
                    </tr>
                    <tr>
                        <th>Pass: </th><td><input type="password" name="pass" value="" size="20" /> </td>
                    </tr>
                    <tr>
                        <th>Vai trò: </th><td><input type="text" name="vaitro" value="" size="20" /> </td>
                    </tr>
                    <tr>
                        <th>Họ tên: </th><td><input type="text" name="hoten" value="" size="20" /> </td>
                    </tr>
                    <tr>
                        <th>Địa chỉ: </th><td><input type="text" name="diachi" value="" size="20" /> </td>
                    </tr>
                    <tr>
                        <th>Email: </th><td><input type="text" name="email" value="" size="20" /> </td>
                    </tr>
                    <tr>
                        <th>SĐT: </th><td><input type="text" name="sdt" value="" size="20" /> </td>
                    </tr>
                    <tr>
                        <th></th>
                        <td>
                            <input type="submit" value="Đăng ký" name="dangky" /> 
                            
                        </td>
                    </tr>
                </span>
                </table>
                </form>
        </center>
        </div>
        <div class="footer">
						
					Giấy phép đăng ký số :... <br />
					<b>Biên tập</b>: Lương Đức Khánh...  -<b>Phone:</b> 01206215477 - <b>Facbook</b>:Luongduckhanh<br /><br />
					Công ty trách nhiệm hữu hạn 1 thành viên ITLAB<br />
					<b>Địa chỉ : </b>FPT- ĐN. <br />
					Chi nhánh  :<br />
					- .... <br />
					- .... <br />
					- .... <br />
										
					</div>
</body>
</html>
