/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.27
 * Generated at: 2023-02-11 01:59:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class Alumni_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/nav.jsp", Long.valueOf(1676080737766L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./css/style.css\">\r\n");
      out.write("    <link rel=\"icon\" href=\"./login/favicon.ico\">\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./css/nav.css \">\r\n");
      out.write("  \r\n");
      out.write("    <title>Avsar</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    \r\n");
      out.write("    <nav class=\"navbar\">\r\n");
      out.write("        <div class=\"logo\">\r\n");
      out.write("            <img src=\"aikyamlogo.png\" alt=\"logo\" class=\"aiklogo\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col2\">\r\n");
      out.write("            <form action=\"\">\r\n");
      out.write("            <input type=\"text\" placeholder=\"Ask your doubt \" class=\"searchbar\">\r\n");
      out.write("            </form>\r\n");
      out.write("            <button type=\"submit\" class=\"submits\"><b>Ask</b></button>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"navbar-menu\">\r\n");
      out.write("            <a href=\"\">Home</a>\r\n");
      out.write("            <a href=\"\">Gurukul</a>\r\n");
      out.write("            <a href=\"./avsaraadminview\">Avsar</a>\r\n");
      out.write("            <a href=\"\">About us</a>\r\n");
      out.write("             <li class=\"nav-item mx-0 mx-Lg-1 bg-danger\"><a\r\n");
      out.write("            class=\"nav-link py-3 px-0 px-Lg-3 rounded\" href=\"\">");
      out.print(session.getAttribute("username") );
      out.write("</a></li>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"menu-toggle\">\r\n");
      out.write("            <span class=\"bar\"></span>\r\n");
      out.write("            <span class=\"bar\"></span>\r\n");
      out.write("            <span class=\"bar\"></span>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <header>\r\n");
      out.write("    \r\n");
      out.write("    </header>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("    <header>\r\n");
      out.write("        <!-- <h1 class=\"heading\" style=\"color: white;\">AIK<span style=\"color: red;\">YAM</span></h1> -->\r\n");
      out.write("        <div class=\"navbar\">\r\n");
      out.write("        <nav>\r\n");
      out.write("            <ul class=\"nav_links\">\r\n");
      out.write("            <li><a href=\"FrontPage.jsp\">AIKYAM</a> </li>\r\n");
      out.write("            <li><a href=\"Gurukul.jsp\">Gurukul</a></li>\r\n");
      out.write("            <li><a href=\"Avsara.jsp\" >Avsara</a></li>\r\n");
      out.write("            <li><a href=\"Alumni.jsp\" style =\"font-style: oblique;\">Alu<span style=\"color: red;\">mni</span></a></li>\r\n");
      out.write("            <li><a href=\"Contact.jsp\">Contact</a></li>\r\n");
      out.write("            <li class=\"nav-item mx-0 mx-Lg-1\"><a\r\n");
      out.write("            class=\"nav-link py-3 px-0 px-Lg-3 rounded\" href=\"Logout\">Logout</a></li>\r\n");
      out.write("             <li class=\"nav-item mx-0 mx-Lg-1 bg-danger\"><a\r\n");
      out.write("            class=\"nav-link py-3 px-0 px-Lg-3 rounded\" href=\"\">");
      out.print(session.getAttribute("username") );
      out.write("</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("    </header>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
