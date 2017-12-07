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
    private String unit;
    private String norms;
    private int start;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "price", nullable = true, precision = 2)
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Basic
    @Column(name = "pictureArray", nullable = true)
    public Integer getPictureArray() {
        return pictureArray;
    }

    public void setPictureArray(Integer pictureArray) {
        this.pictureArray = pictureArray;
    }

    @Basic
    @Column(name = "sale", nullable = true)
    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    @Basic
    @Column(name = "info", nullable = true, length = 1000)
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Basic
    @Column(name = "tag", nullable = true, length = 200)
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Basic
    @Column(name = "cate", nullable = true)
    public int getCate() {
        return cate;
    }

    public void setCate(int cate) {
        this.cate = cate;
    }

    @Basic
    @Column(name = "producing", nullable = true, length = 100)
    public String getProducing() {
        return producing;
    }

    public void setProducing(String producing) {
        this.producing = producing;
    }

    @Basic
    @Column(name = "manufacturer", nullable = true, length = 50)
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Basic
    @Column(name = "unit", nullable = true, length = 10)
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Basic
    @Column(name = "norms")
    public String getNorms() {
        return norms;
    }

    public void setNorms(String norms) {
        this.norms = norms;
    }

    @Basic
    @Column(name = "start")
    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
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
