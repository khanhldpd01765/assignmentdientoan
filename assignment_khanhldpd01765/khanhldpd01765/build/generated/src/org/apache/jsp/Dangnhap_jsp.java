package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Dangnhap_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"css/stylelogin.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("   <body>\n");
      out.write("<div id=\"loginpanelwrap\">\n");
      out.write("  \t\n");
      out.write("\t<div class=\"loginheader\">\n");
      out.write("    <div class=\"logintitle\"><a href=\"#\">login</a></div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <form action=\"LoginServlet\" method=\"POST\">\n");
      out.write("    <div class=\"loginform\">\n");
      out.write("        \n");
      out.write("        <div class=\"loginform_row\">\n");
      out.write("        <label>Username:</label>\n");
      out.write("        <input type=\"text\" class=\"loginform_input\" name=\"t1\" />\n");
      out.write("        </div>\n");
      out.write("        <div class=\"loginform_row\">\n");
      out.write("        <label>Password:</label>\n");
      out.write("        <input type=\"password\" class=\"loginform_input\" name=\"t2\" />\n");
      out.write("        </div>\n");
      out.write("        <div class=\"loginform_row\">\n");
      out.write("        <input type=\"submit\" class=\"loginform_submit\" value=\"Login\" />\n");
      out.write("        </div> \n");
      out.write("        <div class=\"clear\"></div>\n");
      out.write("    </div>\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    \t\n");
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
