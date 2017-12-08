package bmm.struts.action.goods;

import bmm.dao.CategorizationControlDAO;
import bmm.dao.impl.CategorizationControlDAOImpl;
import bmm.entity.CategorizationEntity;
import bmm.service.GoodsControlService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.List;

public class GoodsControlAction extends ActionSupport {
    private GoodsControlService goodsControlService;
    private String name;
    private String info;
    private String price;
    private String[] tags;
    private StringBuffer tag;
    private String selectCate;
    private String manu;
    private int cate;
    private String produ;
    private String norms;
    private String unit;
    private String start;
    private String message;
    private File pic6;
    private String pic6FileName;
    private String pic6ContentType;
    private File pic1;
    private String pic1FileName;
    private String pic1ContentType;
    private File pic2;
    private String pic2FileName;
    private String pic2ContentType;
    private File pic3;
    private String pic3FileName;
    private String pic3ontentType;
    private File pic4;
    private String pic4FileName;
    private String pic4ContentType;
    private File pic5;
    private String pic5FileName;
    private String pic5ContentType;
    private List<CategorizationEntity> list;

    public List<CategorizationEntity> getList() {
        return list;
    }

    public void setList(List<CategorizationEntity> list) {
        CategorizationControlDAO categorizationControlDAO = new CategorizationControlDAOImpl();
        this.list = categorizationControlDAO.showAllCate();
    }

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

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public String getManu() {
        return manu;
    }

    public void setManu(String manu) {
        this.manu = manu;
    }

    public String getProdu() {
        return produ;
    }

    public void setProdu(String produ) {
        this.produ = produ;
    }

    public String getNorms() {
        return norms;
    }

    public void setNorms(String norms) {
        this.norms = norms;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public StringBuffer getTag() {
        return tag;
    }

    public void setTag(StringBuffer tag) {
        this.tag = tag;
    }

    public int getCate() {
        return cate;
    }

    public void setCate(int cate) {
        this.cate = cate;
    }

    public String getSelectCate() {
        return selectCate;
    }

    public void setSelectCate(String selectCate) {
        this.selectCate = selectCate;
    }

    public File getPic1() {
        return pic1;
    }

    public void setPic1(File pic1) {
        this.pic1 = pic1;
    }

    public String getPic1FileName() {
        return pic1FileName;
    }

    public void setPic1FileName(String pic1FileName) {
        this.pic1FileName = pic1FileName;
    }

    public String getPic1ContentType() {
        return pic1ContentType;
    }

    public void setPic1ContentType(String pic1ContentType) {
        this.pic1ContentType = pic1ContentType;
    }

    public File getPic2() {
        return pic2;
    }

    public void setPic2(File pic2) {
        this.pic2 = pic2;
    }

    public String getPic2FileName() {
        return pic2FileName;
    }

    public void setPic2FileName(String pic2FileName) {
        this.pic2FileName = pic2FileName;
    }

    public String getPic2ContentType() {
        return pic2ContentType;
    }

    public void setPic2ContentType(String pic2ContentType) {
        this.pic2ContentType = pic2ContentType;
    }

    public File getPic3() {
        return pic3;
    }

    public void setPic3(File pic3) {
        this.pic3 = pic3;
    }

    public String getPic3FileName() {
        return pic3FileName;
    }

    public void setPic3FileName(String pic3FileName) {
        this.pic3FileName = pic3FileName;
    }

    public String getPic3ontentType() {
        return pic3ontentType;
    }

    public void setPic3ontentType(String pic3ontentType) {
        this.pic3ontentType = pic3ontentType;
    }

    public File getPic4() {
        return pic4;
    }

    public void setPic4(File pic4) {
        this.pic4 = pic4;
    }

    public String getPic4FileName() {
        return pic4FileName;
    }

    public void setPic4FileName(String pic4FileName) {
        this.pic4FileName = pic4FileName;
    }

    public String getPic4ContentType() {
        return pic4ContentType;
    }

    public void setPic4ContentType(String pic4ContentType) {
        this.pic4ContentType = pic4ContentType;
    }

    public File getPic5() {
        return pic5;
    }

    public void setPic5(File pic5) {
        this.pic5 = pic5;
    }

    public String getPic5FileName() {
        return pic5FileName;
    }

    public void setPic5FileName(String pic5FileName) {
        this.pic5FileName = pic5FileName;
    }

    public String getPic5ContentType() {
        return pic5ContentType;
    }

    public void setPic5ContentType(String pic5ContentType) {
        this.pic5ContentType = pic5ContentType;
    }

    public File getPic6() {
        return pic6;
    }

    public void setPic6(File pic6) {
        this.pic6 = pic6;
    }

    public String getPic6FileName() {
        return pic6FileName;
    }

    public void setPic6FileName(String pic6FileName) {
        this.pic6FileName = pic6FileName;
    }

    public String getPic6ContentType() {
        return pic6ContentType;
    }

    public void setPic6ContentType(String pic6ContentType) {
        this.pic6ContentType = pic6ContentType;
    }

    /**
     * 用于添加商品的操作方法
     *
     * @return 返回字符串"addGoods"
     */
    public String addGoods() {
        String goodsId = String.valueOf(goodsControlService.guessGoodsId());

        this.cate = getCateValue();

        //获取checkbox tag
        this.setTagValue();

        //获取文件
        String pic1Path = null;
        String pic2Path = null;
        String pic3Path = null;
        String pic4Path = null;
        String pic5Path = null;
        String pic6Path = null;

        if (pic1 != null) {
            if (!this.upLoadImage(pic1, pic1FileName, goodsId)) {
                message = "操作失败请重试";
                return "addGoods";
            }
            pic1Path = "localhost:8080/images/goods/" + goodsId + "/" + pic1FileName;
        }
        if (pic2 != null) {
            if (!this.upLoadImage(pic2, pic2FileName, goodsId)) {
                message = "操作失败请重试";
                return "addGoods";
            }
            pic2Path = "localhost:8080/images/goods/" + goodsId + "/" + pic2FileName;
        }
        if (pic3 != null) {
            if (!this.upLoadImage(pic3, pic3FileName, goodsId)) {
                message = "操作失败请重试";
                return "addGoods";
            }
            pic3Path = "localhost:8080/images/goods/" + goodsId + "/" + pic3FileName;
        }
        if (pic4 != null) {
            if (!this.upLoadImage(pic4, pic4FileName, goodsId)) {
                message = "操作失败请重试";
                return "addGoods";
            }
            pic4Path = "localhost:8080/images/goods/" + goodsId + "/" + pic4FileName;
        }
        if (pic5 != null) {
            if (!this.upLoadImage(pic5, pic5FileName, goodsId)) {
                message = "操作失败请重试";
                return "addGoods";
            }
            pic5Path = "localhost:8080/images/goods/" + goodsId + "/" + pic5FileName;
        }
        if (pic6 != null) {
            if (!this.upLoadImage(pic6, pic6FileName, goodsId)) {
                message = "操作失败请重试";
                return "addGoods";
            }
            pic6Path = "localhost:8080/images/goods/" + goodsId + "/" + pic6FileName;
        }
        if (!goodsControlService.descIntoGoodsPicArrayByGoodsId(Integer.parseInt(goodsId), pic1Path, pic2Path, pic3Path, pic4Path, pic5Path, pic6Path)) {
            message = "操作失败请重试";
            return "addGoods";
        }

        //提交
        int picArray = goodsControlService.guessPicId();
        if (goodsControlService.addGoods(this.name, this.info, Double.parseDouble(this.price),
                this.tag.toString().trim(), this.cate, this.manu, this.produ,
                picArray - 1, this.norms, this.unit, Integer.parseInt(this.start))) {
            this.message = "操作成功";
        } else {
            this.message = "操作失败请重试";
        }
        return "addGoods";
    }

    /**
     * 用于获取select下拉框的值
     *
     * @return 返回对应选项的 <b>value</b>值
     */
    private int getCateValue() {
        HttpServletRequest request = ServletActionContext.getRequest();
        String[] strings = request.getParameterValues("selectCate");
        return Integer.parseInt(strings[0]);
    }

    /**
     * 用于获取checkbox中选中的值
     */
    private void setTagValue() {
        tag = new StringBuffer();
        for (int i = 0; i < tags.length; i++) {
            tag.append(tags[i]).append(" ");
        }
    }

    /**
     * 用于获取用户上传的图片文件
     *
     * @param file     File类型的文件对象
     * @param fileName 文件名
     * @param goodsId  商品ID号
     * @return 如果操作成功则返回 <b>true</b> 否则返回 <b>false</b>
     */
    private boolean upLoadImage(File file, String fileName, String goodsId) {
        boolean flag = false;
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            String upLoadpath = ServletActionContext.getServletContext().getRealPath("images/goods/" + goodsId);
            File path = new File(upLoadpath);
            if (!path.exists()) {
                if (!path.mkdir()) {
                    return false;
                }
            }
            File toFile = new File(upLoadpath, fileName);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(toFile));
            int len;
            while ((len = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(len);
            }
            bufferedInputStream.close();
            bufferedOutputStream.close();
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

}
