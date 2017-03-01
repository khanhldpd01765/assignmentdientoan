<%-- 
    Document   : Muahang
    Created on : Sep 30, 2016, 10:11:36 PM
    Author     : ASUS
--%>

<%@page import="Controller.LoginServlet"%>
<%@page import="Model.Product"%>
<%@page import="Model.Catalogue"%>
<%@page import="dao.ProductDAO"%>
<%@page import="dao.CategoryDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/LightboxEvolution.css" rel="stylesheet" type="text/css"/>
        <link href="css/styledangky.css" rel="stylesheet" type="text/css"/>
        <link href="css/demo.css" rel="stylesheet" type="text/css"/>
        <link href="css/styleindex.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="http://dl.dropbox.com/u/70549761/jQuery/namkna-blogspot-com/jquery.min.v1.4.1.js"></script>
<script type="text/javascript" src="http://dl.dropbox.com/u/70549761/jQuery/namkna-blogspot-com/jquery.lightbox.js"></script>
<script> type="text/javascript">
 jQuery(document).ready(function(){
   jQuery('.lightbox').lightbox();
 });
</script>
        <title>JSP Page</title>
    </head>
   <body onLoad="load()"><div class="wrapperall">
             <%
            CategoryDAO categoryDAO = new CategoryDAO();
        %>

        <%
            ProductDAO productDAO = new ProductDAO();
            String Ma_loai = "";
            if (request.getParameter("category") != null) {
                Ma_loai = request.getParameter("category");
            }
        %>
		<div class="border">
			<div class="wrapper">
				<div class="top">
					<div class="logo"><img src="images/logo.png" height="150px" width="300px">
                                                                
									</div>
						<div class="sreach">
							<div class="sreach1">
								<form>
								<input type="text" placeholder="Bạn muốn tìm gì ?" style="width:400px;height:34px;float:left;"> <input type="submit" value="Tìm kiếm" style="height:34px;background:#d41212;border:1px solid #d41212;"/>
								</form>
							</div>
							<div class="formlogin">
                                                            
								<a href="Dangki.jsp" ><b>Đăng Ký</b></a> | <a href="Dangnhap.jsp" ><b>Đăng Nhập</b></a>
                                                                <ul>
                                                                <li class="lidn" style="color: #F03;<%=LoginServlet.displayDN%>"> </li>  <%=LoginServlet.userN%>
                                                                <a style="color: #F03;<%=LoginServlet.displayDN%>" href="LogoutServlet">Đăng xuất</a>
                                                                </ul>
								
								
							</div>
						</div>
					<div class="menu">
							<span id="house"><img src="images/home.jpg" height="40px" width="40px" /></span>
                                                          <%
                                        for (Catalogue c : categoryDAO.getListCatalogues()) {
                                    %>
							<div class="menu1"><a href="Muahang.jsp?category=<%=c.getMaloai()%>"><b><%=c.getTenloai()%></b></a></div>
                                                          <%
                                            }
                                        %>
							
							
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
							
					</div>
				</div>
					<div class="banner">
						<div class="bannerleft">
							<div class="tinhot">
								<img src="images/new.jpg" height="20px" style="float:left;">  <a href="" style="color:black;"><b> iPhone 6 lại về ! Đặt ngay để sở hữu sớm nhất và có cơ hội nhận nhiều quà tặng đặc biệt. Nhanh tay kẻo hết , số lượng có hạn!!!</b>
								</a>
							</div>
							<div class="slideshow">
								<img src="images/banner1.jpg" name="imgs" width="750px" height="400px" />
								<img src="images/prev.PNG" id="prev" width="60px" height="60px" onClick="back()"/>
								<img src="images/next.PNG" id="next" width="60px" height="60px" onClick="back2()"/>
							</div>
						</div>
						<div class="bannerright">
							<div class="nhande"><center>Thông tin công nghệ</center></div>
							<ul>
								<li><a class="a1" href="">Điều gì sẽ xảy ra nếu Windows Mobile 10 lấy ý tưởng từ Android?</a></li>
								<li><a class="a1" href="">HTC Desire 820s 'đối đầu' Nokia Lumia 830</a></li>
								<li><a class="a1" href="">Không thể cưỡng lại trước vẻ đẹp của mẫu smartphone HTC Hima Ace</a></li>
								<li><a class="a1" href="">6 điều mọi người nên biết về iPhone 6s vào lúc này</a></li>
								<li><a class="a1" href="">Điểm danh những smartphone trang bị đèn flash Xenon có khả năng chụp hình cực đỉnh</a></li>
								<li><a class="a1" href="">Thử nghiệm thời gian dùng pin của Xperia C3 hai SIM, kết quả khá ấn tượng</a></li>
								<li><a class="a1" href="">Cáp sạc tăng gấp đôi tốc độ sạc cho smartphone, lạ nhưng có thật</a></li>
							</ul>
						</div>
					</div>
					<div class="content">
					<h2><img src="images/muiten.gif" /> Điện thoại - Laptop </h2>
						<center>
							<div class="product">
                                                              <%
                                             for (Product p : productDAO.getListProductByCategory(Ma_loai)) {
                    %>
								<div class="product1">
                                                                    
									<div class="anh"><a href="images/anh1-to.jpg" class="lightbox"><img src="<%=p.getHinhanh()%>" width="110" height="129"/></a></div>
									<div class="infomation">
										<span class="gia"><u>Giá:</u> <b><%=p.getDongia()%>đ</b></span><br />
										<span class="tensp"><%=p.getTensp()%></span><br />
                                                                                <span class="chitiet"><a href=""><%=p.getMota()%></a><span>
										
									</div>
								</div>
								  <%
                        }
                    %>
								</div>
							</div>
						</center>
						
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
            </div>
	</body>
</html>
