package bmm.filter.authorityFilter;

import bmm.utils.cookie_util.CookieUtil;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 用于管理员权限管理的过滤器
 */
public class AuthorityFilter implements Filter {
    private String admin;
    private String userLogin;

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        admin = CookieUtil.getCookiesValue((HttpServletRequest) servletRequest, "isLogin");
        userLogin = CookieUtil.getCookiesValue((HttpServletRequest) servletRequest, "userLogin");
        if (admin == null) {
            servletRequest.getRequestDispatcher("/403.jsp").forward(servletRequest, servletResponse);
            return;
        }
        filterChain.doFilter((HttpServletRequest) servletRequest, (HttpServletResponse) servletResponse);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void destroy() {
        admin = null;
        userLogin = null;
    }
}
