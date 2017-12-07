package bmm.dao.impl;

import bmm.dao.GoodsControlDAO;
import bmm.entity.GoodsbaseEntity;
import bmm.entity.GoodsdescEntity;
import bmm.entity.GoodspicarrayEntity;
import bmm.utils.hibernate_util.HibernateUtil;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.*;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate4.HibernateTemplate;

import java.util.List;

/**
 * 关于商品属性的数据库操作接口的实现
 */
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
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        String hql = "update GoodsbaseEntity ge set ge.name=:name where id=:id";
        Query query = session.createQuery(hql);
        query.setParameter("name", name);
        query.setParameter("id", id);
        int row = query.executeUpdate();
        if (row > 0) {
            flag = true;
        }
        transaction.commit();
        session.close();
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
        String hql = "select ge.price from GoodsbaseEntity ge where ge.id=?";
        List<?> list = hibernateTemplate.find(hql, id);
        for (Object o : list) {
            if (o != null) {
                return Integer.parseInt(o.toString());
            }
        }
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
        boolean flag = false;
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        String hql = "update GoodsbaseEntity ge set ge.price=:price where id=:id";
        Query query = session.createQuery(hql);
        query.setParameter("price", price);
        query.setParameter("id", id);
        int row = query.executeUpdate();
        if (row > 0) {
            flag = true;
        }
        transaction.commit();
        session.close();
        return flag;
    }

    /**
     * 根据商品ID号获取对应的商品的产地
     *
     * @param id 要查询的商品ID号
     * @return 如果查询到则返回该商品产地，否则返回 <b>null</b>
     */
    @Override
    public String getManuById(int id) {
        String hql = "select ge.manufacturer from GoodsbaseEntity ge where ge.id=?";
        List<?> list = hibernateTemplate.find(hql, id);
        for (Object o : list) {
            if (o != null) {
                return o.toString();
            }
        }
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
        boolean flag = false;
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        String hql = "update GoodsbaseEntity ge set ge.manufacturer=:manu where id=:id";
        Query query = session.createQuery(hql);
        query.setParameter("manu", manu);
        query.setParameter("id", id);
        int row = query.executeUpdate();
        if (row > 0) {
            flag = true;
        }
        transaction.commit();
        session.close();
        return flag;
    }

    /**
     * 根据商品ID号获取对应的商品的图片数组表对应的ID
     *
     * @param id 要查询的商品ID号
     * @return 如果查询到则返回该商品的图片数组表对应的ID，否则返回 <b>0</b>
     */
    @Override
    public int getPicArrById(int id) {
        String hql = "select ge.pictureArray from GoodsbaseEntity ge where ge.id=?";
        List<?> list = hibernateTemplate.find(hql, id);
        for (Object o : list) {
            if (o != null) {
                return Integer.parseInt(o.toString());
            }
        }
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
        boolean flag = false;
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        String hql = "update GoodsbaseEntity ge set ge.pictureArray=:picArr where id=:id";
        Query query = session.createQuery(hql);
        query.setParameter("picArr", picArr);
        query.setParameter("id", id);
        int row = query.executeUpdate();
        if (row > 0) {
            flag = true;
        }
        transaction.commit();
        session.close();
        return flag;
    }

    /**
     * 根据商品ID号获取对应的商品的销量
     *
     * @param id 要查询的商品ID号
     * @return 如果查询到则返回该商品销量，否则返回 <b>0</b>
     */
    @Override
    public int getSaleById(int id) {
        String hql = "select ge.sale from GoodsbaseEntity ge where ge.id=?";
        List<?> list = hibernateTemplate.find(hql, id);
        for (Object o : list) {
            if (o != null) {
                return Integer.parseInt(o.toString());
            }
        }
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
        boolean flag = false;
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        String hql = "update GoodsbaseEntity ge set ge.sale=:sale where id=:id";
        Query query = session.createQuery(hql);
        query.setParameter("sale", sale);
        query.setParameter("id", id);
        int row = query.executeUpdate();
        if (row > 0) {
            flag = true;
        }
        transaction.commit();
        session.close();
        return flag;
    }

    /**
     * 根据商品ID号获取对应的商品的信息
     *
     * @param id 要查询的商品ID号
     * @return 如果查询到则返回该商品信息，否则返回 <b>null</b>
     */
    @Override
    public String getInfoById(int id) {
        String hql = "select ge.info from GoodsbaseEntity ge where ge.id=?";
        List<?> list = hibernateTemplate.find(hql, id);
        for (Object o : list) {
            if (o != null) {
                return o.toString();
            }
        }
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
        boolean flag = false;
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        String hql = "update GoodsbaseEntity ge set ge.info=:info where id=:id";
        Query query = session.createQuery(hql);
        query.setParameter("info", info);
        query.setParameter("id", id);
        int row = query.executeUpdate();
        if (row > 0) {
            flag = true;
        }
        transaction.commit();
        session.close();
        return flag;
    }

    /**
     * 根据商品ID号获取对应的商品的标签
     *
     * @param id 要查询的商品ID号
     * @return 如果查询到则返回该商品标签，否则返回 <b>null</b>
     */
    @Override
    public String getTagById(int id) {
        String hql = "select ge.tag from GoodsbaseEntity ge where ge.id=?";
        List<?> list = hibernateTemplate.find(hql, id);
        for (Object o : list) {
            if (o != null) {
                return o.toString();
            }
        }
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
        boolean flag = false;
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        String hql = "update GoodsbaseEntity ge set ge.tag=:tag where id=:id";
        Query query = session.createQuery(hql);
        query.setParameter("tag", tag);
        query.setParameter("id", id);
        int row = query.executeUpdate();
        if (row > 0) {
            flag = true;
        }
        transaction.commit();
        session.close();
        return flag;
    }

    /**
     * 根据商品ID号获取对应的商品的分类表ID号
     *
     * @param id 要查询的商品ID号
     * @return 如果查询到则返回该商品的分类表ID号，否则返回 <b>0</b>
     */
    @Override
    public int getCateById(int id) {
        String hql = "select ge.cate from GoodsbaseEntity ge where ge.id=?";
        List<?> list = hibernateTemplate.find(hql, id);
        for (Object o : list) {
            if (o != null) {
                return Integer.parseInt(o.toString());
            }
        }
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
        boolean flag = false;
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        String hql = "update GoodsbaseEntity ge set ge.cate=:cate where id=:id";
        Query query = session.createQuery(hql);
        query.setParameter("cate", cate);
        query.setParameter("id", id);
        int row = query.executeUpdate();
        if (row > 0) {
            flag = true;
        }
        transaction.commit();
        session.close();
        return flag;
    }

    /**
     * 根据商品ID号获取对应的商品的销售单位
     *
     * @param id 要查询的商品ID号
     * @return 如果查询到则返回该商品销售单位，否则返回 <b>null</b>
     */
    @Override
    public String getUnitById(int id) {
        String hql = "select ge.unit from GoodsbaseEntity ge where ge.id=?";
        List<?> list = hibernateTemplate.find(hql, id);
        for (Object o : list) {
            if (o != null) {
                return o.toString();
            }
        }
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
        boolean flag = false;
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        String hql = "update GoodsbaseEntity ge set ge.unit=:unit where id=:id";
        Query query = session.createQuery(hql);
        query.setParameter("unit", unit);
        query.setParameter("id", id);
        int row = query.executeUpdate();
        if (row > 0) {
            flag = true;
        }
        transaction.commit();
        session.close();
        return flag;
    }

    /**
     * 查询所有的商品的全部信息
     *
     * @return 如果查询成功返回所有商品的全部信息；否则返回 <b>null</b>
     */
    @Override
    public List<GoodsbaseEntity> showAllGoods() {
        List<GoodsbaseEntity> list = (List<GoodsbaseEntity>) hibernateTemplate.find("from GoodsbaseEntity ");
        return list;
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

    /**
     * 根据商品ID号获取对应的商品的规格
     *
     * @param id 要查询的商品ID号
     * @return 如果查询到则返回该商品规格，否则返回 <b>null</b>
     */
    @Override
    public String getNormsById(int id) {
        String hql = "select ge.norms from GoodsbaseEntity ge where ge.id=?";
        List<?> list = hibernateTemplate.find(hql, id);
        for (Object o : list) {
            if (o != null) {
                return o.toString();
            }
        }
        return null;
    }

    /**
     * 根据商品ID号设置相应的销售规格
     *
     * @param id    要设置的ID号
     * @param norms 要设置的销售规格
     * @return 如果操作成功返回 <b>true</b>；否则返回<b>false</b>
     */
    @Override
    public boolean setNormsById(int id, String norms) {
        boolean flag = false;
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        String hql = "update GoodsbaseEntity ge set ge.norms=:norms where id=:id";
        Query query = session.createQuery(hql);
        query.setParameter("norms", norms);
        query.setParameter("id", id);
        int row = query.executeUpdate();
        if (row > 0) {
            flag = true;
        }
        transaction.commit();
        session.close();
        return flag;
    }

    /**
     * 根据商品ID号获取对应的商品的起售数量
     *
     * @param id 要查询的商品ID号
     * @return 如果查询到则返回该商品起售数量，否则返回 <b>0</b>
     */
    @Override
    public int getStartById(int id) {
        String hql = "select ge.start from GoodsbaseEntity ge where ge.id=?";
        List<?> list = hibernateTemplate.find(hql, id);
        for (Object o : list) {
            if (o != null) {
                return Integer.parseInt(o.toString());
            }
        }
        return 0;
    }

    /**
     * 根据商品ID号设置相应的销售起售数量
     *
     * @param id    要设置的ID号
     * @param start 要设置的销售起售数量
     * @return 如果操作成功返回 <b>true</b>；否则返回<b>false</b>
     */
    @Override
    public boolean setStartById(int id, int start) {
        boolean flag = false;
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        String hql = "update GoodsbaseEntity ge set ge.start=:start where id=:id";
        Query query = session.createQuery(hql);
        query.setParameter("start", start);
        query.setParameter("id", id);
        int row = query.executeUpdate();
        if (row > 0) {
            flag = true;
        }
        transaction.commit();
        session.close();
        return flag;
    }

    /**
     * 用于新增商品
     *
     * @param name  商品名称
     * @param info  商品属性
     * @param price 单价
     * @param tag   标签（参与的活动）
     * @param manu  产地
     * @param produ 厂商
     * @param norms 规格
     * @param unit  单位
     * @param start 起售数量
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    @Override
    public boolean addGoods(String name, String info, double price, String tag, String manu, String produ, String norms, String unit, int start) {
        boolean flag = false;
        GoodsbaseEntity goodsbaseEntity = new GoodsbaseEntity();
        goodsbaseEntity.setName(name);
        goodsbaseEntity.setInfo(info);
        goodsbaseEntity.setPrice(price);
        goodsbaseEntity.setTag(tag);
        goodsbaseEntity.setManufacturer(manu);
        goodsbaseEntity.setProducing(produ);
        goodsbaseEntity.setNorms(norms);
        goodsbaseEntity.setUnit(unit);
        goodsbaseEntity.setStart(start);
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.save(goodsbaseEntity);
            transaction.commit();
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        session.close();
        return flag;
    }

    /**
     * 查询商品总数
     *
     * @return 返回商品总数
     */
    @Override
    public int getGoodsCount() {
        long count = 0;
        count = (long) HibernateUtil.getSession()
                .createQuery("select count(*) from GoodsbaseEntity ")
                .uniqueResult();
        return (int) count;
    }

    /**
     * 添加商品与分类的关联信息到关联表中
     *
     * @param goodsId 要添加的商品ID
     * @param cate    要添加的分类ID
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    @Override
    public boolean descIntoGoodsDesc(int goodsId, int cate) {
        boolean flag = false;
        GoodsdescEntity goodsdescEntity = new GoodsdescEntity();
        goodsdescEntity.setGoodsId(goodsId);
        goodsdescEntity.setCate(cate);
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.save(goodsdescEntity);
            transaction.commit();
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        session.close();
        return flag;
    }

    /**
     * 根据关联表ID号从商品与分类关联表中获取到商品ID
     *
     * @param id 要查询的关联表ID号
     * @return 如果操作成功则返回该商品的 <b>ID</b>；否则返回 <b>0</b>
     */
    @Override
    public int getGoodsIdFromGoodsDescByCateId(int id) {
        String hql = "select gd.goodsId from GoodsdescEntity gd where gd.cate=?";
        List<?> list = hibernateTemplate.find(hql, id);
        for (Object o : list) {
            if (o != null) {
                return Integer.parseInt(o.toString());
            }
        }
        return 0;
    }

    /**
     * 根据商品ID号从商品与分类关联表中获取到分类ID
     *
     * @param id 要查询的商品ID号
     * @return 如果操作成功则返回该商品的分类 <b>ID</b>；否则返回 <b>0</b>
     */
    @Override
    public int getCateIdFromGoodsDescByGoodsId(int id) {
        String hql = "select gd.cate from GoodsdescEntity gd where gd.goodsId=?";
        List<?> list = hibernateTemplate.find(hql, id);
        for (Object o : list) {
            if (o != null) {
                return Integer.parseInt(o.toString());
            }
        }
        return 0;
    }

    /**
     * 添加商品图片信息到商品图片表中
     *
     * @param goodsId 对应的商品ID号
     * @param pic1    图片1的地址
     * @param pic2    图片2的地址
     * @param pic3    图片3的地址
     * @param pic4    图片4的地址
     * @param pic5    图片5的地址
     * @param pic6    图片6的地址
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    @Override
    public boolean descIntoGoodsPicArrayByGoodsId(int goodsId, String pic1, String pic2, String pic3, String pic4, String pic5, String pic6) {
        boolean flag = false;
        GoodspicarrayEntity goodspicarrayEntity = new GoodspicarrayEntity();
        goodspicarrayEntity.setGoodsId(goodsId);
        if (pic1 != null) {
            goodspicarrayEntity.setPic1(pic1);
        }
        if (pic2 != null) {
            goodspicarrayEntity.setPic2(pic2);
        }
        if (pic3 != null) {
            goodspicarrayEntity.setPic3(pic3);
        }
        if (pic4 != null) {
            goodspicarrayEntity.setPic4(pic4);
        }
        if (pic5 != null) {
            goodspicarrayEntity.setPic5(pic5);

        }
        if (pic6 != null) {
            goodspicarrayEntity.setPic6(pic6);
        }
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.save(goodspicarrayEntity);
            transaction.commit();
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        session.close();
        return flag;
    }

    /**
     * 根据商品ID号从商品图片信息表中获取指定商品的全部图片信息
     *
     * @param goodsId 要查询的商品ID号
     * @return 如果操作成功则返回该商品的 <b>GoodspicarrayEntity</b>对象；否则返回 <b>null</b>
     */
    @Override
    public GoodspicarrayEntity getOneAllInfoPicByGoodsId(int goodsId) {
        String hql = "select gp from GoodspicarrayEntity gp where gp.goodsId=?";
        List<?> list = hibernateTemplate.find(hql, goodsId);
        for (Object o : list) {
            if (o != null) {
                return (GoodspicarrayEntity) o;
            }
        }
        return null;
    }

    /**
     * 根据ID号从商品图片信息表中获取指定行的全部图片信息
     *
     * @param id 要查询的图片表ID
     * @return 如果操作成功则返回该ID对应的商品的 <b>GoodspicarrayEntity</b>对象；否则返回 <b>null</b>
     */
    @Override
    public GoodspicarrayEntity getOneAllInfoPicById(int id) {
        GoodspicarrayEntity goodspicarrayEntity = null;
        goodspicarrayEntity = hibernateTemplate.get(GoodspicarrayEntity.class, id);
        return goodspicarrayEntity;
    }

    /**
     * 获取商品图片表的全部信息
     *
     * @return 如果操作成功则返回 <b>List&lt;GoodspicarrayEntity&gt;</b>对象；否则返回 <b>null</b>
     */
    @Override
    public List<GoodspicarrayEntity> getAllInfoFromGoodsPicArray() {
        String hql = "from GoodspicarrayEntity ";
        List<GoodspicarrayEntity> list = (List<GoodspicarrayEntity>) hibernateTemplate.find(hql);
        if (list.size() > 0) {
            return list;
        }
        return null;
    }

    /**
     * 用于推测新商品的ID号
     *
     * @return 返回下一商品的ID号，如果数据库访问失败将返回 <b>0</b>
     */
    @Override
    public int guessGoodsId() {
        int lastRow = this.getGoodsCount();
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(GoodsbaseEntity.class);
        criteria.setFirstResult(lastRow - 1);
        criteria.setMaxResults(1);
        List<GoodsbaseEntity> list = criteria.list();
        for (GoodsbaseEntity goodsbaseEntity : list) {
            return goodsbaseEntity.getId() + 1;
        }
        transaction.commit();
        session.close();
        return 0;
    }
}
