package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Quantritaikhoan_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body\n");
      out.write("        <div>\n");
      out.write("        <center>\n");
      out.write("            <div class=\"logo\"><img src=\"images/logo.png\" height=\"150px\" width=\"300px\"></div>\n");
      out.write("     <form action=\"TaikhoanServlet\" method=\"GET\">\n");
      out.write("                <h1> Thêm tài khoản </h1>\n");
      out.write("                \n");
      out.write("                <table  border=\"0px\" > \n");
      out.write("                <span style=\"text-align: left \">\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Username: </th><td><input type=\"text\" name=\"username\" value=\"\" size=\"20\" /> </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Pass: </th><td><input type=\"password\" name=\"pass\" value=\"\" size=\"20\" /> </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Vai trò: </th><td><input type=\"text\" name=\"vaitro\" value=\"\" size=\"20\" /> </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Họ tên: </th><td><input type=\"text\" name=\"hoten\" value=\"\" size=\"20\" /> </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Địa chỉ: </th><td><input type=\"text\" name=\"diachi\" value=\"\" size=\"20\" /> </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Email: </th><td><input type=\"text\" name=\"email\" value=\"\" size=\"20\" /> </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>SĐT: </th><td><input type=\"text\" name=\"sdt\" value=\"\" size=\"20\" /> </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th></th>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"submit\" value=\"Đăng ký\" name=\"dangky\" /> \n");
      out.write("                            \n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </span>\n");
      out.write("                </table>\n");
      out.write("                </form>\n");
      out.write("        </center>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"footer\">\n");
      out.write("\t\t\t\t\t\t\n");
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
      out.write("</body>\n");
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
