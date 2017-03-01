<%-- 
    Document   : Quantriloaisp
    Created on : Oct 24, 2016, 11:46:48 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String error = "";
            if (request.getParameter("error")!=null) {
                    error = (String) request.getParameter("error");
                }
            
            
            %>
       
                   <script>
                        function ac0() {
                            var a0 = 0;
                            document.getElementById("ac").value = a0;

                        }
                        function ac1() {
                            var a1 = 1;
                            document.getElementById("ac").value = a1;
                        }
                        function ac2() {
                            var a2 = 2;
                            document.getElementById("ac").value = a2;
                        }
                        function ac3() {
                            var a3 = 3;
                            document.getElementById("ac").value = a3;
                        }
                      
                    </script>
        <div>
        <center>
     <form action="GetCatalogue" method="SET">
          <div class="logo"><img src="images/logo.png" height="150px" width="300px"></div>
                <h1> Quản trị loại sản phẩm </h1>
               
                <table  border="0px" > 
                <span style="text-align: left ">
                    <tr>
                        <th>Mã loại phẩm: </th><td><input type="text" name="maloai" value="<%=Model.GetCatalogue.Maloai%>" size="20" /> </td>
                    </tr>
                    <tr>
                        <th>Loại sản phẩm: </th><td><input type="text" name="tenloai" value="<%=Model.GetCatalogue.Tenloai %>" size="20" />  </td>
                    </tr>
                    
                   
                    <tr>
                        <th></th>
                        <td> 
                            <input type="submit" value="Thêm" onclick="ac1()" />
                            <input type="submit" value="Sửa" onclick="ac2()" />
                            <input type="submit" value="Xóa" onclick="ac3()" />
                            <input type="submit" value="Tìm kiếm" onclick="ac0()" />
                            
                        </td>
                    </tr>
                    </td></tr>
                         <input type="text" value="" style="display: none" id="ac" name="ac"> 
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
