<%-- 
    Document   : Register
    Created on : Sep 30, 2016, 10:11:20 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/styledangky.css" rel="stylesheet" type="text/css"/>
        <link href="css/styleindex.css" rel="stylesheet" type="text/css"/>
        <link href="css/demo.css" rel="stylesheet" type="text/css"/>
        <link href="css/LightboxEvolution.css" rel="stylesheet" type="text/css"/>
        <script type="text/javascript" src="http://dl.dropbox.com/u/70549761/jQuery/namkna-blogspot-com/jquery.min.v1.4.1.js"></script>
        <script type="text/javascript" src="http://dl.dropbox.com/u/70549761/jQuery/namkna-blogspot-com/jquery.lightbox.js">  
        </script><script type="text/javascript">
 jQuery(document).ready(function(){
   jQuery('.lightbox').lightbox();
 });
</script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body onLoad="setup()">
		<div class="border">
			<div class="wrapper">
				<div class="top">
					<div class="logo"><img src="images/logo.png" height="150px" width="300px"></div>
						<div class="sreach">
							<div class="sreach1">
								<form>
								<input type="text" placeholder="Bạn muốn tìm gì ?" style="width:400px;height:34px;float:left;"><input type="submit" value="Tìm kiếm" style="height:34px;background:#d41212;border:1px solid #d41212;"/>
								</form>
							</div>
							<div class="formlogin">
								<a href="Dangki.jsp" ><b>Đăng Ký</b></a> | <a href="Dangnhap.jsp" ><b>Đăng Nhập</b></a>
								<input type="checkbox" id="ckshowhide" onClick="anhien()"/> Ẩn / Hiện <br /><hr />
									<form id="login">
										User : <input type="text"/><br />
										Pass : <input type="password"/><br />
									<input type="submit" value="Login" />
									</form>
									<br />
									
								
							</div>
						</div>
					<div class="menu">
							<span id="house"><img src="images/home.jpg" height="40px" width="40px" /></span>
							<div class="menu1"><a href="index.html"><b>TRANG CHỦ</b></a></div>
							<div class="menu1"><a href=""><b>ĐIỆN THOẠI</b></a>
								<div class="sub-menu">
									<div class="menu2"><a href="tintuc.html"><b>» Nokia</b></a></div>
									<div class="menu2"><a href="#"><b>» Iphone</b></a>
										<div class="menu3">
												<div class="menu3-1"><a href="#"><b>» Iphone 6</b></a></div>
												<div class="menu3-1"><a href="#"><b>» Iphone 5</b></a></div>
												<div class="menu3-1"><a href="#"><b>» Iphone 4</b></a></div>
												<div class="menu3-1"><a href="#"><b>» Iphone 3</b></a></div>
												<div class="menu3-1"><a href="#"><b>» Iphone other</b></a></div>
												
											</div>
										</div>
									<div class="menu2"><a href="#"><b>» Samsung</b></a></div>
									<div class="menu2"><a href="#"><b>» Asus</b></a>
										<div class="menu3">
											<div class="menu3-1"><a href="#"><b>» Zenfone6</b></a></div>
											<div class="menu3-1"><a href="#"><b>» Zenfone5</b></a></div>
											<div class="menu3-1"><a href="#"><b>» Zenfone4,5</b></a></div>
											<div class="menu3-1"><a href="#"><b>» Zenfone4</b></a></div>
											<div class="menu3-1"><a href="#"><b>» Hết !</b></a></div>
											
										</div>
									</div>
									<div class="menu2"><a href="#"><b>» HTC</b></a></div>
									<div class="menu2"><a href="#"><b>» LG</b></a></div>
								</div>
							</div>
							<div class="menu1"><a href=""><b>TABLET</b></a>
								<div class="sub-menu">
											<div class="menu2"><a href="tintuc.html"><b>» Google</b></a></div>
											<div class="menu2"><a href="#"><b>» Apple</b></a>
												</div>
											<div class="menu2"><a href="#"><b>» Asus</b></a></div>
											<div class="menu2"><a href="#"><b>» Samsung</b></a>
											</div>
								</div>
							</div>
							<div class="menu1"><a href=""><b>BỘ SƯU TẬP</b></a>
								<div class="sub-menu">
										<div class="menu2"><a href="library.html"><b>» Điện thoại khủng</b></a></div>
										<div class="menu2"><a href="#"><b>» Máy ảnh chất</b></a>
											<div class="menu3">
													<div class="menu3-1"><a href="#"><b>» Iphone 6</b></a></div>
													<div class="menu3-1"><a href="#"><b>» Iphone 5</b></a></div>
													<div class="menu3-1"><a href="#"><b>» Iphone 4</b></a></div>
													<div class="menu3-1"><a href="#"><b>» Iphone 3</b></a></div>
													<div class="menu3-1"><a href="#"><b>» Iphone other</b></a></div>
													
												</div>
											</div>
										<div class="menu2"><a href="#"><b>» Tablet đẹp</b></a></div>
										<div class="menu2"><a href="#"><b>» Một thoáng Laptop</b></a>
											<div class="menu3">
												<div class="menu3-1"><a href="#"><b>» x4500</b></a></div>
												<div class="menu3-1"><a href="#"><b>» zt5000</b></a></div>
												<div class="menu3-1"><a href="#"><b>» Zenfone4,5</b></a></div>
												<div class="menu3-1"><a href="#"><b>» Zenfone4</b></a></div>
												<div class="menu3-1"><a href="#"><b>» Hết !</b></a></div>
												
											</div>
										</div>
										<div class="menu2"><a href="#"><b>» Ảnh đẹp</b></a></div>
										<div class="menu2"><a href="#"><b>» Ảnh khác </b></a></div>
								</div>
							</div>
							<div class="menu1"><a href="gioithieu.html"><b>GIỚI THIỆU</b></a></div>
							<div class="menu1"><a href=""><b>TTKM</b></a></div>
					</div>
				</div>
					<div class="content">
					 <center><h2>Thông tin đăng ký</h2></center><hr />
					<table width="600" height="313">
		 <tr>
		   <th width="177" scope="col">Họ và tên</th>
		   <th width="252" scope="col">
		   <form name="form1" method="post" action="">
			 <label for="fullname"></label>
			 <input type="text" name="fullname" autofocus id="fullname" style="margin-left: -238px;"/> <span style="color:red;">(*)</span>
		   </form></th>
		 </tr>
		 <tr>
		   <th scope="row">Giới tính</th>
		   <td><form id="form2" name="form2" method="post" action="">
			 <input type="radio" name="radio" id="male" value="male" />
			 <label for="male"></label>
			 Nam 
			  <input type="radio" name="radio" id="female" value="female" /> 
			  <label for="female"></label> 
		   Nữ <span style="color:red;margin-left: 48px;">(*)</span>
		   </form></td>
		 </tr>
		 <tr>
		   <th scope="row">Tên đăng nhập</th> 
		   <td><form id="form3" name="form3" method="post" action="">
			 <label for="account"></label>
			 <input type="text" name="account" autofocus id="account" /> <span style="color:red;">(*)</span>
		   </form></td>
		 </tr>
		 <tr>
		   <th scope="row">Mật khẩu</th>
		   <td><form id="form4" name="form4" method="post" action="">
			 <label for="passwords"></label>
			 <input type="password" name="pass"  autofocus id="pass" /> <span style="color:red;">(*)</span>
		   </form></td>
		 </tr>
		 <tr>
		   <th scope="row">Nhập lại mật khẩu</th>
		   <td><form id="form5" name="form5" method="post" action="">
			 <label for="repeatpass"></label>
			 <input type="password" name="repeatpass" autofocus id="repeatpass" /> <span style="color:red;">(*)</span>
		   </form></td>
		 </tr>
		 <tr>
		   <th scope="row">Email</th>
		   <td><form id="form6" name="form6" method="post" action="">
			 <label for="email"></label>
			 <input type="email" name="email" autofocus id="email" /> <span style="color:red;">(*)</span>
		   </form></td>
		 </tr>
		 <tr>
		   <th scope="row">Ngày sinh</th>
		   <td><form id="form7" name="form7" method="post" action="">
			 Day
			 <label for="day"></label>
			 <select name="day" id="days">
				<option></option>
				<script type="text/javascript" >
					for (var i=1; i <= 31 ; i++)
					document.write ("<option value="+i+">"+i+"</option>");
				</script>
				
			 </select>
		   Month
		   <label for="month"></label>
		   <select name="month" id="months">
				<option></option>
				<script type="text/javascript">
					for (var i=1 ; i <= 12 ;  i++)
					document.write("<option value="+i+">"+i+"</option>");
				</script>
		   </select>
		   Year 
		   <label for="years"></label>
		   <select name="years" id="years">
			<option></option>
				<script type="text/javascript">
					for(var i = 1950; i <= 2014 ; i++)
					document.write ("<option value="+i+">"+i+"</option>");
				</script>
		   </select>
		   </form></td><br />
		  <tr>
		  
			<th scope="row">Số điện thoại </th>
			<td>
				<input type="text" id="phone" />
			</td>
		  </tr>
		 </tr>
		 <tr>
		   <th scope="row">Sở thích</th>
		   <td><form id="form8" name="form8" method="post" action="">
			 <input type="checkbox" name="travel" id="travel" />
			 <label for="travel"></label>
		   Du lịch
		   <input type="checkbox" name="fashion" id="fashion" />
		   <label for="fashion"></label>
		   Thời trang 
		   <input type="checkbox" name="shopping" id="shopping" />
		   <label for="shopping"></label>
		   Mua sắm 
		   <input type="checkbox" name="sport" id="sport" />
		   <label for="sport"></label>
		   Sport
		   <input type="checkbox" name="other" id="other" />
		   <label for="other"></label>
		   Khác
		   </form></td>
		 </tr>
		 <tr>
		   <th height="41" scope="row">Thông tin khác</th>
		   <td><form id="form9" name="form9" method="post" action="">
			 <label for="textother"></label>
			 <textarea name="textother" id="textother" cols="45" rows="2"></textarea>
		   </form></td>
		 </tr>
		 <tr>
		   <th scope="row">&nbsp;</th>
		   <td><form id="form10" name="form10" method="post" action="">
			 <input type="submit" name="submit" id="submit" value="Submit" onClick="empty1()" />
			 <input type="submit" name="Cancel" id="Cancel" value="Cancel" />
		   </form></td>
		 </tr>
   </table>
					</div>
					
					<div class="footer">
						<center></center>
					Giấy phép đăng ký số :... <br />
					<b>Biên tập</b>: Lương Đức Khánh...  -<b>Phone:</b> 01206215477 - <b>Facbook</b>:Luongduckhanh<br /><br />
					Công ty trách nhiệm hữu hạn 1 thành viên ITLAB<br />
					<b>Địa chỉ : </b>FPT- ĐN. <br />
					Chi nhánh  :<br />
					- .... <br />
					- .... <br />
					- .... <br />
										
					</div>
					<div class="bottom"></div>
				</div>
			</div>
	</body>
</html>
