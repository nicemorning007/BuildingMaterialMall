package bmm.struts.action.goods;

import bmm.service.GoodsControlService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.io.*;

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
    private File headImage;
    private String headImageFileName;
    private String headImageContentType;

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

    public File getHeadImage() {
        return headImage;
    }

    public void setHeadImage(File headImage) {
        this.headImage = headImage;
    }

    public String getHeadImageFileName() {
        return headImageFileName;
    }

    public void setHeadImageFileName(String headImageFileName) {
        this.headImageFileName = headImageFileName;
    }

    public String getHeadImageContentType() {
        return headImageContentType;
    }

    public void setHeadImageContentType(String headImageContentType) {
        this.headImageContentType = headImageContentType;
    }

    public String getSelectCate() {
        return selectCate;
    }

    public void setSelectCate(String selectCate) {
        this.selectCate = selectCate;
    }

    /**
     * 用于添加商品的操作方法
     *
     * @return 返回字符串"addGoods"
     */
    public String addGoods() {
//        //获取select cate
        HttpServletRequest request = ServletActionContext.getRequest();
        String[] strings = request.getParameterValues("selectCate");
        cate = Integer.parseInt(strings[0]);

//        //获取checkbox tag
        tag = new StringBuffer();
        for (int i = 0; i < tags.length; i++) {
            tag.append(tags[i]).append(" ");
        }

        //获取文件
        if (headImage != null) {
            if (!this.upLoadImage(headImage, headImageFileName, String.valueOf(goodsControlService.getGoodsCount() + 1))) {
                message = "操作失败请重试";
                return "addGoods";
            }
        }

        //提交
        if (goodsControlService.addGoods(this.name, this.info, Double.parseDouble(this.price),
                this.tag.toString().trim(), this.manu, this.produ, this.norms, this.unit, Integer.parseInt(this.start))) {
            this.message = "操作成功";
        } else {
            this.message = "操作失败请重试";
        }
        return "addGoods";
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
