/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.34
 * Generated at: 2021-11-12 09:03:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/E:/My%20Study/FPT/Fall%202021/SWP391/SWP/build/web/WEB-INF/lib/jstl-impl.jar!/META-INF/c.tld", Long.valueOf(1343794618000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-impl.jar", Long.valueOf(1636044967605L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
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

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <!-- basic -->\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("  <!-- mobile metas -->\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <meta name=\"viewport\" content=\"initial-scale=1, maximum-scale=1\">\n");
      out.write("  <!-- site metas -->\n");
      out.write("  <title>MTB</title>\n");
      out.write("  <meta name=\"keywords\" content=\"\">\n");
      out.write("  <meta name=\"description\" content=\"\">\n");
      out.write("  <meta name=\"author\" content=\"\">\n");
      out.write("  <!-- fevicon -->\n");
      out.write("  <link rel=\"icon\" href=\"images/fevicon.png\" type=\"image/gif\" />\n");
      out.write("  <!-- bootstrap css -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("  <!-- style css -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("  <!-- Responsive-->\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/responsive.css\">  \n");
      out.write("  <!-- Scrollbar Custom CSS -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/jquery.mCustomScrollbar.min.css\">\n");
      out.write("  <!-- Tweaks for older IEs-->\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css\" media=\"screen\">\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("<script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\n");
      out.write("<script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script><![endif]-->\n");
      out.write("</head>\n");
      out.write("<!-- body -->\n");
      out.write("\n");
      out.write("<body class=\"main-layout contineer_page\">\n");
      out.write("  <!-- loader  -->\n");
      out.write("  <div class=\"loader_bg\">\n");
      out.write("    <div class=\"loader\"><img src=\"images/loading.gif\" alt=\"#\" /></div>\n");
      out.write("  </div>\n");
      out.write("  <!-- end loader -->\n");
      out.write("  <!-- header -->\n");
      out.write("  <header>\n");
      out.write("    <!-- header inner -->\n");
      out.write("     <div class=\"header\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-xl-2 col-lg-2 col-md-2 col-sm-3 col logo_section\">\n");
      out.write("              <div class=\"full\">\n");
      out.write("                <div class=\"center-desk\">\n");
      out.write("                  <div class=\"logo\">\n");
      out.write("                    <a href=\"index.jsp\"><img src=\"images/logo.png\" alt=\"#\" /></a>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xl-10 col-lg-10 col-md-10 col-sm-9\">\n");
      out.write("              \n");
      out.write("               <div class=\"menu-area\">\n");
      out.write("                <div class=\"limit-box\">\n");
      out.write("                  <nav class=\"main-menu \">\n");
      out.write("                    <ul class=\"menu-area-main\">\n");
      out.write("                      <li class=\"active\"> <a href=\"index.jsp\">Home</a> </li>\n");
      out.write("                  \n");
      out.write("                      <li> <a href=\"about.jsp\">About</a> </li>\n");
      out.write("                      <li> <a href=\"./concert\">Concerts </a> </li>\n");
      out.write("                      <li> <a href=\"gallery.jsp\">Gallery</a> </li>\n");
      out.write("                      <li> <a href=\"contact.jsp\">Contact</a> </li>\n");
      out.write("                      ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                      ");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                     </ul>\n");
      out.write("                   </nav>\n");
      out.write("                \n");
      out.write("               </div> \n");
      out.write("             </div>\n");
      out.write("           </div>\n");
      out.write("         </div>\n");
      out.write("       </div>\n");
      out.write("     </div>\n");
      out.write("\n");
      out.write("     <!-- end header inner -->\n");
      out.write("\n");
      out.write("     <!-- end header -->\n");
      out.write("     \n");
      out.write("</header>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- cart -->\n");
      out.write("<div id=\"cart\" class=\"cart\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("      \n");
      out.write("    <div class=\"title\">\n");
      out.write("      <h1>Cart</h1>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"cart\">\n");
      out.write("  \n");
      out.write("      <div class=\"products\">\n");
      out.write("  \n");
      out.write("        <div class=\"product\">\n");
      out.write("  \n");
      out.write("          <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${detail.img}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("  \n");
      out.write("          <div class=\"product-info\">\n");
      out.write("  \n");
      out.write("            <h3 class=\"product-name\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${detail.cname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("  \n");
      out.write("            <h4 class=\"product-price\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${detail.cprice}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("đ</h4>\n");
      out.write("  \n");
      out.write("            <p class=\"product-quantity\">Số lượng: <input type=\"text\" name=\"qtt\">  \n");
      out.write("            <p class=\"product-remove\">\n");
      out.write("  \n");
      out.write("              <i class=\"fa fa-trash\" aria-hidden=\"true\"></i>\n");
      out.write("  \n");
      out.write("              <a href=\"checkout?cid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${detail.cid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"> <span class=\"remove\">Proceed To Payment</span></a>\n");
      out.write("  \n");
      out.write("            </p>\n");
      out.write("  \n");
      out.write("          </div>\n");
      out.write("  \n");
      out.write("        </div>\n");
      out.write("  \n");
      out.write("\n");
      out.write("  \n");
      out.write("      </div>\n");
      out.write("  \n");
      out.write("      \n");
      out.write("  \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("  \n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("<!-- cart -->\n");
      out.write("\n");
      out.write("    <!--  footer -->\n");
      out.write("    <footr>\n");
      out.write("      <div class=\"footer \">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-md-12\">\n");
      out.write("              <form class=\"contact_bg\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-md-12\">\n");
      out.write("                <div class=\"titlepage\">\n");
      out.write("                  <h2>Contact us</h2>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                  <input class=\"contactus\" placeholder=\"Your Name\" type=\"text\" name=\"Your Name\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                  <input class=\"contactus\" placeholder=\"Your Email\" type=\"text\" name=\"Your Email\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                  <input class=\"contactus\" placeholder=\"Your Phone\" type=\"text\" name=\"Your Phone\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                  <textarea class=\"textarea\" placeholder=\"Message\" type=\"text\" name=\"Message\"></textarea>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-xl-12 col-lg-12 col-md-12 col-sm-12\">\n");
      out.write("                  <button class=\"send\">Send</button>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-12 border_top\">\n");
      out.write("              <form class=\"news\">\n");
      out.write("               <h3>E-mail</h3>\n");
      out.write("               <input class=\"newslatter\" placeholder=\"ENTER YOUR MAIL\">\n");
      out.write("                <button class=\"submit\">Subscribe</button>\n");
      out.write("              </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xl-12 col-lg-12 col-md-12 col-sm-12 \">\n");
      out.write("              <div class=\"row\">\n");
      out.write("                <div class=\"col-xl-12 col-lg-12 col-md-12 col-sm-12 \">\n");
      out.write("                  <div class=\"address\">\n");
      out.write("                    <ul class=\"loca\">\n");
      out.write("                      <li>\n");
      out.write("                        <a href=\"https://www.google.com/maps/place/19+H%E1%BB%93+T%C6%B0%C6%A1ng,+Thanh+Kh%C3%AA+%C4%90%C3%B4ng,+Thanh+Kh%C3%AA,+%C4%90%C3%A0+N%E1%BA%B5ng+550000,+Vietnam/@16.0631575,108.1810338,17z/data=!4m5!3m4!1s0x31421903c1e1af29:0xda107885bb737c88!8m2!3d16.0631575!4d108.1832278\"><img src=\"icon/loc.png\" alt=\"#\" /></a>Locations\n");
      out.write("                   \n");
      out.write("                        <li>\n");
      out.write("                          \n");
      out.write("                            <a href=\"#\"><img src=\"icon/call.png\" alt=\"#\" /></a>+ <input type=\"text\" name=\"not\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${detail.nOt}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" readonly required> </li>\n");
      out.write("                          <li>\n");
      out.write("                            <a href=\"#\"><img src=\"icon/email.png\" alt=\"#\" /></a>MTB@gmail.com </li>\n");
      out.write("                          </ul>\n");
      out.write("                         \n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                       <div class=\"col-xl-12 col-lg-12 col-md-12 col-sm-12 \">\n");
      out.write("                           <ul class=\"social_link\">\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-linkedin-square\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                          </ul>\n");
      out.write("                       </div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("              </div>\n");
      out.write("               <div class=\"container\">\n");
      out.write("              <!-- <div class=\"copyright\">\n");
      out.write("               \n");
      out.write("                  <p>Copyright 2019 All Right Reserved By <a href=\"https://html.design/\">Free  html Templates</a></p>\n");
      out.write("                </div> -->\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </footr>\n");
      out.write("          <!-- end footer -->\n");
      out.write("          <!-- Javascript files-->\n");
      out.write("          <script src=\"js/jquery.min.js\"></script>\n");
      out.write("          <script src=\"js/popper.min.js\"></script>\n");
      out.write("          <script src=\"js/bootstrap.bundle.min.js\"></script>\n");
      out.write("          <script src=\"js/jquery-3.0.0.min.js\"></script>\n");
      out.write("          <script src=\"js/plugin.js\"></script>\n");
      out.write("          <script src=\"js/modal.js\"></script>\n");
      out.write("          <script src=\"js/search.js\"></script>\n");
      out.write("          <script src=\"js/profile-box.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("          <!-- sidebar -->\n");
      out.write("          <script src=\"js/jquery.mCustomScrollbar.concat.min.js\"></script>\n");
      out.write("          <script src=\"js/custom.js\"></script>\n");
      out.write("          <script src=\"https:cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /cart.jsp(76,22) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.acc==null}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                      <li > <a href=\"./login\">login</a> </li>\n");
          out.write("                      ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /cart.jsp(79,22) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.acc !=null}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                      <li class=\"search-toggle\">\n");
          out.write("                        <div class=\"search-container\">\n");
          out.write("                          <div id=\"search-group\" class=\"search-group close-search\">\n");
          out.write("                            <div class=\"toggle-target-container\">\n");
          out.write("                              <div class=\"toggle-target\"><input   type=\"text\" class=\"search-text\" placeholder=\"Search\"></div>\n");
          out.write("                            </div>\n");
          out.write("                            <div class=\"search-button-container\">\n");
          out.write("                              <span class=\"input-group-addon search-button\"><i class=\"fa fa-search\" id=\"search-icon\"></i></span>\n");
          out.write("                            </div>\n");
          out.write("                          </div>\n");
          out.write("                        </div>\n");
          out.write("                      </li>\n");
          out.write("                       ");
          if (_jspx_meth_c_005fif_005f2(_jspx_th_c_005fif_005f1, _jspx_page_context))
            return true;
          out.write("\n");
          out.write("                      ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f2_reused = false;
    try {
      _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
      // /cart.jsp(92,23) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.acc !=null}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
      if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                      <li class=\"action-profile\">\n");
          out.write("                        <div class=\"profile\" onclick=\"menuToggle();\">\n");
          out.write("                          <img src=\"images/up.jpg\">\n");
          out.write("                        </div>\n");
          out.write("                        <div class=\"menu-profile\">\n");
          out.write("                            <h3>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.acc.firstname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("<br><span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.acc.lastname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</span></h3>\n");
          out.write("                          <ul>\n");
          out.write("                            <li><img src=\"images/user.png\"><a href=\"profile.jsp\">My profile</a></li>\n");
          out.write("                            <li><img src=\"images/edit.png\"><a href=\"./editprofile\">Edit profile</a></li>\n");
          out.write("                            <li><img src=\"images/question.png\"><a href=\"about.jsp\">Help</a></li>\n");
          out.write("                            <li><img src=\"images/log-out.png\"><a href=\"./logout\">Log out</a></li>\n");
          out.write("                          </ul>\n");
          out.write("                        </div>\n");
          out.write("                      </li>\n");
          out.write("                       ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      _jspx_th_c_005fif_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f2, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f2_reused);
    }
    return false;
  }
}
