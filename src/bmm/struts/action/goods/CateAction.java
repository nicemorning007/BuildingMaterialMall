package bmm.struts.action.goods;

import bmm.service.CateControlService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.lang3.StringUtils;

public class CateAction extends ActionSupport {
    private String cateName;
    private int id;
    private String info;
    private CateControlService cateControlService;

    public CateControlService getCateControlService() {
        return cateControlService;
    }

    public void setCateControlService(CateControlService cateControlService) {
        this.cateControlService = cateControlService;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * 用于修改分类名
     *
     * @return 返回字符串"editCate"
     */
    public String editCate() {
        if (StringUtils.isBlank(this.cateName)) {
            cateControlService.deleteCate(this.id);
        }else{
            if (cateControlService.editCateNameById(this.id, this.cateName)) {
                info = "操作成功";
            } else {
                info = "操作失败";
            }
        }
        return "editCate";
    }

    /**
     * 用于新增分类
     *
     * @return 返回字符串"addCate"
     */
    public String addCate() {
        if (cateControlService.addCateName(this.cateName)) {
            info = "操作成功";
        } else {
            info = "该类名已存在";
        }
        return "addCate";
    }

}
