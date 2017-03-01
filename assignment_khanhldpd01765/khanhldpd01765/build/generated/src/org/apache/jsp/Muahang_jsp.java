package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Controller.LoginServlet;
import Model.Product;
import Model.Catalogue;
import dao.ProductDAO;
import dao.CategoryDAO;

public final class Muahang_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"css/LightboxEvolution.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/styledangky.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/demo.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/styleindex.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script type=\"text/javascript\" src=\"http://dl.dropbox.com/u/70549761/jQuery/namkna-blogspot-com/jquery.min.v1.4.1.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"http://dl.dropbox.com/u/70549761/jQuery/namkna-blogspot-com/jquery.lightbox.js\"></script>\n");
      out.write("<script> type=\"text/javascript\">\n");
      out.write(" jQuery(document).ready(function(){\n");
      out.write("   jQuery('.lightbox').lightbox();\n");
      out.write(" });\n");
      out.write("</script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("   <body onLoad=\"load()\"><div class=\"wrapperall\">\n");
      out.write("             ");

            CategoryDAO categoryDAO = new CategoryDAO();
        
      out.write("\n");
      out.write("\n");
      out.write("        ");

            ProductDAO productDAO = new ProductDAO();
            String Ma_loai = "";
            if (request.getParameter("category") != null) {
                Ma_loai = request.getParameter("category");
            }
        
      out.write("\n");
      out.write("\t\t<div class=\"border\">\n");
      out.write("\t\t\t<div class=\"wrapper\">\n");
      out.write("\t\t\t\t<div class=\"top\">\n");
      out.write("\t\t\t\t\t<div class=\"logo\"><img src=\"images/logo.png\" height=\"150px\" width=\"300px\">\n");
      out.write("                                                                \n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"sreach\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"sreach1\">\n");
      out.write("\t\t\t\t\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"Bạn muốn tìm gì ?\" style=\"width:400px;height:34px;float:left;\"> <input type=\"submit\" value=\"Tìm kiếm\" style=\"height:34px;background:#d41212;border:1px solid #d41212;\"/>\n");
      out.write("\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"formlogin\">\n");
      out.write("                                                            \n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"Dangki.jsp\" ><b>Đăng Ký</b></a> | <a href=\"Dangnhap.jsp\" ><b>Đăng Nhập</b></a>\n");
      out.write("                                                                <ul>\n");
      out.write("                                                                <li class=\"lidn\" style=\"color: #F03;");
      out.print(LoginServlet.displayDN);
      out.write("\"> </li>  ");
      out.print(LoginServlet.userN);
      out.write("\n");
      out.write("                                                                <a style=\"color: #F03;");
      out.print(LoginServlet.displayDN);
      out.write("\" href=\"LogoutServlet\">Đăng xuất</a>\n");
      out.write("                                                                </ul>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"menu\">\n");
      out.write("\t\t\t\t\t\t\t<span id=\"house\"><img src=\"images/home.jpg\" height=\"40px\" width=\"40px\" /></span>\n");
      out.write("                                                          ");

                                        for (Catalogue c : categoryDAO.getListCatalogues()) {
                                    
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"menu1\"><a href=\"Muahang.jsp?category=");
      out.print(c.getMaloai());
      out.write("\"><b>");
      out.print(c.getTenloai());
      out.write("</b></a></div>\n");
      out.write("                                                          ");

                                            }
                                        
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<div class=\"menu1\"><a href=\"\"><b>BỘ SƯU TẬP</b></a>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"sub-menu\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"menu2\"><a href=\"library.html\"><b>» Điện thoại khủng</b></a></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"menu2\"><a href=\"#\"><b>» Máy ảnh chất</b></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"menu3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"menu3-1\"><a href=\"#\"><b>» Iphone 6</b></a></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"menu3-1\"><a href=\"#\"><b>» Iphone 5</b></a></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"menu3-1\"><a href=\"#\"><b>» Iphone 4</b></a></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"menu3-1\"><a href=\"#\"><b>» Iphone 3</b></a></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"menu3-1\"><a href=\"#\"><b>» Iphone other</b></a></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"menu2\"><a href=\"#\"><b>» Tablet đẹp</b></a></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"menu2\"><a href=\"#\"><b>» Một thoáng Laptop</b></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"menu3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"menu3-1\"><a href=\"#\"><b>» x4500</b></a></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"menu3-1\"><a href=\"#\"><b>» zt5000</b></a></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"menu3-1\"><a href=\"#\"><b>» Zenfone4,5</b></a></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"menu3-1\"><a href=\"#\"><b>» Zenfone4</b></a></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"menu3-1\"><a href=\"#\"><b>» Hết !</b></a></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"menu2\"><a href=\"#\"><b>» Ảnh đẹp</b></a></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"menu2\"><a href=\"#\"><b>» Ảnh khác </b></a></div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"banner\">\n");
      out.write("\t\t\t\t\t\t<div class=\"bannerleft\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"tinhot\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/new.jpg\" height=\"20px\" style=\"float:left;\">  <a href=\"\" style=\"color:black;\"><b> iPhone 6 lại về ! Đặt ngay để sở hữu sớm nhất và có cơ hội nhận nhiều quà tặng đặc biệt. Nhanh tay kẻo hết , số lượng có hạn!!!</b>\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"slideshow\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/banner1.jpg\" name=\"imgs\" width=\"750px\" height=\"400px\" />\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/prev.PNG\" id=\"prev\" width=\"60px\" height=\"60px\" onClick=\"back()\"/>\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/next.PNG\" id=\"next\" width=\"60px\" height=\"60px\" onClick=\"back2()\"/>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"bannerright\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"nhande\"><center>Thông tin công nghệ</center></div>\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a class=\"a1\" href=\"\">Điều gì sẽ xảy ra nếu Windows Mobile 10 lấy ý tưởng từ Android?</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a class=\"a1\" href=\"\">HTC Desire 820s 'đối đầu' Nokia Lumia 830</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a class=\"a1\" href=\"\">Không thể cưỡng lại trước vẻ đẹp của mẫu smartphone HTC Hima Ace</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a class=\"a1\" href=\"\">6 điều mọi người nên biết về iPhone 6s vào lúc này</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a class=\"a1\" href=\"\">Điểm danh những smartphone trang bị đèn flash Xenon có khả năng chụp hình cực đỉnh</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a class=\"a1\" href=\"\">Thử nghiệm thời gian dùng pin của Xperia C3 hai SIM, kết quả khá ấn tượng</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a class=\"a1\" href=\"\">Cáp sạc tăng gấp đôi tốc độ sạc cho smartphone, lạ nhưng có thật</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"content\">\n");
      out.write("\t\t\t\t\t<h2><img src=\"images/muiten.gif\" /> Điện thoại - Laptop </h2>\n");
      out.write("\t\t\t\t\t\t<center>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"product\">\n");
      out.write("                                                              ");

                                             for (Product p : productDAO.getListProductByCategory(Ma_loai)) {
                    
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"product1\">\n");
      out.write("                                                                    \n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"anh\"><a href=\"images/anh1-to.jpg\" class=\"lightbox\"><img src=\"");
      out.print(p.getHinhanh());
      out.write("\" width=\"110\" height=\"129\"/></a></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"infomation\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"gia\"><u>Giá:</u> <b>");
      out.print(p.getDongia());
      out.write("đ</b></span><br />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"tensp\">");
      out.print(p.getTensp());
      out.write("</span><br />\n");
      out.write("                                                                                <span class=\"chitiet\"><a href=\"\">");
      out.print(p.getMota());
      out.write("</a><span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t  ");

                        }
                    
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</center>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"footer\">\n");
      out.write("\t\t\t\t\t\t<center></center>\n");
      out.write("\t\t\t\t\tGiấy phép đăng ký số :... <br />\n");
      out.write("\t\t\t\t\t<b>Biên tập</b>: Lương Đức Khánh...  -<b>Phone:</b> 01206215477 - <b>Facbook</b>:Luongduckhanh<br /><br />\n");
      out.write("\t\t\t\t\tCông ty trách nhiệm hữu hạn 1 thành viên ITLAB<br />\n");
      out.write("\t\t\t\t\t<b>Địa chỉ : </b>FPT- ĐN. <br />\n");
      out.write("\t\t\t\t\tChi nhánh  :<br />\n");
      out.write("\t\t\t\t\t- .... <br />\n");
      out.write("\t\t\t\t\t- .... <br />\n");
      out.write("\t\t\t\t\t- .... <br />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"bottom\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("            </div>\n");
      out.write("\t</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
