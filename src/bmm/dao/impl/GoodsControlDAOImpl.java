package bmm.dao.impl;

import bmm.dao.GoodsControlDAO;
import bmm.entity.GoodsbaseEntity;
import org.hibernate.HibernateException;
import org.springframework.orm.hibernate4.HibernateTemplate;

import java.util.List;

public class GoodsControlDAOImpl implements GoodsControlDAO {
    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    /**
     * 根据商品名称获取对应的ID号
     *
     * @param name 要查询的商品名称
     * @return 如果查询到商品则返回该商品的ID号，否则返回 <b>0</b>
     */
    @Override
    public int getIdByName(String name) {
        String hql = "select ge.id from GoodsbaseEntity ge where ge.name=?";
        List<?> list = hibernateTemplate.find(hql, name);
        if (list != null) {
            for (Object o : list) {
                if (o != null) {
                    return Integer.parseInt(o.toString());
                }
            }
        }
        return 0;
    }

    /**
     * 根据商品ID号获取对应的商品的名称
     *
     * @param id 要查询的商品ID号
     * @return 如果查询到则返回该商品名称，否则返回 <b>null</b>
     */
    @Override
    public String getNameById(int id) {
        String hql = "select ge.name from GoodsbaseEntity ge where ge.id=?";
        List<?> list = hibernateTemplate.find(hql, id);
        for (Object o : list) {
            if (o != null) {
                return o.toString();
            }
        }
        return null;
    }

    /**
     * 根据商品ID号设置相应商品的名称
     *
     * @param id   要设置的ID号
     * @param name 要设置的名称
     * @return 如果操作成功返回 <b>true</b>；否则返回<b>false</b>
     */
    @Override
    public boolean setNameById(int id, String name) {
        boolean flag = false;
        GoodsbaseEntity goodsbaseEntity = hibernateTemplate.get(GoodsbaseEntity.class, id);
        goodsbaseEntity.setName(name);
        try {
            hibernateTemplate.saveOrUpdate(goodsbaseEntity);
//            hibernateTemplate.flush();
            flag = true;
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return flag;
    }

    /**
     * 根据商品ID号获取对应的商品的价格
     *
     * @param id 要查询的商品ID号
     * @return 如果查询到则返回该商品价格，否则返回 <b>0</b>
     */
    @Override
    public double getPriceById(int id) {
        return 0;
    }

    /**
     * 根据商品ID号设置相应的价格
     *
     * @param id    要设置的ID号
     * @param price 要设置的价格
     * @return 如果操作成功返回 <b>true</b>；否则返回<b>false</b>
     */
    @Override
    public boolean setPriceById(int id, double price) {
        return false;
    }

    /**
     * 根据商品ID号获取对应的商品的产地
     *
     * @param id 要查询的商品ID号
     * @return 如果查询到则返回该商品产地，否则返回 <b>null</b>
     */
    @Override
    public String getManuById(int id) {
        return null;
    }

    /**
     * 根据商品ID号设置相应的产地
     *
     * @param id   要设置的ID号
     * @param manu 要设置的产地
     * @return 如果操作成功返回 <b>true</b>；否则返回<b>false</b>
     */
    @Override
    public boolean setManuById(int id, String manu) {
        return false;
    }

    /**
     * 根据商品ID号获取对应的商品的图片数组表对应的ID
     *
     * @param id 要查询的商品ID号
     * @return 如果查询到则返回该商品的图片数组表对应的ID，否则返回 <b>0</b>
     */
    @Override
    public int getPicArrById(int id) {
        return 0;
    }

    /**
     * 根据商品ID号设置相应的图片数组表ID
     *
     * @param id     要设置的ID号
     * @param picArr 要设置的图片数组表ID
     * @return 如果操作成功返回 <b>true</b>；否则返回<b>false</b>
     */
    @Override
    public boolean setPicArrById(int id, int picArr) {
        return false;
    }

    /**
     * 根据商品ID号获取对应的商品的销量
     *
     * @param id 要查询的商品ID号
     * @return 如果查询到则返回该商品销量，否则返回 <b>0</b>
     */
    @Override
    public int getSaleById(int id) {
        return 0;
    }

    /**
     * 根据商品ID号设置相应的销量
     *
     * @param id   要设置的ID号
     * @param sale 要设置的销量
     * @return 如果操作成功返回 <b>true</b>；否则返回<b>false</b>
     */
    @Override
    public boolean setSaleById(int id, int sale) {
        return false;
    }

    /**
     * 根据商品ID号获取对应的商品的信息
     *
     * @param id 要查询的商品ID号
     * @return 如果查询到则返回该商品信息，否则返回 <b>null</b>
     */
    @Override
    public String getInfoById(int id) {
        return null;
    }

    /**
     * 根据商品ID号设置相应的信息
     *
     * @param id   要设置的ID号
     * @param info 要设置的信息
     * @return 如果操作成功返回 <b>true</b>；否则返回<b>false</b>
     */
    @Override
    public boolean setInfoById(int id, String info) {
        return false;
    }

    /**
     * 根据商品ID号获取对应的商品的标签
     *
     * @param id 要查询的商品ID号
     * @return 如果查询到则返回该商品标签，否则返回 <b>null</b>
     */
    @Override
    public String getTagById(int id) {
        return null;
    }

    /**
     * 根据商品ID号设置相应的标签
     *
     * @param id  要设置的ID号
     * @param tag 要设置的标签
     * @return 如果操作成功返回 <b>true</b>；否则返回<b>false</b>
     */
    @Override
    public boolean setTagById(int id, String tag) {
        return false;
    }

    /**
     * 根据商品ID号获取对应的商品的分类表ID号
     *
     * @param id 要查询的商品ID号
     * @return 如果查询到则返回该商品的分类表ID号，否则返回 <b>0</b>
     */
    @Override
    public int getCateById(int id) {
        return 0;
    }

    /**
     * 根据商品ID号设置相应的分类表ID号
     *
     * @param id   要设置的ID号
     * @param cate 要设置的分类表ID号
     * @return 如果操作成功返回 <b>true</b>；否则返回<b>false</b>
     */
    @Override
    public boolean setCateById(int id, int cate) {
        return false;
    }

    /**
     * 根据商品ID号获取对应的商品的销售单位
     *
     * @param id 要查询的商品ID号
     * @return 如果查询到则返回该商品销售单位，否则返回 <b>null</b>
     */
    @Override
    public String getUnitById(int id) {
        return null;
    }

    /**
     * 根据商品ID号设置相应的销售单位
     *
     * @param id   要设置的ID号
     * @param unit 要设置的销售单位
     * @return 如果操作成功返回 <b>true</b>；否则返回<b>false</b>
     */
    @Override
    public boolean setUnitById(int id, String unit) {
        return false;
    }

    /**
     * 查询所有的商品的全部信息
     *
     * @return 如果查询成功返回所有商品的全部信息；否则返回 <b>null</b>
     */
    @Override
    public List<GoodsbaseEntity> showAllGoods() {
        return null;
    }

    /**
     * 查询指定ID的商品的所有信息
     *
     * @param id 要查询的商品ID号
     * @return 如果查询成功返回该ID号对应的商品的所有信息，否则返回 <b>null</b>
     */
    @Override
    public GoodsbaseEntity getOneAllInfo(int id) {
        GoodsbaseEntity goodsbaseEntity = null;
        goodsbaseEntity = (GoodsbaseEntity) hibernateTemplate.get(GoodsbaseEntity.class, 1);
        return goodsbaseEntity;
    }
}
