/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.6
 * Generated at: 2018-06-04 05:44:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main3_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-5.0.5.RELEASE.jar", Long.valueOf(1525933211405L));
    _jspx_dependants.put("jar:file:/C:/project/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/first/WEB-INF/lib/standard-1.1.2.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
    _jspx_dependants.put("/WEB-INF/lib/standard-1.1.2.jar", Long.valueOf(1520823355453L));
    _jspx_dependants.put("jar:file:/C:/project/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/first/WEB-INF/lib/spring-webmvc-5.0.5.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1522752190000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

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
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\" xmlns=\"http://www.w3.org/1999/html\">\r\n");
      out.write("<head>\r\n");
      out.write("  <script src=\"http://code.jquery.com/jquery-1.11.0.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write(" <link rel=\"icon\" type=\"image/png\" href=\"view/images/DB_16х16.png\">\r\n");
      out.write("    <meta charset=\"utf-8\">    \r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"description\" content=\"A front-end template that helps you build fast, modern mobile web apps.\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <title>Material Dashboard Lite</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Add to homescreen for Chrome on Android -->\r\n");
      out.write("    <meta name=\"mobile-web-app-capable\" content=\"yes\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Add to homescreen for Safari on iOS -->\r\n");
      out.write("    <meta name=\"apple-mobile-web-app-capable\" content=\"yes\">\r\n");
      out.write("    <meta name=\"apple-mobile-web-app-status-bar-style\" content=\"black\">\r\n");
      out.write("    <meta name=\"apple-mobile-web-app-title\" content=\"Material Design Lite\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Tile icon for Win8 (144x144 + tile color) -->\r\n");
      out.write("    <meta name=\"msapplication-TileImage\" content=\"view/images/touch/ms-touch-icon-144x144-precomposed.png\">\r\n");
      out.write("    <meta name=\"msapplication-TileColor\" content=\"#3372DF\">\r\n");
      out.write("\r\n");
      out.write("    <!-- SEO: If your mobile URL is different from the desktop URL, add a canonical link to the desktop page https://developers.google.com/webmasters/smartphone-sites/feature-phones -->\r\n");
      out.write("    <!--\r\n");
      out.write("    <link rel=\"canonical\" href=\"http://www.example.com/\">\r\n");
      out.write("    -->\r\n");
      out.write("\r\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Roboto:400,500,300,100,700,900' rel='stylesheet'\r\n");
      out.write("          type='text/css'>\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- inject:css -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"view/css/lib/getmdl-select.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"view/css/lib/nv.d3.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"view/css/application.css\">\r\n");
      out.write("    <!-- endinject -->\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"mdl-layout mdl-js-layout mdl-layout--fixed-drawer mdl-layout--fixed-header is-small-screen\">\r\n");
      out.write("    <header class=\"mdl-layout__header\">\r\n");
      out.write("        <div class=\"mdl-layout__header-row\">\r\n");
      out.write("            <div class=\"mdl-layout-spacer\"></div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--expandable\">\r\n");
      out.write("                <label class=\"mdl-button mdl-js-button mdl-button--icon\" for=\"search\">\r\n");
      out.write("                    <i class=\"material-icons\">search</i>\r\n");
      out.write("                </label>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"mdl-textfield__expandable-holder\">\r\n");
      out.write("                    <input class=\"mdl-textfield__input\" type=\"text\" id=\"search\"/>\r\n");
      out.write("                    <label class=\"mdl-textfield__label\" for=\"search\">Enter your query...</label>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"material-icons mdl-badge mdl-badge--overlap mdl-button--icon notification\" id=\"notification\"\r\n");
      out.write("                 data-badge=\"23\">\r\n");
      out.write("                notifications_none\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <ul class=\"mdl-menu mdl-list mdl-js-menu mdl-js-ripple-effect mdl-menu--bottom-right mdl-shadow--2dp notifications-dropdown\"\r\n");
      out.write("                for=\"notification\">\r\n");
      out.write("                <li class=\"mdl-list__item\">\r\n");
      out.write("                    You have 23 new notifications!\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"mdl-menu__item mdl-list__item list__item--border-top\">\r\n");
      out.write("                    <span class=\"mdl-list__item-primary-content\">\r\n");
      out.write("                        <span class=\"mdl-list__item-avatar background-color--primary\">\r\n");
      out.write("                            <i class=\"material-icons\">plus_one</i>\r\n");
      out.write("                        </span>\r\n");
      out.write("                        <span>You have 3 new orders.</span>\r\n");
      out.write("                    </span>\r\n");
      out.write("                    <span class=\"mdl-list__item-secondary-content\">\r\n");
      out.write("                      <span class=\"label\">just now</span>\r\n");
      out.write("                    </span>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"mdl-menu__item mdl-list__item list__item--border-top\">\r\n");
      out.write("                    <span class=\"mdl-list__item-primary-content\">\r\n");
      out.write("                        <span class=\"mdl-list__item-avatar background-color--secondary\">\r\n");
      out.write("                            <i class=\"material-icons\">error_outline</i>\r\n");
      out.write("                        </span>\r\n");
      out.write("                      <span>Database error</span>\r\n");
      out.write("                    </span>\r\n");
      out.write("                    <span class=\"mdl-list__item-secondary-content\">\r\n");
      out.write("                      <span class=\"label\">1 min</span>\r\n");
      out.write("                    </span>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"mdl-menu__item mdl-list__item list__item--border-top\">\r\n");
      out.write("                    <span class=\"mdl-list__item-primary-content\">\r\n");
      out.write("                        <span class=\"mdl-list__item-avatar background-color--primary\">\r\n");
      out.write("                            <i class=\"material-icons\">new_releases</i>\r\n");
      out.write("                        </span>\r\n");
      out.write("                      <span>The Death Star is built!</span>\r\n");
      out.write("                    </span>\r\n");
      out.write("                    <span class=\"mdl-list__item-secondary-content\">\r\n");
      out.write("                      <span class=\"label\">2 hours</span>\r\n");
      out.write("                    </span>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"mdl-menu__item mdl-list__item list__item--border-top\">\r\n");
      out.write("                    <span class=\"mdl-list__item-primary-content\">\r\n");
      out.write("                        <span class=\"mdl-list__item-avatar background-color--primary\">\r\n");
      out.write("                            <i class=\"material-icons\">mail_outline</i>\r\n");
      out.write("                        </span>\r\n");
      out.write("                      <span>You have 4 new mails.</span>\r\n");
      out.write("                    </span>\r\n");
      out.write("                    <span class=\"mdl-list__item-secondary-content\">\r\n");
      out.write("                      <span class=\"label\">5 days</span>\r\n");
      out.write("                    </span>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"mdl-list__item list__item--border-top\">\r\n");
      out.write("                    <button href=\"#\" class=\"mdl-button mdl-js-button mdl-js-ripple-effect\">ALL NOTIFICATIONS</button>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"material-icons mdl-badge mdl-badge--overlap mdl-button--icon message\" id=\"inbox\" data-badge=\"4\">\r\n");
      out.write("                mail_outline\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <ul class=\"mdl-menu mdl-list mdl-js-menu mdl-js-ripple-effect mdl-menu--bottom-right mdl-shadow--2dp messages-dropdown\"\r\n");
      out.write("                for=\"inbox\">\r\n");
      out.write("                <li class=\"mdl-list__item\">\r\n");
      out.write("                    You have 4 new messages!\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"mdl-menu__item mdl-list__item mdl-list__item--two-line list__item--border-top\">\r\n");
      out.write("                    <span class=\"mdl-list__item-primary-content\">\r\n");
      out.write("                        <span class=\"mdl-list__item-avatar background-color--primary\">\r\n");
      out.write("                            <text>A</text>\r\n");
      out.write("                        </span>\r\n");
      out.write("                        <span>Alice</span>\r\n");
      out.write("                        <span class=\"mdl-list__item-sub-title\">Birthday Party</span>\r\n");
      out.write("                    </span>\r\n");
      out.write("                    <span class=\"mdl-list__item-secondary-content\">\r\n");
      out.write("                      <span class=\"label label--transparent\">just now</span>\r\n");
      out.write("                    </span>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"mdl-menu__item mdl-list__item mdl-list__item--two-line list__item--border-top\">\r\n");
      out.write("                    <span class=\"mdl-list__item-primary-content\">\r\n");
      out.write("                        <span class=\"mdl-list__item-avatar background-color--baby-blue\">\r\n");
      out.write("                            <text>M</text>\r\n");
      out.write("                        </span>\r\n");
      out.write("                        <span>Mike</span>\r\n");
      out.write("                        <span class=\"mdl-list__item-sub-title\">No theme</span>\r\n");
      out.write("                    </span>\r\n");
      out.write("                    <span class=\"mdl-list__item-secondary-content\">\r\n");
      out.write("                      <span class=\"label label--transparent\">5 min</span>\r\n");
      out.write("                    </span>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"mdl-menu__item mdl-list__item mdl-list__item--two-line list__item--border-top\">\r\n");
      out.write("                    <span class=\"mdl-list__item-primary-content\">\r\n");
      out.write("                        <span class=\"mdl-list__item-avatar background-color--cerulean\">\r\n");
      out.write("                            <text>D</text>\r\n");
      out.write("                        </span>\r\n");
      out.write("                        <span>Darth</span>\r\n");
      out.write("                        <span class=\"mdl-list__item-sub-title\">Suggestion</span>\r\n");
      out.write("                    </span>\r\n");
      out.write("                    <span class=\"mdl-list__item-secondary-content\">\r\n");
      out.write("                      <span class=\"label label--transparent\">23 hours</span>\r\n");
      out.write("                    </span>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"mdl-menu__item mdl-list__item mdl-list__item--two-line list__item--border-top\">\r\n");
      out.write("                    <span class=\"mdl-list__item-primary-content\">\r\n");
      out.write("                        <span class=\"mdl-list__item-avatar background-color--mint\">\r\n");
      out.write("                            <text>D</text>\r\n");
      out.write("                        </span>\r\n");
      out.write("                        <span>Don McDuket</span>\r\n");
      out.write("                        <span class=\"mdl-list__item-sub-title\">NEWS</span>\r\n");
      out.write("                    </span>\r\n");
      out.write("                    <span class=\"mdl-list__item-secondary-content\">\r\n");
      out.write("                      <span class=\"label label--transparent\">30 Nov</span>\r\n");
      out.write("                    </span>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"mdl-list__item list__item--border-top\">\r\n");
      out.write("                    <button href=\"#\" class=\"mdl-button mdl-js-button mdl-js-ripple-effect\">SHOW ALL MESSAGES</button>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"avatar-dropdown\" id=\"icon\">\r\n");
      out.write("                <span>USER</span>\r\n");
      out.write("                <img src=\"view/images/person-icon.png\" width=\"32px\" height=\"32px\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <ul class=\"mdl-menu mdl-list mdl-menu--bottom-right mdl-js-menu mdl-js-ripple-effect mdl-shadow--2dp account-dropdown\"\r\n");
      out.write("                for=\"icon\">\r\n");
      out.write("                <li class=\"mdl-list__item mdl-list__item--two-line\">\r\n");
      out.write("                    <span class=\"mdl-list__item-primary-content\">\r\n");
      out.write("                        <span class=\"material-icons mdl-list__item-avatar\"></span>\r\n");
      out.write("                        <span>USER</span>\r\n");
      out.write("                        <span class=\"mdl-list__item-sub-title\">user@skywalker.com</span>\r\n");
      out.write("                    </span>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"list__item--border-top\"></li>\r\n");
      out.write("                <li class=\"mdl-menu__item mdl-list__item\">\r\n");
      out.write("                    <span class=\"mdl-list__item-primary-content\">\r\n");
      out.write("                        <i class=\"material-icons mdl-list__item-icon\">account_circle</i>\r\n");
      out.write("                        My account\r\n");
      out.write("                    </span>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"mdl-menu__item mdl-list__item\">\r\n");
      out.write("                    <span class=\"mdl-list__item-primary-content\">\r\n");
      out.write("                        <i class=\"material-icons mdl-list__item-icon\">check_box</i>\r\n");
      out.write("                        My tasks\r\n");
      out.write("                    </span>\r\n");
      out.write("                    <span class=\"mdl-list__item-secondary-content\">\r\n");
      out.write("                      <span class=\"label background-color--primary\">3 new</span>\r\n");
      out.write("                    </span>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"mdl-menu__item mdl-list__item\">\r\n");
      out.write("                    <span class=\"mdl-list__item-primary-content\">\r\n");
      out.write("                        <i class=\"material-icons mdl-list__item-icon\">perm_contact_calendar</i>\r\n");
      out.write("                        My events\r\n");
      out.write("                    </span>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"list__item--border-top\"></li>\r\n");
      out.write("                <li class=\"mdl-menu__item mdl-list__item\">\r\n");
      out.write("                    <span class=\"mdl-list__item-primary-content\">\r\n");
      out.write("                        <i class=\"material-icons mdl-list__item-icon\">settings</i>\r\n");
      out.write("                        Settings\r\n");
      out.write("                    </span>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"mdl-menu__item mdl-list__item\">\r\n");
      out.write("                    <span class=\"mdl-list__item-primary-content\">\r\n");
      out.write("                        <i class=\"material-icons mdl-list__item-icon text-color--secondary\">exit_to_app</i>\r\n");
      out.write("                        Log out\r\n");
      out.write("                    </span>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("            <button id=\"more\"\r\n");
      out.write("                    class=\"mdl-button mdl-js-button mdl-button--icon\">\r\n");
      out.write("                <i class=\"material-icons\">more_vert</i>\r\n");
      out.write("            </button>\r\n");
      out.write("\r\n");
      out.write("            <ul class=\"mdl-menu mdl-menu--bottom-right mdl-js-menu mdl-js-ripple-effect mdl-shadow--2dp settings-dropdown\"\r\n");
      out.write("                for=\"more\">\r\n");
      out.write("                <li class=\"mdl-menu__item\">\r\n");
      out.write("                    Settings\r\n");
      out.write("                </li>\r\n");
      out.write("                <a class=\"mdl-menu__item\" href=\"https://github.com/CreativeIT/getmdl-dashboard/issues\">\r\n");
      out.write("                    Support\r\n");
      out.write("                </a>\r\n");
      out.write("                <li class=\"mdl-menu__item\">\r\n");
      out.write("                    F.A.Q.\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"mdl-layout__drawer\">\r\n");
      out.write("        <header>AdminBoard</header>\r\n");
      out.write("        <nav class=\"mdl-navigation\">\r\n");
      out.write("            <a class=\"mdl-navigation__link mdl-navigation__link--current\" href=\"map.do\">\r\n");
      out.write("                <i class=\"material-icons\" role=\"presentation\">dashboard</i>\r\n");
      out.write("                Danger\r\n");
      out.write("            </a>\r\n");
      out.write("            <a class=\"mdl-navigation__link\" href=\"status.do\">\r\n");
      out.write("                <i class=\"material-icons\" role=\"presentation\">person</i>\r\n");
      out.write("                State\r\n");
      out.write("            </a>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"mdl-layout-spacer\"></div>\r\n");
      out.write("            <a class=\"mdl-navigation__link\" href=\"https://github.com/CreativeIT/getmdl-dashboard\">\r\n");
      out.write("                <i class=\"material-icons\" role=\"presentation\">link</i>\r\n");
      out.write("                GitHub\r\n");
      out.write("            </a>\r\n");
      out.write("        </nav>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <main class=\"mdl-layout__content\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"mdl-grid mdl-grid--no-spacing\">\r\n");
      out.write("           \r\n");
      out.write("            ");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("         \r\n");
      out.write("         \r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </main>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- inject:js -->\r\n");
      out.write("<script src=\"view/js/d3.js\"></script>\r\n");
      out.write("<script src=\"view/js/getmdl-select.min.js\"></script>\r\n");
      out.write("<script src=\"view/js/material.js\"></script>\r\n");
      out.write("<script src=\"view/js/nv.d3.js\"></script>\r\n");
      out.write("<script src=\"view/js/widgets/employer-form/employer-form.js\"></script>\r\n");
      out.write("<script src=\"view/js/widgets/pie-chart/pie-chart-nvd3.js\"></script>\r\n");
      out.write("<script src=\"view/js/widgets/line-chart/line-chart-nvd3.js\"></script>\r\n");
      out.write("<script src=\"view/js/widgets/todo/todo.js\"></script>\r\n");
      out.write("<script src=\"view/js/widgets/table/table.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- endinject -->\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    javax.servlet.http.HttpServletRequest request = (javax.servlet.http.HttpServletRequest)_jspx_page_context.getRequest();
    javax.servlet.http.HttpServletResponse response = (javax.servlet.http.HttpServletResponse)_jspx_page_context.getResponse();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    boolean _jspx_th_c_005fchoose_005f0_reused = false;
    try {
      _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f0.setParent(null);
      int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
      if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("               ");
          if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("               ");
          if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      _jspx_th_c_005fchoose_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fchoose_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fchoose_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    javax.servlet.http.HttpServletRequest request = (javax.servlet.http.HttpServletRequest)_jspx_page_context.getRequest();
    javax.servlet.http.HttpServletResponse response = (javax.servlet.http.HttpServletResponse)_jspx_page_context.getResponse();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f0_reused = false;
    try {
      _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /view/main3.jsp(279,15) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${center == null }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
      if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                  ");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "map2.jsp", out, false);
          out.write("\r\n");
          out.write("               ");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      _jspx_th_c_005fwhen_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fwhen_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    javax.servlet.http.HttpServletRequest request = (javax.servlet.http.HttpServletRequest)_jspx_page_context.getRequest();
    javax.servlet.http.HttpServletResponse response = (javax.servlet.http.HttpServletResponse)_jspx_page_context.getResponse();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    boolean _jspx_th_c_005fotherwise_005f0_reused = false;
    try {
      _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
      if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                  ");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${center}.jsp", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null), out, false);
          out.write("\r\n");
          out.write("               ");
          int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      _jspx_th_c_005fotherwise_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fotherwise_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fotherwise_005f0_reused);
    }
    return false;
  }
}