package bmm.struts.action.bill;

import bmm.service.BillControlService;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;

public class BillControlAction {
    private BillControlService billControlService;
    private String billId;
    private String info;

    public BillControlService getBillControlService() {
        return billControlService;
    }

    public void setBillControlService(BillControlService billControlService) {
        this.billControlService = billControlService;
    }

    public String getId() {
        return billId;
    }

    public void setId(String id) {
        this.billId = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String manage() {
        HttpServletRequest request = ServletActionContext.getRequest();
        this.billId = request.getParameter("billId");
        request.setAttribute("billId", billId);
        return "manage";
    }
}