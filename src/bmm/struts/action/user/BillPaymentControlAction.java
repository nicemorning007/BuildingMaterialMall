package bmm.struts.action.user;

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
    private String userId;
    private String message;
    private double total;

    public void setBillControlService(BillControlService billControlService) {
        this.billControlService = billControlService;
    }

    public BillControlService getBillControlService() {
        return billControlService;
    }

    public void setCheckoutControlService(CheckoutControlService checkoutControlService) {
        this.checkoutControlService = checkoutControlService;
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
