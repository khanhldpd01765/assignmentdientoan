package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Quantriloaisp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <body>\n");
      out.write("        ");

            String error = "";
            if (request.getParameter("error")!=null) {
                    error = (String) request.getParameter("error");
                }
            
            
            
      out.write("\n");
      out.write("       \n");
      out.write("                   <script>\n");
      out.write("                        function ac0() {\n");
      out.write("                            var a0 = 0;\n");
      out.write("                            document.getElementById(\"ac\").value = a0;\n");
      out.write("\n");
      out.write("                        }\n");
      out.write("                        function ac1() {\n");
      out.write("                            var a1 = 1;\n");
      out.write("                            document.getElementById(\"ac\").value = a1;\n");
      out.write("                        }\n");
      out.write("                        function ac2() {\n");
      out.write("                            var a2 = 2;\n");
      out.write("                            document.getElementById(\"ac\").value = a2;\n");
      out.write("                        }\n");
      out.write("                        function ac3() {\n");
      out.write("                            var a3 = 3;\n");
      out.write("                            document.getElementById(\"ac\").value = a3;\n");
      out.write("                        }\n");
      out.write("                      \n");
      out.write("                    </script>\n");
      out.write("        <div>\n");
      out.write("        <center>\n");
      out.write("     <form action=\"GetCatalogue\" method=\"SET\">\n");
      out.write("          <div class=\"logo\"><img src=\"images/logo.png\" height=\"150px\" width=\"300px\"></div>\n");
      out.write("                <h1> Quản trị loại sản phẩm </h1>\n");
      out.write("               \n");
      out.write("                <table  border=\"0px\" > \n");
      out.write("                <span style=\"text-align: left \">\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Mã loại phẩm: </th><td><input type=\"text\" name=\"maloai\" value=\"");
      out.print(Model.GetCatalogue.Maloai);
      out.write("\" size=\"20\" /> </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Loại sản phẩm: </th><td><input type=\"text\" name=\"tenloai\" value=\"");
      out.print(Model.GetCatalogue.Tenloai );
      out.write("\" size=\"20\" />  </td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                   \n");
      out.write("                    <tr>\n");
      out.write("                        <th></th>\n");
      out.write("                        <td> \n");
      out.write("                            <input type=\"submit\" value=\"Thêm\" onclick=\"ac1()\" />\n");
      out.write("                            <input type=\"submit\" value=\"Sửa\" onclick=\"ac2()\" />\n");
      out.write("                            <input type=\"submit\" value=\"Xóa\" onclick=\"ac3()\" />\n");
      out.write("                            <input type=\"submit\" value=\"Tìm kiếm\" onclick=\"ac0()\" />\n");
      out.write("                            \n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    </td></tr>\n");
      out.write("                         <input type=\"text\" value=\"\" style=\"display: none\" id=\"ac\" name=\"ac\"> \n");
      out.write("                </span>\n");
      out.write("                </table>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                </form>\n");
      out.write("        </center>\n");
      out.write("        </div>\n");
      out.write("         <div class=\"footer\">\n");
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
      out.write("    </body>\n");
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
