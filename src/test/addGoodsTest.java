package test;

import com.opensymphony.xwork2.ActionSupport;

public class addGoodsTest extends ActionSupport {
    private String name;
    private String price;
    private String manufacturer;
    private String producing;
    private String pictureArray;
    private String info;
    private String cate;
    private String tag;
    private String[] chkValues;


    public String[] getChkValues() {
        return chkValues;
    }

    public void setChkValues(String[] chkValues) {
        this.chkValues = chkValues;
    }

    public String getChkName() {
        return tag;
    }

    public void setChkName(String tag) {
        this.tag = tag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getProducing() {
        return producing;
    }

    public void setProducing(String producing) {
        this.producing = producing;
    }

    public String getPictureArray() {
        return pictureArray;
    }

    public void setPictureArray(String pictureArray) {
        this.pictureArray = pictureArray;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getCate() {
        return cate;
    }

    public void setCate(String cate) {
        this.cate = cate;
    }

    @Override
    public String execute() throws Exception {
//        if (tag != null) {
//            chkValues = this.getChkName().split(", ");
//        } else {
//            chkValues = new String[1];
//            chkValues[0] = "未选择";
//        }
        return super.SUCCESS;
    }
}