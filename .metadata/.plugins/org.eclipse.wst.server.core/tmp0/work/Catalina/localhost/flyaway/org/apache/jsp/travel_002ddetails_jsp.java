/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.10
 * Generated at: 2021-09-27 14:36:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class travel_002ddetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewreport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>Travel Details</title>\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\"\r\n");
      out.write("	integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("	integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://fonts.googleapis.com/css?family=Raleway&display=swap\"\r\n");
      out.write("	rel=\"stylesheet\" />\r\n");
      out.write("<script src=\"https://kit.fontawesome.com/92e9dde9ec.js\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("body {\r\n");
      out.write("	margin: 0;\r\n");
      out.write("	padding: 0;\r\n");
      out.write("	background: #fff;\r\n");
      out.write("	font-family: 'Raleway', sans-serif;\r\n");
      out.write("	color: #fff;\r\n");
      out.write("	height: 100vh;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".banner .navbar {\r\n");
      out.write("	margin-top: 2%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".banner .navbar-brand {\r\n");
      out.write("	color: #fff;\r\n");
      out.write("	font-size: 1.8em;\r\n");
      out.write("	font-weight: 700;\r\n");
      out.write("	margin-left: 7%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".banner .nav {\r\n");
      out.write("	margin-right: 7%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".banner .nav li a {\r\n");
      out.write("	color: #aaa;\r\n");
      out.write("	font-size: 1.5em;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".banner p {\r\n");
      out.write("	font-size: 2em;\r\n");
      out.write("	font-weight: 500;\r\n");
      out.write("	letter-spacing: 2px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".booking {\r\n");
      out.write("	margin-left: 8%;\r\n");
      out.write("	margin-bottom: 2%;\r\n");
      out.write("	border-radius: 5px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"container-fluid banner\">\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"col-md-12\">\r\n");
      out.write("				<nav class=\"navbar navbar-md\">\r\n");
      out.write("					<div class=\"navbar-brand text-dark\">\r\n");
      out.write("						<a href=\"index.jsp\" class=\"text-decoration-none text-dark\"><i\r\n");
      out.write("							class=\"fas fa-plane\"></i>FlyAway</a>\r\n");
      out.write("					</div>\r\n");
      out.write("					<ul class=\"nav\">\r\n");
      out.write("						<li class=\"nav-item\"><a class=\"nav-link text-dark\" href=\"login.jsp\"><i\r\n");
      out.write("								class=\"fas fa-user-cog\"></i> Admin Login</a></li>\r\n");
      out.write("					</ul>\r\n");
      out.write("				</nav>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-md-12\">\r\n");
      out.write("				<h2 class=\"text-center text-dark\">FlyAway Ticket Booking</h2>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<div class=\"row align-items-center\" style=\"width: 100%;\">\r\n");
      out.write("		<div class=\"col-md-2 bg-secondary booking\">\r\n");
      out.write("			<form name=\"contact-form\" action=\"SearchResults\">\r\n");
      out.write("				<div class=\"mb-3\">\r\n");
      out.write("					<label for=\"date\" class=\"col-form-label\">Date:</label> <input\r\n");
      out.write("						type=\"date\" class=\"form-control\" id=\"date\" name=\"date\" required>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"mb-3\">\r\n");
      out.write("					<label for=\"source\" class=\"col-form-label\">Source:</label><br>\r\n");
      out.write("					<select class=\"form-select\" name=\"source\" required>\r\n");
      out.write("						<option selected>Select Source</option>\r\n");
      out.write("						<option value=\"Kolkata (CCU)\">Kolkata(CCU)</option>\r\n");
      out.write("						<option value=\"Delhi (DEL)\">Delhi(DEL)</option>\r\n");
      out.write("						<option value=\"Mumbai (BOM)\">Mumbai(BOM)</option>\r\n");
      out.write("						<option value=\"Chennai (MAA)\">Chennai(MAA)</option>\r\n");
      out.write("					</select>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"mb-3\">\r\n");
      out.write("					<label for=\"destination\" class=\"col-form-label\">Destination:</label>\r\n");
      out.write("					<select class=\"form-select\" name=\"destination\" required>\r\n");
      out.write("						<option selected>Select Destination</option>\r\n");
      out.write("						<option value=\"Kolkata (CCU)\">Kolkata(CCU)</option>\r\n");
      out.write("						<option value=\"Delhi (DEL)\">Delhi(DEL)</option>\r\n");
      out.write("						<option value=\"Mumbai (BOM)\">Mumbai(BOM)</option>\r\n");
      out.write("						<option value=\"Chennai(MAA)\">Chennai(MAA)</option>\r\n");
      out.write("					</select>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"mb-3\">\r\n");
      out.write("					<label for=\"travellers\" class=\"col-form-label\">No. of\r\n");
      out.write("						Traveller(s):</label> <input type=\"number\" class=\"form-control\"\r\n");
      out.write("						id=\"source\" name=\"travellers\" required>\r\n");
      out.write("				</div>\r\n");
      out.write("				<input type=\"submit\" class=\"btn btn-info mb-3 text-light\" value=\"Search Flights\">\r\n");
      out.write("			</form>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"col-md-4\">\r\n");
      out.write("			<img src=\"./assets/booking.svg\" alt=\"\">\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
