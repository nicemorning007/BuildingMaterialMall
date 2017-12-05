package filter;

import bmm.utils.cookie_util.CookieUtil;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class AdminFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {
    }

    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        HttpServletRequest hreq = (HttpServletRequest) request;
        HttpServletResponse hres = (HttpServletResponse) response;
        String username = CookieUtil.getCookiesValue(hreq, "isLogin");
        if (username == null || username.length() == 0) {
            hres.sendRedirect("/admin/index.jsp");
        }
    }

    public void destroy() {
    }
}