/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-03-14 13:50:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.week2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>登录|Login</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        * {\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("        }\r\n");
      out.write("        html {\r\n");
      out.write("            height: 100%;\r\n");
      out.write("        }\r\n");
      out.write("        body {\r\n");
      out.write("            height: 100%;\r\n");
      out.write("        }\r\n");
      out.write("        .container {\r\n");
      out.write("            height: 100%;\r\n");
      out.write("            background-image: linear-gradient(to right,#a8edea, #fed6e3);\r\n");
      out.write("        }\r\n");
      out.write("        .login-wrapper {\r\n");
      out.write("            background-color: #fff;\r\n");
      out.write("            width: 358px;\r\n");
      out.write("            height: 588px;\r\n");
      out.write("            border-radius: 25px;\r\n");
      out.write("            padding: 0 70px;\r\n");
      out.write("            position: relative;\r\n");
      out.write("            left: 50%;\r\n");
      out.write("            top: 50%;\r\n");
      out.write("            transform: translate(-50%, -50%);\r\n");
      out.write("        }\r\n");
      out.write("        .header {\r\n");
      out.write("            font-size: 50px;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            line-height: 200px;\r\n");
      out.write("            color: #131391;\r\n");
      out.write("        }\r\n");
      out.write("        .input-item {\r\n");
      out.write("            display: block;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            margin-bottom: 20px;\r\n");
      out.write("            border: 0;\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("            border-bottom: 1px solid rgb(128, 125, 125);\r\n");
      out.write("            font-size: 15px;\r\n");
      out.write("            outline: none;\r\n");
      out.write("        }\r\n");
      out.write("        .input-item::placeholder {\r\n");
      out.write("            text-transform: uppercase;\r\n");
      out.write("        }\r\n");
      out.write("        .btn {\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            margin-top: 40px;\r\n");
      out.write("            background-image: linear-gradient(to left, #a8edea, #fed6e3);\r\n");
      out.write("            color: #fff;\r\n");
      out.write("        }\r\n");
      out.write("        a {\r\n");
      out.write("            text-decoration-line: none;\r\n");
      out.write("            color: #abc1ee;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <div class=\"login-wrapper\">\r\n");
      out.write("        <div class=\"header\">Login</div>\r\n");
      out.write("        <form class=\"form-wrapper\" onsubmit=\"return check()\" action=\"/ChenHuayan2020211001001302/register\" method=\"post\"><br/>\r\n");
      out.write("            <input type=\"text\" name=\"username\" placeholder=\"username\" class=\"input-item\" required><br/>\r\n");
      out.write("            <input type=\"password\" name=\"password\" placeholder=\"password\" class=\"input-item\" required id=\"password\"><br/>\r\n");
      out.write("            <input type=\"email\" name=\"email\" placeholder=\"email\" class=\"input-item\" required><br/>\r\n");
      out.write("            Gender:\r\n");
      out.write("            <input name=\"sex\" type=\"radio\" value=\"Male\"/>  Male\r\n");
      out.write("            <input name=\"sex\" type=\"radio\" value=\"Female\"/>  Female<br/>\r\n");
      out.write("            <input type=\"date\" name=\"Birthdays\" placeholder=\"Birthdays\" class=\"input-item\" required><br/>\r\n");
      out.write("            <input class=\"btn\"  value=\"Login\" type=\"submit\" value=\"Register\">\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("<script language=\"JavaScript\">\r\n");
      out.write("    function check(){\r\n");
      out.write("        var password = document.getElementById(\"password\")\r\n");
      out.write("        if (password.value.length < 8){\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("        else {\r\n");
      out.write("            return true;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
