package bmm.struts.action.goods;

import bmm.service.GoodsControlService;
import com.opensymphony.xwork2.ActionSupport;

public class GoodsControlAction extends ActionSupport {
    private GoodsControlService goodsControlService;
    private String name;
    private String info;
    private String price;
    private String message;

    public GoodsControlService getGoodsControlService() {
        return goodsControlService;
    }

    public void setGoodsControlService(GoodsControlService goodsControlService) {
        this.goodsControlService = goodsControlService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * 用于添加商品的操作方法
     *
     * @return 返回字符串"addGoods"
     */
    public String addGoods() {
        return "addGoods";
    }

}
