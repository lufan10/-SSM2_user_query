/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-05-12 00:46:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      			null, true, 16384, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>添加联系人</title>\r\n");
      out.write("    <!--  css外部文件资源引入  -->\r\n");
      out.write("    <link href=\"/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->\r\n");
      out.write("    <script src=\"/js/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("    <script src=\"/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <!-- 自定义内部css样式-->\r\n");
      out.write("    <style>\r\n");
      out.write("        h3{\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<h3>添加联系人</h3>\r\n");
      out.write("<br>\r\n");
      out.write("<form class=\"form-horizontal container\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/user/add\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("        <label for=\"name\" class=\"col-md-5 control-label\">姓名:</label>\r\n");
      out.write("        <div class=\"col-md-3\">\r\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"name\" name=\"name\" placeholder=\"请输入姓名\">\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("        <div class=\"col-md-offset-5 col-md-3\">\r\n");
      out.write("            性别：\r\n");
      out.write("            <input type=\"radio\" name=\"sex\" value=\"男\" checked>男\r\n");
      out.write("            <input type=\"radio\" name=\"sex\" value=\"女\" >女\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("        <label for=\"age\" class=\"col-md-5 control-label\">年龄:</label>\r\n");
      out.write("        <div class=\"col-md-3\">\r\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"age\" name=\"age\"  placeholder=\"请输入年龄\">\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("        <label for=\"address\" class=\"col-md-5 control-label\">籍贯:</label>\r\n");
      out.write("        <div class=\"col-md-3\">\r\n");
      out.write("            <select class=\"form-control\" id=\"address\" name=\"address\">\r\n");
      out.write("                <option>成都</option>\r\n");
      out.write("                <option>重庆</option>\r\n");
      out.write("                <option>长沙</option>\r\n");
      out.write("                <option>武汉</option>\r\n");
      out.write("                <option>南京</option>\r\n");
      out.write("            </select>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("        <label for=\"qq\" class=\"col-md-5 control-label\">QQ：</label>\r\n");
      out.write("        <div class=\"col-md-3\">\r\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"qq\" name=\"qq\" placeholder=\"请输入QQ号码\">\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("        <label for=\"inputEmail3\" class=\"col-md-5 control-label\">Email:</label>\r\n");
      out.write("        <div class=\"col-md-3\">\r\n");
      out.write("            <input type=\"email\" class=\"form-control\" id=\"inputEmail3\" name=\"email\" placeholder=\"请输入邮箱地址\">\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("        <label for=\"birthday\" class=\"col-md-5 control-label\">birthday:</label>\r\n");
      out.write("        <div class=\"col-md-3\">\r\n");
      out.write("            <input type=\"date\" class=\"form-control\" id=\"birthday\" name=\"birthday\" placeholder=\"请输入生日\">\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("        <div class=\"col-md-offset-5 col-md-3\">\r\n");
      out.write("            <button type=\"submit\" class=\"btn btn-primary\">提交</button>\r\n");
      out.write("            <a class=\"btn btn-default\" href=\"/pages/add.jsp\" role=\"button\">重置</a>\r\n");
      out.write("            <a class=\"btn btn-default\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/user/findAll\" role=\"button\">返回</a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<script>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    $(\"td,th\").addClass(\"text-center\");\r\n");
      out.write("</script>\r\n");
      out.write("</html>\r\n");
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
