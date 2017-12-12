package bmm.struts.action.checkout;

import bmm.service.CheckoutControlService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;

/**
 * 购物车的业务请求
 */
public class CheckoutControlAction extends ActionSupport {
    private CheckoutControlService checkoutControlService;
    private String count;
    private String goodsId;
    private String userId;
    private String message;

    public CheckoutControlService getCheckoutControlService() {
        return checkoutControlService;
    }

    public void setCheckoutControlService(CheckoutControlService checkoutControlService) {
        this.checkoutControlService = checkoutControlService;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * 处理添加购物车的业务操作
     *
     * @return 返回字符串"addto"
     */
    public String addTo() {
        getPar();
        System.out.println(this.goodsId);
        if (checkoutControlService.addTo(Integer.parseInt(this.goodsId),
                Integer.parseInt(this.count), Integer.parseInt(this.userId))) {
            message = "添加成功";
        } else {
            message = "添加失败请重试";
        }
        return "addTo";
    }

    /**
     * 用于移除购物车中商品的业务操作
     *
     * @return 返回字符串"remove"
     */
    public String remove() {
        getPar();
        if (checkoutControlService.removeGoods(Integer.parseInt(this.goodsId), Integer.parseInt(this.userId))) {
            message = "移除成功";
        } else {
            message = "移除失败";
        }
        return "remove";
    }

    /**
     * 用于获取浏览器请求的参数
     */
    private void getPar() {
        HttpServletRequest request = ServletActionContext.getRequest();
        this.count = request.getParameter("count");
        this.goodsId = request.getParameter("goodsId");
        this.userId = request.getParameter("userId");
    }

}
