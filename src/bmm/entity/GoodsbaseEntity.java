package bmm.entity;

import javax.persistence.*;

@Entity
@Table(name = "goodsbase", schema = "bmm", catalog = "")
public class GoodsbaseEntity {
    private int id;
    private String name;
    private double price;
    private String producing;
    private String manufacturer;
    private Integer pictureArray;
    private int sale;
    private String info;
    private String tag;
    private int cate;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "price")
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Basic
    @Column(name = "pictureArray")
    public Integer getPictureArray() {
        return pictureArray;
    }

    public void setPictureArray(Integer pictureArray) {
        this.pictureArray = pictureArray;
    }

    @Basic
    @Column(name = "sale")
    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    @Basic
    @Column(name = "info")
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Basic
    @Column(name = "tag")
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Basic
    @Column(name = "cate")
    public int getCate() {
        return cate;
    }

    public void setCate(int cate) {
        this.cate = cate;
    }

    @Basic
    @Column(name = "producing")
    public String getProducing() {
        return producing;
    }

    @Basic
    @Column(name = "manufacturer")
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setProducing(String producing) {
        this.producing = producing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GoodsbaseEntity that = (GoodsbaseEntity) o;

        if (id != that.id) return false;
        if (Double.compare(that.price, price) != 0) return false;
        if (sale != that.sale) return false;
        if (cate != that.cate) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (pictureArray != null ? !pictureArray.equals(that.pictureArray) : that.pictureArray != null) return false;
        if (info != null ? !info.equals(that.info) : that.info != null) return false;
        if (tag != null ? !tag.equals(that.tag) : that.tag != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (pictureArray != null ? pictureArray.hashCode() : 0);
        result = 31 * result + sale;
        result = 31 * result + (info != null ? info.hashCode() : 0);
        result = 31 * result + (tag != null ? tag.hashCode() : 0);
        result = 31 * result + cate;
        return result;
    }
}
