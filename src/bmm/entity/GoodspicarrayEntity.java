package bmm.entity;

import javax.persistence.*;

@Entity
@Table(name = "goodspicarray", schema = "bmm", catalog = "")
public class GoodspicarrayEntity {
    private int id;
    private Integer goodsId;
    private String pic1;
    private String pic2;
    private String pic3;
    private String pic4;
    private String pic5;
    private String pic6;

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
    @Column(name = "pic1")
    public String getPic1() {
        return pic1;
    }

    public void setPic1(String pic1) {
        this.pic1 = pic1;
    }

    @Basic
    @Column(name = "pic2")
    public String getPic2() {
        return pic2;
    }

    public void setPic2(String pic2) {
        this.pic2 = pic2;
    }

    @Basic
    @Column(name = "pic3")
    public String getPic3() {
        return pic3;
    }

    public void setPic3(String pic3) {
        this.pic3 = pic3;
    }

    @Basic
    @Column(name = "pic4")
    public String getPic4() {
        return pic4;
    }

    public void setPic4(String pic4) {
        this.pic4 = pic4;
    }

    @Basic
    @Column(name = "pic5")
    public String getPic5() {
        return pic5;
    }

    public void setPic5(String pic5) {
        this.pic5 = pic5;
    }

    @Basic
    @Column(name = "pic6")
    public String getPic6() {
        return pic6;
    }

    public void setPic6(String pic6) {
        this.pic6 = pic6;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GoodspicarrayEntity that = (GoodspicarrayEntity) o;

        if (id != that.id) return false;
        if (goodsId != null ? !goodsId.equals(that.goodsId) : that.goodsId != null) return false;
        if (pic1 != null ? !pic1.equals(that.pic1) : that.pic1 != null) return false;
        if (pic2 != null ? !pic2.equals(that.pic2) : that.pic2 != null) return false;
        if (pic3 != null ? !pic3.equals(that.pic3) : that.pic3 != null) return false;
        if (pic4 != null ? !pic4.equals(that.pic4) : that.pic4 != null) return false;
        if (pic5 != null ? !pic5.equals(that.pic5) : that.pic5 != null) return false;
        if (pic6 != null ? !pic6.equals(that.pic6) : that.pic6 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (goodsId != null ? goodsId.hashCode() : 0);
        result = 31 * result + (pic1 != null ? pic1.hashCode() : 0);
        result = 31 * result + (pic2 != null ? pic2.hashCode() : 0);
        result = 31 * result + (pic3 != null ? pic3.hashCode() : 0);
        result = 31 * result + (pic4 != null ? pic4.hashCode() : 0);
        result = 31 * result + (pic5 != null ? pic5.hashCode() : 0);
        result = 31 * result + (pic6 != null ? pic6.hashCode() : 0);
        return result;
    }
}
