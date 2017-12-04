package bmm.utils.cookie_util;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * Cookie工具类，提供Cookie的相关操作
 */
public class CookieUtil {

    /**
     * 用于生成一个设置好的Cookie，需在调用端做存储到客户端等处理
     *
     * @param name     cookie的name
     * @param value    cookie的value
     * @param saveTime cookie的存储时间
     * @return 返回设置好的cookie对象
     */
    public static Cookie addCookie(String name, String value, int saveTime) {
        Cookie cookie = new Cookie(name, value);
        cookie.setMaxAge(saveTime);
        return cookie;
    }

    /**
     * 用于生成一个设置好的Cookie，需在调用端做存储到客户端等处理
     *
     * @param name     cookie的name
     * @param value    cookie的value
     * @param saveTime cookie的存储时间
     * @param path     cookie的存储路径
     * @return 返回设置好的cookie对象
     */
    public static Cookie addCookie(String name, String value, int saveTime, String path) {
        Cookie cookie = new Cookie(name, value);
        cookie.setPath(path);
        cookie.setMaxAge(saveTime);
        return cookie;
    }

    /**
     * 用于生成一个设置好的但<b>在浏览器退出时将自动清除</b>的Cookie，需在调用端做存储到客户端等处理
     *
     * @param name  cookie的name
     * @param value cookie的value
     * @return 返回设置好的cookie对象
     */
    public static Cookie addCookie(String name, String value) {
        Cookie cookie = new Cookie(name, value);
        cookie.setMaxAge(-1);
        return cookie;
    }

    /**
     * 用于生成一个设置好的但<b>在浏览器退出时将自动清除</b>的Cookie，需在调用端做存储到客户端等处理
     *
     * @param name  cookie的name
     * @param value cookie的value
     * @param path cookie的存储路径
     * @return 返回设置好的cookie对象
     */
    public static Cookie addCookie(String name, String value, String path) {
        Cookie cookie = new Cookie(name, value);
        cookie.setPath(path);
        cookie.setMaxAge(-1);
        return cookie;
    }

    /**
     * 用于获取指定名称的cookie的值
     *
     * @param request 当前request对象
     * @param name    要获取的cookie的name
     * @return 如果该cookie存在则返回该cookie的 <b>value</b>，否则返回 <b>null</b>
     */
    public static String getCookiesValue(HttpServletRequest request, String name) {
        String value;
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (name.equals(cookie.getName())) {
                    value = cookie.getValue();
                    if (StringUtils.isNotBlank(value)) {
                        return value;
                    }
                }
            }
        }
        return null;
    }

    /**
     * 用于获取指定名称的cookie对象
     *
     * @param request 当前request对象
     * @param name 要获取的cookie的name
     * @return 如果该cookie存在，则返回该cookie对象；否则返回 <b>null</b>
     */
    public static Cookie getCookie(HttpServletRequest request, String name) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (name.equals(cookie.getName())) {
                    return cookie;
                }
            }
        }
        return null;
    }

    /**
     * 用于删除指定名称的cookie
     *
     * @param request 当前request对象
     * @param name    要删除的cookie的name
     * @return 如果要删除的cookie存在，则返回一个空置的cookie对象；否则返回 <b>null</b>
     */
    public static Cookie delCookie(HttpServletRequest request, String name) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (name.equals(cookie.getName())) {
                    cookie.setMaxAge(0);
                    return cookie;
                }
            }
        }
        return null;
    }
}
