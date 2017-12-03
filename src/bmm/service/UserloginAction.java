package bmm.service;

import bmm.entity.UserloginEntity;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserloginAction extends ActionSupport {
    private String id;
    private String info;
    private UserloginEntityService userloginEntityService;

    public UserloginEntityService getUserloginEntityService() {
        return userloginEntityService;
    }

    public void setUserloginEntityService(UserloginEntityService userloginEntityService) {
        this.userloginEntityService = userloginEntityService;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String execute() throws Exception {
        System.out.println(this.id);
        UserloginEntity userloginEntity;
        String xmlPath = "spring-config.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserloginEntityService userloginEntityService =
                applicationContext.getBean("userloginService", UserloginEntityService.class);
        userloginEntity = userloginEntityService.login(Integer.parseInt(this.id));
        info = userloginEntity.getUsername();
        return "login";
    }
}
