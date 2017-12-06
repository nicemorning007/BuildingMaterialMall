package bmm.service.impl;

import bmm.dao.GoodsControlDAO;
import bmm.service.GoodsControlService;

public class GoodsControlServiceImpl implements GoodsControlService{
    private GoodsControlDAO goodsControlDAO;

    public GoodsControlDAO getGoodsControlDAO() {
        return goodsControlDAO;
    }

    public void setGoodsControlDAO(GoodsControlDAO goodsControlDAO) {
        this.goodsControlDAO = goodsControlDAO;
    }
}
