<%-- 
    Document   : Quantrisanpham
    Created on : Oct 20, 2016, 2:36:56 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
        
        <title>JSP Page</title>
    </head>
     <body>
        <div>
        <center>
              
     <form action="GetProduct" method="post">
          <div class="logo"><img src="images/logo.png" height="150px" width="300px"></div>
                <h1> Quản trị sản phẩm </h1>
               
                <table  border="0px" > 
                <span style="text-align: left ">
                    <tr>
                        <th>Mã sản phẩm: </th><td><input type="text" name="Ma_sp" value="<%=Model.GetProduct.masp%>" size="20" /> </td>
                    </tr>
                    <tr>
                        <th>Tên sản phẩm: </th><td><input type="text" name="Ten_sp" value="<%=Model.GetProduct.tensp%>" size="20" />  </td>
                    </tr>
                    <tr>
                        <th>Mô tả: </th><td><input type="text" name="Mo_ta" value="<%=Model.GetProduct.mota%>" size="20" /> </td>
                    </tr>
                    <tr>
                        <th>Số lượng: </th><td><input type="text" name="So_luong" value="<%=Model.GetProduct.soluong%>" size="20" /> </td>
                    </tr>
                    <tr>
                        <th>Đơn giá: </th><td><input type="text" name="Don_gia" value="<%=Model.GetProduct.dongia%>" size="20" />VNĐ </td>
                    </tr>
                    <tr>
                        <th>Hình ảnh: </th><td><input type="text" name="Hinh_anh" value="<%=Model.GetProduct.hinhanh%>" size="20" /> </td>
                    </tr>
                    <tr>
                        <th>Nhà sản xuất: </th><td><input type="text" name="Nha_sx" value="<%=Model.GetProduct.nhasx%>" size="20" /> </td>
                    </tr>
                    <tr>
                        <th>Mã loại: </th><td><input type="text" name="Ma_loai" value="<%=Model.GetProduct.maloai%>" size="20" /> </td>
                    </tr>
                    <tr>
                        <th></th>
                        <td> 
                            <input type="submit" value="Thêm" onclick="ac1()"/>
                            <input type="submit" value="Sửa" onclick="ac2()"/>
                            <input type="submit" value="Xóa" onclick="ac3()"/>
                            <input type="submit" value="Tìm kiếm" onclick="ac0()" />
                              <input type="text" value="" style="display: none" id="ac" name="ac"> 
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
