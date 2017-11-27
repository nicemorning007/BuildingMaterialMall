package test;

import com.opensymphony.xwork2.ActionSupport;

public class CheckboxValueTest extends ActionSupport {
    private String forb;
    private String[] chkValues;

    public String getForb() {
        return forb;
    }

    public void setForb(String forb) {
        this.forb = forb;
    }

    public String[] getChkValues() {
        return chkValues;
    }

    public void setChkValues(String[] chkValues) {
        this.chkValues = chkValues;
    }

    public String getChkName() {
        return forb;
    }

    public void setChkName(String forb) {
        this.forb = forb;
    }

    @Override
    public String execute() throws Exception {
        if (forb != null) {
            chkValues = this.getChkName().split(", ");
        } else {
            chkValues = new String[1];
            chkValues[0] = "未选择";
        }
        return super.SUCCESS;
    }
}
