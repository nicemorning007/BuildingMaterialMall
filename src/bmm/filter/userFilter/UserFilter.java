package bmm.filter.userFilter;

import bmm.utils.cookie_util.CookieUtil;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 用于用户权限管理的过滤器
 */
public class UserFilter implements Filter {
    private String userLogin;

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        userLogin = CookieUtil.getCookiesValue((HttpServletRequest) servletRequest, "userLogin");
        if (userLogin == null) {
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
        userLogin = null;
    }
}
