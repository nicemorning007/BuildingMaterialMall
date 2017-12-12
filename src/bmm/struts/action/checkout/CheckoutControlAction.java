package bmm.struts.action.checkout;

import bmm.service.CheckoutControlService;
import com.opensymphony.xwork2.ActionSupport;

public class CheckoutControlAction extends ActionSupport {
    private CheckoutControlService checkoutControlService;

    public CheckoutControlService getCheckoutControlService() {
        return checkoutControlService;
    }

    public void setCheckoutControlService(CheckoutControlService checkoutControlService) {
        this.checkoutControlService = checkoutControlService;
    }



}
