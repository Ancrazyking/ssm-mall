/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-05-30 09:15:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.commons;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class shortcut_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div class=\"topMenu\">\r\n");
      out.write("  <div class=\"pW\">\r\n");
      out.write("    \r\n");
      out.write("    <ul class=\"fr topTh\">\r\n");
      out.write("      <li class=\"login\" id=\"login\">\r\n");
      out.write("      \t<span id=\"loginbar\" style=\"margin-right: 15px;\">\r\n");
      out.write("\t      \t<a href=\"https://passport.e3mall.cn/?returnUrl=http%3A//www.e3mall.cn/\">请登录</a>\r\n");
      out.write("      \t</span>\r\n");
      out.write("      \t<a href=\"https://passport.e3mall.cn/reg/?returnUrl=http%3A//www.e3mall.cn/\">免费注册</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <!--<li id='qiyeLogin'><a href='http://www.sfme.me/login.jhtml' target='_blank' rel='nofollow'>员工福利</a></li>-->\r\n");
      out.write("      <li class=\"myOrder\"><a name=\"sfbest_hp_hp_head_OrderList\" class=\"trackref\" href=\"http://home.e3mall.cn/myorder/index/\" rel=\"nofollow\">我的订单</a></li>\r\n");
      out.write("      <li class=\"menus\">\r\n");
      out.write("        <a name=\"sfbest_hp_hp_head_home1\" href=\"http://home.e3mall.cn/my/index/\" rel=\"nofollow\" class=\"trackref t\">我的优选</a><b></b>\r\n");
      out.write("        <span class=\"outline\"></span>\r\n");
      out.write("        <span class=\"blank\"></span>\r\n");
      out.write("        <div class=\"dd\">\r\n");
      out.write("          <div><a name=\"sfbest_hp_hp_head_home2\" class=\"trackref\" href=\"http://home.e3mall.cn/myorder/index/\" rel=\"nofollow\">我的订单</a></div>\r\n");
      out.write("          <div><a name=\"sfbest_hp_hp_head_home4\" class=\"trackref\" href=\"http://home.e3mall.cn/my/points/\" rel=\"nofollow\">我的积分</a></div>\r\n");
      out.write("          <div><a name=\"sfbest_hp_hp_head_home3\" class=\"trackref\" href=\"http://home.e3mall.cn/favorites/index/\" rel=\"nofollow\">我的收藏</a></div>\r\n");
      out.write("          <!-- <div><a href=\"http://home.e3mall.cn/my/balance/\" rel=\"nofollow\">账户余额</a></div> -->\r\n");
      out.write("          <div><a href=\"http://home.e3mall.cn/giftcard/list/\" rel=\"nofollow\">我的优选卡</a></div>\r\n");
      out.write("          <div><a href=\"http://home.e3mall.cn/usercoupon/list/\" rel=\"nofollow\">我的优惠券</a></div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </li>\r\n");
      out.write("\t  <li class=\"d2 tShow\"><s></s><q></q><a name=\"sfbest_hp_hp_head_app1\" class=\"trackref\" href=\"http://app.e3mall.cn/\" target=\"_blank\">移动客户端</a>\r\n");
      out.write("        <div class=\"dd\">\r\n");
      out.write("          <div class=\"sf-client\">\r\n");
      out.write("            <span class=\"client-img\"></span>\r\n");
      out.write("            <i></i>\r\n");
      out.write("            <div class=\"client-txt\">\r\n");
      out.write("              <em>扫描我，即可下载</em>\r\n");
      out.write("              <strong>宜立方商城客户端</strong>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"app-btn\">\r\n");
      out.write("            <a class=\"app-apple\" target=\"_blank\" rel=\"nofollow\" href=\"http://itunes.apple.com/cn/app/id563194150\"></a>\r\n");
      out.write("            <a class=\"app-android\" target=\"_blank\" rel=\"nofollow\" href=\"http://android.e3mall.cn/sfandroid\"></a>\r\n");
      out.write("          </div>\r\n");
      out.write("\t\t  <div class=\"client-promo\"><a class=\"trackref\" rel=\"nofollow\" href=\"http://app.e3mall.cn\" target=\"_blank\" name=\"sfbest_hp_hp_head_app2\">先摇券 后买单</a>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"corner\">\r\n");
      out.write("          <div class=\"aBg\"></div>\r\n");
      out.write("          <div class=\"aCt\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </li>\r\n");
      out.write("\t  <li class=\"menus\">\r\n");
      out.write("        <a name=\"sfbest_hp_hp_head_help1\" href=\"http://help.e3mall.cn/\" target=\"_blank\" class=\"trackref t\">帮助中心</a><b></b>\r\n");
      out.write("        <span class=\"outline\"></span>\r\n");
      out.write("        <span class=\"blank\"></span>\r\n");
      out.write("        <div class=\"dd\">\r\n");
      out.write("          <div><a name=\"sfbest_hp_hp_head_help2\" class=\"trackref\" href=\"http://help.e3mall.cn/140/128.html\" rel=\"nofollow\" target=\"_blank\">购物指南</a></div>\r\n");
      out.write("          <div><a name=\"sfbest_hp_hp_head_help3\" class=\"trackref\" href=\"http://help.e3mall.cn/141/134.html\" rel=\"nofollow\" target=\"_blank\">配送服务</a></div>\r\n");
      out.write("          <div><a name=\"sfbest_hp_hp_head_help4\" class=\"trackref\" href=\"http://help.e3mall.cn/143/131.html\" rel=\"nofollow\" target=\"_blank\">支付方式</a></div>\r\n");
      out.write("          <div><a name=\"sfbest_hp_hp_head_help5\" class=\"trackref\" href=\"http://help.e3mall.cn/144/143.html\" rel=\"nofollow\" target=\"_blank\">售后服务</a></div>\r\n");
      out.write("        \r\n");
      out.write("          <div><a name=\"sfbest_hp_hp_head_help7\" class=\"trackref\" href=\"http://help.e3mall.cn/377/4407.html\" rel=\"nofollow\" target=\"_blank\">客服邮箱</a></div>\r\n");
      out.write("          <div><a name=\"sfbest_hp_hp_head_help8\" class=\"trackref\" href=\"http://help.e3mall.cn/377/6766.html\" rel=\"nofollow\" target=\"_blank\">投诉与建议</a></div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </li>\r\n");
      out.write("\t  <li class=\"allCat\"><em class=\"site\">网站导航</em><s></s><span class=\"outline\"></span> <span class=\"blank\"></span>\r\n");
      out.write("        <div class=\"dd\">\r\n");
      out.write("          <dl>\r\n");
      out.write("            <dt class=\"dh1\">商品分类</dt>\r\n");
      out.write("            <dd>\r\n");
      out.write("\t\t\t\t<a name=\"sfbest_hp_hp_head_category1\" class=\"trackref\" href=\"/fresh/\" target=\"_blank\">肉类海鲜</a>\r\n");
      out.write("\t\t\t\t<a name=\"sfbest_hp_hp_head_category2\" class=\"trackref\" href=\"/fresh/\" target=\"_blank\">熟食蛋奶</a>\r\n");
      out.write("\t\t\t\t<a name=\"sfbest_hp_hp_head_category3\" class=\"trackref\" href=\"/fresh/\" target=\"_blank\">水果蔬菜</a>\r\n");
      out.write("\t\t\t\t<a name=\"sfbest_hp_hp_head_category4\" class=\"trackref\" href=\"/drinks/4-0-0-0-0-2-0-0-0-0-0.html\" target=\"_blank\">酒水饮料</a>\r\n");
      out.write("\t\t\t\t<a name=\"sfbest_hp_hp_head_category5\" class=\"trackref\" href=\"/food/6-0-0-0-0-2-0-0-0-0-0.html\" target=\"_blank\">休闲食品</a>\r\n");
      out.write("\t\t\t\t<a name=\"sfbest_hp_hp_head_category6\" class=\"trackref\" href=\"/tea/5-0-0-0-0-2-0-0-0-0-0.html\" target=\"_blank\">冲调茶饮</a>\r\n");
      out.write("\t\t\t\t<a name=\"sfbest_hp_hp_head_category7\" class=\"trackref\" href=\"/oil/3-0-0-0-0-2-0-0-0-0-0.html\" target=\"_blank\">粮油副食</a>\r\n");
      out.write("\t\t\t\t<a name=\"sfbest_hp_hp_head_category8\" class=\"trackref\" href=\"/oil/24-0-0-0-0-2-0-0-0-0-0.html\" target=\"_blank\">南北干货</a>\r\n");
      out.write("            </dd>\r\n");
      out.write("          </dl>\r\n");
      out.write("          <dl class=\"line\"></dl>\r\n");
      out.write("          <dl>\r\n");
      out.write("            <dt class=\"dh2\">特色频道</dt>\r\n");
      out.write("            <dd><a name=\"sfbest_hp_hp_head_channel12\" class=\"trackref\" href=\"http://www.sfbest.hk\" target=\"_blank\">跨境直发</a><a name=\"sfbest_hp_hp_head_channel2\" class=\"trackref\" href=\"/qiye/\" target=\"_blank\">企业专区</a><a name=\"sfbest_hp_hp_head_channel3\" class=\"trackref\" href=\"/wine/\" target=\"_blank\">红酒廊</a><a name=\"sfbest_hp_hp_head_channel4\" class=\"trackref\" href=\"/taste/\" target=\"_blank\">寰宇美食</a><!-- <a name=\"sfbest_hp_hp_head_channel5\" class=\"trackref\" href=\"/healthy/\" target=\"_blank\">健康养生</a> -->\r\n");
      out.write("            <!-- <a name=\"sfbest_hp_hp_head_channel6\" class=\"trackref\" href=\"/member/\" target=\"_blank\">会员俱乐部</a> --></dd>\r\n");
      out.write("          </dl>\r\n");
      out.write("          <dl class=\"line\"></dl>\r\n");
      out.write("          <dl>\r\n");
      out.write("            <dt class=\"dh3\">更多</dt>\r\n");
      out.write("            <dd><a name=\"sfbest_hp_hp_head_moreapp\" class=\"trackref\" href=\"http://app.e3mall.cn/\" target=\"_blank\">客户端</a><a name=\"sfbest_hp_hp_head_moreabout\" class=\"trackref\" href=\"/www/380/5118.html\" target=\"_blank\">关注我们</a><p>客服电话：4008-888-888</p></dd>\r\n");
      out.write("          </dl>\r\n");
      out.write("        </div>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"d3 tShow\"><a name=\"sfbest_hp_hp_head_weibo\" class=\"trackref\" title=\"关注宜立方商城微博\" href=\"http://weibo.com/sfbest\" rel=\"nofollow\" target=\"_blank\"><q></q></a></li>\r\n");
      out.write("      <li class=\"d4 tShow\"><q></q><!--微信-->\r\n");
      out.write("         <div class=\"dd\">\r\n");
      out.write("         <div class=\"sf_wx_t\">关注宜立方商城微信</div>\r\n");
      out.write("         <div class=\"sf_wx\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"corner\">\r\n");
      out.write("          <div class=\"aBg\"></div>\r\n");
      out.write("          <div class=\"aCt\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("       </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <span class=\"clear\"></span>\r\n");
      out.write("  </div>\r\n");
      out.write("  <script type=\"text/javascript\" src=\"/js/e3mall.js\"></script>\r\n");
      out.write("  <script type=\"text/javascript\" src=\"/js/jquery.cookie.js\"></script>\r\n");
      out.write("</div>");
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
