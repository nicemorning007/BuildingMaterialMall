package bmm.struts.action.user;

import bmm.service.BalanceControlService;
import bmm.service.BillControlService;
import bmm.service.CheckoutControlService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;

/**
 * 处理用户的结算业务请求
 */
public class BillPaymentControlAction extends ActionSupport {
    private BillControlService billControlService;
    private CheckoutControlService checkoutControlService;
    private BalanceControlService balanceControlService;
    private String userId;
    private String message;
    private double total;

    public void setBillControlService(BillControlService billControlService) {
        this.billControlService = billControlService;
    }

    public void setCheckoutControlService(CheckoutControlService checkoutControlService) {
        this.checkoutControlService = checkoutControlService;
    }

    public void setBalanceControlService(BalanceControlService balanceControlService) {
        this.balanceControlService = balanceControlService;
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
     * 用于用户结算订单
     *
     * @return 返回字符串"payment"
     */
    public String payment() {
        double money = billControlService.payMent(Integer.parseInt(this.userId));
        if (money > 0) {
            if (balanceControlService.deductBalanceById(Integer.parseInt(this.userId),
                    this.total)) {
                checkoutControlService.cleanOneById(Integer.parseInt(this.userId));
                this.message = "支付成功";
            } else {
                this.message = "支付失败请重试";
            }
        }
        return "payment";
    }

    /**
     * 用于跳转至结算页面
     *
     * @return 返回字符串"goTo"
     */
    public String goTo() {
        HttpServletRequest request = ServletActionContext.getRequest();
        this.userId = request.getParameter("userId");
        this.total = checkoutControlService.addToBill(Integer.parseInt(this.userId));
        return "goTo";
    }

}
