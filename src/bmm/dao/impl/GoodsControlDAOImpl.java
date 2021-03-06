package bmm.dao.impl;

import bmm.dao.GoodsControlDAO;
import bmm.entity.GoodsbaseEntity;
import bmm.entity.GoodsdescEntity;
import bmm.entity.GoodspicarrayEntity;
import bmm.utils.hibernate_util.HibernateUtil;
import org.hibernate.*;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 关于商品属性的数据库操作接口的实现
 */
@Transactional
public class GoodsControlDAOImpl implements GoodsControlDAO {
    private HibernateTemplate hibernateTemplate;

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
    @Transactional
    public boolean setNameById(int id, String name) {
        boolean flag = false;
        String hql = "from GoodsbaseEntity ge where id=?";
        List<GoodsbaseEntity> list = (List<GoodsbaseEntity>) hibernateTemplate.find(hql, id);
        if (list != null) {
            if (list.size() > 0) {
                for (GoodsbaseEntity goodsbaseEntity : list) {
                    goodsbaseEntity.setName(name);
                    try {
                        hibernateTemplate.update(goodsbaseEntity);
                        flag = true;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
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
        String hql = "select ge.price from GoodsbaseEntity ge where ge.id=?";
        List<?> list = hibernateTemplate.find(hql, id);
        for (Object o : list) {
            if (o != null) {
                return Double.parseDouble(o.toString());
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
    @Transactional
    public boolean setPriceById(int id, double price) {
        boolean flag = false;
        String hql = "from GoodsbaseEntity ge where id=?";
        List<GoodsbaseEntity> list = (List<GoodsbaseEntity>) hibernateTemplate.find(hql, id);
        if (list != null) {
            if (list.size() > 0) {
                for (GoodsbaseEntity goodsbaseEntity : list) {
                    goodsbaseEntity.setPrice(price);
                    try {
                        hibernateTemplate.update(goodsbaseEntity);
                        flag = true;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
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
    @Transactional
    public boolean setManuById(int id, String manu) {
        boolean flag = false;
        String hql = "from GoodsbaseEntity ge where id=?";
        List<GoodsbaseEntity> list = (List<GoodsbaseEntity>) hibernateTemplate.find(hql, id);
        if (list != null) {
            if (list.size() > 0) {
                for (GoodsbaseEntity goodsbaseEntity : list) {
                    goodsbaseEntity.setManufacturer(manu);
                    try {
                        hibernateTemplate.update(goodsbaseEntity);
                        flag = true;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
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
    @Transactional
    public boolean setPicArrById(int id, int picArr) {
        boolean flag = false;
        String hql = "from GoodsbaseEntity ge where id=?";
        List<GoodsbaseEntity> list = (List<GoodsbaseEntity>) hibernateTemplate.find(hql, id);
        if (list != null) {
            if (list.size() > 0) {
                for (GoodsbaseEntity goodsbaseEntity : list) {
                    goodsbaseEntity.setPictureArray(picArr);
                    try {
                        hibernateTemplate.update(goodsbaseEntity);
                        flag = true;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
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
    @Transactional
    public boolean setSaleById(int id, int sale) {
        boolean flag = false;
        String hql = "from GoodsbaseEntity ge where id=?";
        List<GoodsbaseEntity> list = (List<GoodsbaseEntity>) hibernateTemplate.find(hql, id);
        if (list != null) {
            if (list.size() > 0) {
                for (GoodsbaseEntity goodsbaseEntity : list) {
                    goodsbaseEntity.setSale(sale);
                    try {
                        hibernateTemplate.update(goodsbaseEntity);
                        flag = true;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
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
    @Transactional
    public boolean setInfoById(int id, String info) {
        boolean flag = false;
        String hql = "from GoodsbaseEntity ge where id=?";
        List<GoodsbaseEntity> list = (List<GoodsbaseEntity>) hibernateTemplate.find(hql, id);
        if (list != null) {
            if (list.size() > 0) {
                for (GoodsbaseEntity goodsbaseEntity : list) {
                    goodsbaseEntity.setInfo(info);
                    try {
                        hibernateTemplate.update(goodsbaseEntity);
                        flag = true;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
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
    @Transactional
    public boolean setTagById(int id, String tag) {
        boolean flag = false;
        String hql = "from GoodsbaseEntity ge where id=?";
        List<GoodsbaseEntity> list = (List<GoodsbaseEntity>) hibernateTemplate.find(hql, id);
        if (list != null) {
            if (list.size() > 0) {
                for (GoodsbaseEntity goodsbaseEntity : list) {
                    goodsbaseEntity.setTag(tag);
                    try {
                        hibernateTemplate.update(goodsbaseEntity);
                        flag = true;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
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
    @Transactional
    public boolean setCateById(int id, int cate) {
        boolean flag = false;
        String hql = "from GoodsbaseEntity ge where id=?";
        List<GoodsbaseEntity> list = (List<GoodsbaseEntity>) hibernateTemplate.find(hql, id);
        if (list != null) {
            if (list.size() > 0) {
                for (GoodsbaseEntity goodsbaseEntity : list) {
                    goodsbaseEntity.setCate(cate);
                    try {
                        hibernateTemplate.update(goodsbaseEntity);
                        flag = true;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
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
    @Transactional
    public boolean setUnitById(int id, String unit) {
        boolean flag = false;
        String hql = "from GoodsbaseEntity ge where id=?";
        List<GoodsbaseEntity> list = (List<GoodsbaseEntity>) hibernateTemplate.find(hql, id);
        if (list != null) {
            if (list.size() > 0) {
                for (GoodsbaseEntity goodsbaseEntity : list) {
                    goodsbaseEntity.setUnit(unit);
                    try {
                        hibernateTemplate.update(goodsbaseEntity);
                        flag = true;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return flag;
    }

    /**
     * 查询所有的商品的全部信息
     *
     * @return 如果查询成功返回所有商品的全部信息；否则返回 <b>null</b>
     */
    @Override
    public List<GoodsbaseEntity> showAllGoods() {
        String hql = "from GoodsbaseEntity";
        List<GoodsbaseEntity> list = (List<GoodsbaseEntity>) hibernateTemplate.find(hql);
        if (list != null) {
            if (list.size() > 0) {
                return list;
            }
        }
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
    @Transactional
    public boolean setNormsById(int id, String norms) {
        boolean flag = false;
        String hql = "from GoodsbaseEntity ge where ge.id=?";
        List<GoodsbaseEntity> list = (List<GoodsbaseEntity>) hibernateTemplate.find(hql, id);
        if (list != null) {
            if (list.size() > 0) {
                for (GoodsbaseEntity goodsbaseEntity : list) {
                    goodsbaseEntity.setNorms(norms);
                    try {
                        hibernateTemplate.update(goodsbaseEntity);
                        flag = true;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
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
    @Transactional
    public boolean setStartById(int id, int start) {
        boolean flag = false;
        String hql = "from GoodsbaseEntity ge where ge.id=?";
        List<GoodsbaseEntity> list = (List<GoodsbaseEntity>) hibernateTemplate.find(hql, id);
        if (list != null) {
            if (list.size() > 0) {
                for (GoodsbaseEntity goodsbaseEntity : list) {
                    goodsbaseEntity.setStart(start);
                    try {
                        hibernateTemplate.update(goodsbaseEntity);
                        flag = true;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return flag;
    }

    /**
     * 用于新增商品
     *
     * @param name     商品名称
     * @param info     商品属性
     * @param price    单价
     * @param tag      标签（参与的活动）
     * @param cate     分类
     * @param manu     产地
     * @param produ    厂商
     * @param picArray 图片表ID
     * @param norms    规格
     * @param unit     单位
     * @param start    起售数量
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    @Override
    @Transactional
    public boolean addGoods(String name, String info, double price, String tag, int cate, String manu, String produ, int picArray, String norms, String unit, int start) {
        boolean flag = false;
        GoodsbaseEntity goodsbaseEntity = new GoodsbaseEntity();
        goodsbaseEntity.setName(name);
        goodsbaseEntity.setPrice(price);
        goodsbaseEntity.setManufacturer(manu);
        goodsbaseEntity.setProducing(produ);
        goodsbaseEntity.setPictureArray(picArray);
        goodsbaseEntity.setSale(0);
        goodsbaseEntity.setInfo(info);
        goodsbaseEntity.setTag(tag);
        goodsbaseEntity.setCate(cate);
        goodsbaseEntity.setUnit(unit);
        goodsbaseEntity.setNorms(norms);
        goodsbaseEntity.setStart(start);
        try {
            hibernateTemplate.save(goodsbaseEntity);
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    /**
     * 用于修改商品
     *
     * @param id       商品ID号
     * @param name     商品名称
     * @param info     商品属性
     * @param price    单价
     * @param tag      标签（参与的活动）
     * @param cate     分类
     * @param manu     产地
     * @param produ    厂商
     * @param picArray 图片表ID
     * @param norms    规格
     * @param unit     单位
     * @param start    起售数量
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    @Override
    @Transactional
    public boolean editGoods(int id, String name, String info, double price, String tag, int cate, String manu, String produ, int picArray, String norms, String unit, int start) {
        boolean flag = false;
        GoodsbaseEntity goodsbaseEntity = (GoodsbaseEntity) hibernateTemplate.get(GoodsbaseEntity.class, id);
        goodsbaseEntity.setName(name);
        goodsbaseEntity.setPrice(price);
        goodsbaseEntity.setManufacturer(manu);
        goodsbaseEntity.setProducing(produ);
        goodsbaseEntity.setPictureArray(picArray);
        goodsbaseEntity.setInfo(info);
        goodsbaseEntity.setTag(tag);
        goodsbaseEntity.setCate(cate);
        goodsbaseEntity.setUnit(unit);
        goodsbaseEntity.setNorms(norms);
        goodsbaseEntity.setStart(start);
        try {
            hibernateTemplate.update(goodsbaseEntity);
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    /**
     * 查询商品总数
     *
     * @return 返回商品总数
     */
    @Override
    public int getGoodsCount() {
        String hql = "select count(*) from GoodsbaseEntity as ge";
        Long count = (Long) hibernateTemplate.find(hql).listIterator().next();
        return count.intValue();
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
        try {
            hibernateTemplate.save(goodsdescEntity);
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
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
    @Transactional
    public boolean descIntoGoodsPicArrayByGoodsId(int goodsId, String pic1, String pic2,
                                                  String pic3, String pic4, String pic5, String pic6) {
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
        try {
            hibernateTemplate.save(goodspicarrayEntity);
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    /**
     * 修改商品图片信息
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
    @Transactional
    public boolean editIntoGoodsPicArrayByGoodsId(int goodsId, String pic1, String pic2,
                                                  String pic3, String pic4, String pic5, String pic6) {
        boolean flag = false;
        String hql = "from GoodspicarrayEntity gp where gp.goodsId=?";
        List<GoodspicarrayEntity> list = (List<GoodspicarrayEntity>) hibernateTemplate.find(hql, goodsId);
        if (list != null) {
            if (list.size() == 0) {
                descIntoGoodsPicArrayByGoodsId(goodsId, pic1, pic2, pic3, pic4, pic5, pic6);
                return true;
            }
        }
        GoodspicarrayEntity goodspicarrayEntity = list.get(0);
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
        try {
            hibernateTemplate.update(goodspicarrayEntity);
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
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
    @Transactional
    public int guessGoodsId() {
        int lastRow = this.getGoodsCount();
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(GoodsbaseEntity.class);
        criteria.setFirstResult(lastRow - 1);
        criteria.setMaxResults(1);
        List<GoodsbaseEntity> list = criteria.list();
        if (list.size() > 0) {
            for (GoodsbaseEntity goodsbaseEntity : list) {
                return goodsbaseEntity.getId() + 1;
            }
        } else {
            return 1;
        }
        transaction.commit();
        session.close();
        return 0;
    }

    /**
     * 用于推测新商品的图片表ID号
     *
     * @return 返回下一商品的图片表ID号，如果数据库访问失败将返回 <b>0</b>
     */
    @Override
    @Transactional
    public int guessPicId() {
        int lastRow = this.getPicCount();
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(GoodspicarrayEntity.class);
        criteria.setFirstResult(lastRow - 1);
        criteria.setMaxResults(1);
        List<GoodspicarrayEntity> list = criteria.list();
        if (list.size() > 0) {
            for (GoodspicarrayEntity goodspicarrayEntity : list) {
                return goodspicarrayEntity.getId() + 1;
            }
        } else {
            return 1;
        }
        transaction.commit();
        session.close();
        return 0;
    }

    /**
     * 查询商品图片表总数
     *
     * @return 返回商品图片表总数
     */
    @Override
    public int getPicCount() {
        String hql = "select count(*) from GoodspicarrayEntity as ge";
        Long count = (Long) hibernateTemplate.find(hql).listIterator().next();
        return count.intValue();
    }

    /**
     * 通过商品ID获得指定图片的路径
     *
     * @param id  要查询的商品ID
     * @param pic 要获取的图片序号
     * @return 如果操作成功则返回该图片的路径；否则返回 <b>null</b>
     */
    @Override
    public String getPicPathByGoodsId(int id, int pic) {
        String hql;
        List<?> list = null;
        switch (pic) {
            case 1:
                hql = "select pe.pic1 from GoodspicarrayEntity pe where pe.goodsId=?";
                list = hibernateTemplate.find(hql, id);
                break;
            case 2:
                hql = "select pe.pic2 from GoodspicarrayEntity pe where pe.goodsId=?";
                list = hibernateTemplate.find(hql, id);
                break;
            case 3:
                hql = "select pe.pic3 from GoodspicarrayEntity pe where pe.goodsId=?";
                list = hibernateTemplate.find(hql, id);
                break;
            case 4:
                hql = "select pe.pic4 from GoodspicarrayEntity pe where pe.goodsId=?";
                list = hibernateTemplate.find(hql, id);
                break;
            case 5:
                hql = "select pe.pic5 from GoodspicarrayEntity pe where pe.goodsId=?";
                list = hibernateTemplate.find(hql, id);
                break;
            case 6:
                hql = "select pe.pic6 from GoodspicarrayEntity pe where pe.goodsId=?";
                list = hibernateTemplate.find(hql, id);
                break;
        }
        if (list != null) {
            for (Object o : list) {
                if (o != null) {
                    return o.toString();
                }
            }
        }
        return null;
    }

    /**
     * 通过图片表ID号获取指定图的路径
     *
     * @param id  要查询的ID号
     * @param pic 要获取的图片序号
     * @return 如果操作成功则返回该图片的路径；否则返回 <b>null</b>
     */
    @Override
    public String getPicPathById(int id, int pic) {
        String hql;
        List<?> list = null;
        switch (pic) {
            case 1:
                hql = "select pe.pic1 from GoodspicarrayEntity pe where pe.id=?";
                list = hibernateTemplate.find(hql, id);
                break;
            case 2:
                hql = "select pe.pic2 from GoodspicarrayEntity pe where pe.id=?";
                list = hibernateTemplate.find(hql, id);
                break;
            case 3:
                hql = "select pe.pic3 from GoodspicarrayEntity pe where pe.id=?";
                list = hibernateTemplate.find(hql, id);
                break;
            case 4:
                hql = "select pe.pic4 from GoodspicarrayEntity pe where pe.id=?";
                list = hibernateTemplate.find(hql, id);
                break;
            case 5:
                hql = "select pe.pic5 from GoodspicarrayEntity pe where pe.id=?";
                list = hibernateTemplate.find(hql, id);
                break;
            case 6:
                hql = "select pe.pic6 from GoodspicarrayEntity pe where pe.id=?";
                list = hibernateTemplate.find(hql, id);
                break;
        }
        if (list != null) {
            for (Object o : list) {
                if (o != null) {
                    return o.toString();
                }
            }
        }
        return null;
    }

    /**
     * 通过ID号获取指定商品的产地
     *
     * @param id 要查询的ID号
     * @return 如果操作成功则返回该商品的产地；否则返回 <b>null</b>
     */
    @Override
    public String getProduById(int id) {
        String hql = "select ge.producing from GoodsbaseEntity ge where ge.id=?";
        List<?> list = hibernateTemplate.find(hql, id);
        for (Object o : list) {
            if (o != null) {
                return o.toString();
            }
        }
        return null;
    }

    /**
     * 通过指定的ID号设置该商品的产地
     *
     * @param id    要设置的ID号
     * @param produ 要设置的产地
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    @Override
    @Transactional
    public boolean setProduById(int id, String produ) {
        boolean flag = false;
        String hql = "from GoodsbaseEntity ge where id=?";
        List<GoodsbaseEntity> list = (List<GoodsbaseEntity>) hibernateTemplate.find(hql, id);
        if (list != null) {
            if (list.size() > 0) {
                for (GoodsbaseEntity goodsbaseEntity : list) {
                    goodsbaseEntity.setProducing(produ);
                    try {
                        hibernateTemplate.update(goodsbaseEntity);
                        flag = true;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return flag;
    }

    /**
     * 根据ID号删除指定的商品
     *
     * @param id 要删除的商品的ID
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    @Override
    @Transactional
    public boolean deleteGoodsById(int id) {
        boolean flag = false;
        GoodsbaseEntity goodsbaseEntity = (GoodsbaseEntity) hibernateTemplate.get(GoodsbaseEntity.class, id);
        if (goodsbaseEntity == null) {
            return false;
        }
        try {
            hibernateTemplate.delete(goodsbaseEntity);
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    /**
     * 随机取得一条商品记录
     *
     * @return 如果查询成功则返回该商品的 <b>GoodsbaseEntity</b> 对象；否则返回 <b>null</b>
     */
    @Override
    @Transactional
    public GoodsbaseEntity getRandomOne() {
        String sql = "SELECT * FROM goodsbase WHERE goodsbase.id >= ((SELECT MAX(goodsbase.id) FROM goodsbase)-(SELECT MIN(goodsbase.id) FROM goodsbase)) * RAND() + (SELECT MIN(goodsbase.id) FROM goodsbase) LIMIT 1";
        Session session = HibernateUtil.getSession();
        SQLQuery sqlQuery = session.createSQLQuery(sql).addEntity(GoodsbaseEntity.class);
        List<GoodsbaseEntity> list = sqlQuery.list();
        for (GoodsbaseEntity goodsbaseEntity : list) {
            if (goodsbaseEntity != null) {
                return goodsbaseEntity;
            }
        }
        session.flush();
        session.close();
        return null;
    }

    /**
     * 查询指定数量的最新商品
     *
     * @param i 指定要查询的数量
     * @return 如果查询成功则返回 <b>List&lt;GoodsbaseEntity&gt;</b>；否则返回 <b>null</b>
     */
    @Override
    @Transactional
    public List<GoodsbaseEntity> getXNewest(int i) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from GoodsbaseEntity ge order by ge.id desc");
        query.setFirstResult(0);
        query.setMaxResults(i);
        List<GoodsbaseEntity> list = query.list();
        transaction.commit();
        session.close();
        if (list.size() > 0) {
            return list;
        }
        return null;
    }

    /**
     * 查询指定数量的热销商品
     *
     * @param i 指定要查询的数量
     * @return 如果查询成功则返回 <b>List&lt;GoodsbaseEntity&gt;</b>；否则返回 <b>null</b>
     */
    @Override
    @Transactional
    public List<GoodsbaseEntity> getBestSealXGoods(int i) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from GoodsbaseEntity ge order by ge.sale desc");
        query.setFirstResult(0);
        query.setMaxResults(i);
        List<GoodsbaseEntity> list = query.list();
        transaction.commit();
        session.close();
        if (list.size() > 0) {
            return list;
        }
        return null;
    }

    /**
     * 根据指定的页数进行分类查询指定类别的商品。一次只返回12个商品。
     *
     * @param page 要查询的页数
     * @param cate 要查询的商品的分类
     * @return 如果查询成功则返回 <b>List&lt;GoodsbaseEntity&gt;</b>；否则返回 <b>null</b>
     */
    @Override
    @Transactional
    public List<GoodsbaseEntity> getGoodsDependByCateByPage(int page, int cate) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(GoodsbaseEntity.class);
        Criterion criterion = Restrictions.eq("cate", cate);
        criteria.add(criterion);
        criteria.setFirstResult((page - 1) * 12);
        criteria.setMaxResults(5);
        List<GoodsbaseEntity> list = criteria.list();
        if (list.size() > 0) {
            return list;
        }
        transaction.commit();
        session.close();
        return null;
    }
}
