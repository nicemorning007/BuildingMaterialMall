package bmm.entity;

import javax.persistence.*;

@Entity
@Table(name = "goodsdesc", schema = "bmm", catalog = "")
public class GoodsdescEntity {
    private int id;
    private Integer goodsId;
    private Integer cate;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "goodsId")
    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    @Basic
    @Column(name = "cate")
    public Integer getCate() {
        return cate;
    }

    public void setCate(Integer cate) {
        this.cate = cate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GoodsdescEntity that = (GoodsdescEntity) o;

        if (id != that.id) return false;
        if (goodsId != null ? !goodsId.equals(that.goodsId) : that.goodsId != null) return false;
        if (cate != null ? !cate.equals(that.cate) : that.cate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (goodsId != null ? goodsId.hashCode() : 0);
        result = 31 * result + (cate != null ? cate.hashCode() : 0);
        return result;
    }
}
