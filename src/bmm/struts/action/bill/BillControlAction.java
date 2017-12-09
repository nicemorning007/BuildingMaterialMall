package bmm.struts.action.bill;

import bmm.service.BillControlService;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;

public class BillControlAction {
    private BillControlService billControlService;
    private String billId;
    private String info;
    private int state;
    private String receiver;
    private double total;

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

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * 用于跳转到订单编辑界面
     *
     * @return 返回字符串"manage"
     */
    public String manage() {
        HttpServletRequest request = ServletActionContext.getRequest();
        this.billId = request.getParameter("billId");
        request.setAttribute("billId", billId);
        return "manage";
    }

    /**
     * 用于编辑订单内容的状态值
     *
     * @return 返回字符串"editState"
     */
    public String editState() {
        HttpServletRequest request = ServletActionContext.getRequest();
        String[] strings = request.getParameterValues("state");
        this.state = Integer.parseInt(strings[0]);
        billControlService.updateStateById(Integer.parseInt(this.billId), this.state);
        return "editState";
    }

    /**
     * 用于编辑订单内容的总价
     *
     * @return 返回字符串"editTotal"
     */
    public String editTotal() {
        HttpServletRequest request = ServletActionContext.getRequest();
        this.total = Double.parseDouble(request.getParameter("total"));
        billControlService.updateTotalById(Integer.parseInt(this.billId), this.total);
        return "editTotal";
    }

    /**
     * 用于编辑订单内容的收件人
     *
     * @return 返回字符串"editReceiver"
     */
    public String editReceiver() {
        HttpServletRequest request = ServletActionContext.getRequest();
        this.receiver = request.getParameter("receiver");
        billControlService.updateReceiverById(Integer.parseInt(this.billId), this.receiver);
        return "editReceiver";
    }

}