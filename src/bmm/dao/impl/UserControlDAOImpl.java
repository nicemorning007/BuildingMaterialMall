package bmm.dao.impl;

import bmm.dao.UserControlDAO;
import bmm.entity.UserinfoEntity;
import bmm.entity.UserloginEntity;
import bmm.utils.hibernate_util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 关于用户账户登陆的数据库操作接口的实现
 */
@Transactional
public class UserControlDAOImpl implements UserControlDAO {

    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    /**
     * 查询所有用户的所有信息
     *
     * @return 所有用户的所有信息的list列表
     */
    @Override
    public List<UserinfoEntity> showAllUserInfo() {
        List<UserinfoEntity> list = null;
        list = (List<UserinfoEntity>) hibernateTemplate.find("from UserinfoEntity");
        return list;
    }

    /**
     * 通过ID号获取用户名
     *
     * @param id 要查询的ID号
     * @return 如果查询成功返回该ID号对应的用户名。否则返回 <b>null</b>
     */
    @Override
    public String getUsernameById(int id) {
        String hql = "select ue.username from UserloginEntity ue where ue.id=?";
        List<Object> list = (List<Object>) hibernateTemplate.find(hql, id);
        for (Object o : list) {
            if (o != null) {
                return o.toString();
            }
        }
        return null;
    }

    /**
     * 通过用户名查找对应的ID号
     *
     * @param username 要查询的用户名
     * @return 如果查询成功返回该用户名对应的ID号，否则返回 <b>0</b>
     */
    @Override
    public int getIdByName(String username) {
        String hql = "select ue.id from UserloginEntity ue where ue.username=?";
        List<Object> list = (List<Object>) hibernateTemplate.find(hql, username);
        for (Object o : list) {
            if (o != null) {
                return Integer.parseInt(o.toString());
            }
        }
        return 0;
    }

    /**
     * 用于判断用户输入的用户账户是否存在
     *
     * @param username 用户输入的用户账号
     * @return <b>true</b> 如果该账号存在，否则返回 <b>false</b>
     */
    @Override
    public boolean isExist(String username) {
        boolean flag = false;
        String hql = "from UserloginEntity ue where ue.username=?";
        List<UserloginEntity> list = (List<UserloginEntity>) hibernateTemplate.find(hql, username);
        if (list.size() >= 1) {
            for (UserloginEntity userloginEntity : list) {
                if (userloginEntity.getUsername().equals(username)) {
                    flag = true;
                }
            }
        }
        return flag;
    }

    /**
     * 根据ID号查询对应用户的最近登陆时间
     *
     * @param id 要查询的ID号
     * @return 返回最近登陆的时间
     */
    @Override
    public String getLatestLoginTimeById(int id) {
        String hql = "select ue.lastLoginTime from UserinfoEntity ue where ue.userId=?";
        List<Object> list = (List<Object>) hibernateTemplate.find(hql, id);
        if (list != null) {
            if (list.size() > 0) {
                for (Object o : list) {
                    return o.toString();
                }
            }
        }
        return null;
    }

    /**
     * 更新指定ID对应的用户的登陆时间
     *
     * @param id   要更新的用户ID
     * @param time 更新的时间
     * @return 如果更新成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    @Override
    @Transactional
    public boolean setLatestLoginTimeById(int id, String time) {
        boolean flag = false;
        String hql = "from UserinfoEntity as ue where ue.userId=?";
        List<UserinfoEntity> list = (List<UserinfoEntity>) hibernateTemplate.find(hql, id);
        if (list != null) {
            if (list.size() > 0) {
                for (UserinfoEntity userinfoEntity : list) {
                    userinfoEntity.setLastLoginTime(time);
                    try {
                        hibernateTemplate.update(userinfoEntity);
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
     * 通过ID号获取指定用户的密码
     *
     * @param id 要查询的用户的ID
     * @return 如果查询到则返回该用户的密码，否则返回 <b>null</b>
     */
    @Override
    public String getPasswordById(int id) {
        String hql = "select ue.password from UserloginEntity ue where ue.id=?";
        List<Object> list = (List<Object>) hibernateTemplate.find(hql, id);
        for (Object o : list) {
            if (o != null) {
                return o.toString();
            }
        }
        return null;
    }

    /**
     * 用于修改指定用户的密码
     *
     * @param id          需要修改密码的用户的ID号
     * @param newPassword 加密好的密码
     * @return <b>true</b> 如果该账号密码修改成功，否则返回<b>false</b>
     */
    @Override
    @Transactional
    public boolean changePasswordById(int id, String newPassword) {
        boolean flag = false;
        String hql = "from UserloginEntity ue where ue.id=?";
        List<UserloginEntity> list = (List<UserloginEntity>) hibernateTemplate.find(hql, id);
        if (list != null) {
            if (list.size() > 0) {
                for (UserloginEntity userloginEntity : list) {
                    userloginEntity.setPassword(newPassword);
                    try {
                        hibernateTemplate.update(userloginEntity);
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
     * 用于新增用户账户
     *
     * @param username 新的用户帐户名
     * @param password 加密好的密码
     * @return 如果添加成功返回 <b>true</b> 否则返回 <b>false</b>
     */
    @Override
    @Transactional
    public boolean register(String username, String password) {
        boolean flag = false;
        UserloginEntity userloginEntity = new UserloginEntity();
        userloginEntity.setUsername(username);
        userloginEntity.setPassword(password);
        try {
            hibernateTemplate.save(userloginEntity);
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    /**
     * 用于查询该用户是否被注销或挂失
     *
     * @param id 要查询的用户的id
     * @return 如果未查到数据则返回 <b>-1</b>；
     * 如果已被注销则返回 <b>1</b>；
     * 如果已被挂失则返回 <b>2</b>；
     * 否则返回 <b>0</b>
     */
    @Override
    public int getUserState(int id) {
        int flag = -1;
        String hql = "select ue.state from UserloginEntity ue where ue.id=?";
        List<Integer> list = (List<Integer>) hibernateTemplate.find(hql, id);
        for (Integer o : list) {
            if (o != null) {
                return o;
            }
        }
        return flag;
    }

    /**
     * 用于更改用户登陆状态
     *
     * @param id    要更改的用户id号
     * @param state 要更改的状态编号
     * @return 如果更改成功返回 <b>true</b> 否则返回 <b>false</b>
     */
    @Override
    @Transactional
    public boolean chageUserstate(int id, int state) {
        boolean flag = false;
        String hql = "from UserloginEntity as us where us.id = ?";
        List<UserloginEntity> list = (List<UserloginEntity>) hibernateTemplate.find(hql, id);
        if (list != null) {
            if (list.size() > 0) {
                for (UserloginEntity userloginEntity : list) {
                    userloginEntity.setState(state);
                    try {
                        hibernateTemplate.update(userloginEntity);
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
     * 用于清除 Hibernate 的缓存
     */
    @Override
    public void clearCache() {
        Session session = HibernateUtil.getSession();
        session.clear();
    }

    /**
     * 用于获取总用户数
     *
     * @return 如果查询成功则返回总用户数；否则返回 <b>0</b>
     */
    @Override
    public int getUserCount() {
        String hql = "select count(*) from UserloginEntity as ge";
        Long count = (Long) hibernateTemplate.find(hql).listIterator().next();
        return count.intValue();
    }

    /**
     * 根据用户ID获取对应的收件人
     *
     * @param id 要查询的用户ID
     * @return 如果查询到则返回该用户的收件人，否则返回 <b>null</b>
     */
    @Override
    public String getReceiverById(int id) {
        List<String> list = (List<String>) hibernateTemplate.find(
                "select ue.receiver from UserinfoEntity ue where ue.userId=?", id);
        if (list != null) {
            if (list.size() > 0) {
                for (String receiver : list) {
                    return receiver;
                }
            }
        }
        return null;
    }

    /**
     * 根据用户ID查询对应的手机号
     *
     * @param id 要查询的用户ID
     * @return 如果查询到则返回该用户的密码，否则返回 <b>null</b>
     */
    @Override
    public String getPhoneById(int id) {
        List<String> list = (List<String>) hibernateTemplate.find(
                "select ue.phone from UserinfoEntity ue where ue.userId=?", id);
        if (list != null) {
            if (list.size() > 0) {
                for (String receiver : list) {
                    return receiver;
                }
            }
        }
        return null;
    }

    /**
     * 根据用户ID查询对应的收件地址
     *
     * @param id 要查询的用户ID
     * @return 如果查询到则返回该用户的收件地址，否则返回 <b>null</b>
     */
    @Override
    public String getAddressById(int id) {
        List<String> list = (List<String>) hibernateTemplate.find(
                "select ue.address from UserinfoEntity ue where ue.userId=?", id);
        if (list != null) {
            if (list.size() > 0) {
                for (String receiver : list) {
                    return receiver;
                }
            }
        }
        return null;
    }

    /**
     * 根据用户ID查找对应的昵称
     *
     * @param id 要查询的用户ID号
     * @return 如果查询成功则返回该用户的昵称，否则返回 <b>null</b>
     */
    @Override
    public String getNickNameById(int id) {
        List<String> list = (List<String>) hibernateTemplate.find(
                "select ue.nickname from UserinfoEntity ue where ue.userId=?", id);
        if (list != null) {
            if (list.size() > 0) {
                for (String receiver : list) {
                    return receiver;
                }
            }
        }
        return null;
    }

    /**
     * 根据用户ID设置对应的昵称
     *
     * @param id       要操作的用户ID号
     * @param nickName 要设置的昵称
     * @return 如果更改成功返回 <b>true</b> 否则返回 <b>false</b>
     */
    @Override
    @Transactional
    public boolean setNickNameById(int id, String nickName) {
        boolean flag = false;
        String hql = "from UserinfoEntity ue where ue.userId=?";
        UserinfoEntity userinfoEntity;
        List<UserinfoEntity> list = (List<UserinfoEntity>) hibernateTemplate.find(
                hql, id);
        if (list != null) {
            if (list.size() > 0) {
                userinfoEntity = list.get(0);
                userinfoEntity.setNickname(nickName);
                try {
                    hibernateTemplate.update(userinfoEntity);
                    flag = true;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return flag;
    }

    /**
     * 根据用户ID查找对应的性别
     *
     * @param id 要查询的用户ID号
     * @return 如果查询成功则返回该用户的性别，否则返回 <b>null</b>
     */
    @Override
    public String getGenderById(int id) {
        List<String> list = (List<String>) hibernateTemplate.find(
                "select ue.gender from UserinfoEntity ue where ue.userId=?", id);
        if (list != null) {
            if (list.size() > 0) {
                for (String receiver : list) {
                    return receiver;
                }
            }
        }
        return null;
    }

    /**
     * 根据用户ID设置对应的性别
     *
     * @param id     要操作的用户ID号
     * @param gender 要设置的性别
     * @return 如果更改成功返回 <b>true</b> 否则返回 <b>false</b>
     */
    @Override
    @Transactional
    public boolean setGenderById(int id, String gender) {
        boolean flag = false;
        String hql = "from UserinfoEntity ue where ue.userId=?";
        UserinfoEntity userinfoEntity;
        List<UserinfoEntity> list = (List<UserinfoEntity>) hibernateTemplate.find(
                hql, id);
        if (list != null) {
            if (list.size() > 0) {
                userinfoEntity = list.get(0);
                userinfoEntity.setGender(gender);
                try {
                    hibernateTemplate.update(userinfoEntity);
                    flag = true;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return flag;
    }

    /**
     * 根据指定的用户名查找对应的用户ID号
     *
     * @param username 要查找的用户名
     * @return 如果查询成功则返回该用户名对应的用户ID号，否则返回 <b>0</b>
     */
    @Override
    public int getUserIdByUsername(String username) {
        String hql = "select ue.id from UserloginEntity ue where ue.username=?";
        List<Integer> list = (List<Integer>) hibernateTemplate.find(hql, username);
        if (list != null) {
            if (list.size() > 0) {
                return list.get(0);
            }
        }
        return 0;
    }

    /**
     * 根据指定的用户ID号更新该用户的信息
     *
     * @param id       要操作的用户ID号
     * @param receiver 要更新的收件人
     * @param adderss  要更新的收件地址
     * @param phone    要更新的联系方式
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    @Override
    @Transactional
    public boolean updateUserInfo(int id, String receiver, String adderss, String phone) {
        boolean flag = false;
        String hql = "from UserinfoEntity ue where ue.userId=?";
        List<UserinfoEntity> userinfoEntityList = (List<UserinfoEntity>) hibernateTemplate.find(hql, id);
        if (userinfoEntityList != null) {
            if (userinfoEntityList.size() > 0) {
                UserinfoEntity userinfoEntity = userinfoEntityList.get(0);
                userinfoEntity.setReceiver(receiver);
                userinfoEntity.setAddress(adderss);
                userinfoEntity.setPhone(phone);
                try {
                    hibernateTemplate.save(userinfoEntity);
                    flag = true;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return flag;
    }

    /**
     * 根据指定的用户ID号更改该用户的密码
     *
     * @param id       要操作的用户ID号
     * @param password 要更改的新密码
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    @Override
    @Transactional
    public boolean updatePasswordByUserId(int id, String password) {
        boolean flag = false;
        String hql = "from UserloginEntity ue where ue.id=?";
        List<UserloginEntity> userinfoEntityList =
                (List<UserloginEntity>) hibernateTemplate.find(hql, id);
        if (userinfoEntityList != null) {
            if (userinfoEntityList.size() > 0) {
                UserloginEntity userloginEntity = userinfoEntityList.get(0);
                userloginEntity.setPassword(password);
                try {
                    hibernateTemplate.save(userloginEntity);
                    flag = true;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return flag;
    }

    /**
     * 根据指定的用户ID号更改该用户的基本信息
     *
     * @param id       要操作的用户ID号
     * @param nickname 要更新的昵称
     * @param gender   要更新的性别
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    @Override
    @Transactional
    public boolean updateBaseInfoByUserId(int id, String nickname, String gender) {
        boolean flag = false;
        String hql = "from UserinfoEntity ue where ue.userId=?";
        List<UserinfoEntity> userinfoEntityList = (List<UserinfoEntity>) hibernateTemplate.find(hql, id);
        if (userinfoEntityList != null) {
            if (userinfoEntityList.size() > 0) {
                UserinfoEntity userinfoEntity = userinfoEntityList.get(0);
                userinfoEntity.setNickname(nickname);
                userinfoEntity.setGender(gender);
                try {
                    hibernateTemplate.save(userinfoEntity);
                    flag = true;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return flag;
    }

    /**
     * 通过指定的ID号获取对应的用户信息
     *
     * @param id 要查询的ID号
     * @return 如果操作成功则返回 <b>true</b>；否则返回 <b>false</b>
     */
    @Override
    public UserinfoEntity getOneById(int id) {
        String hql = "from UserinfoEntity ue where ue.id=?";
        List<UserinfoEntity> list = (List<UserinfoEntity>) hibernateTemplate.find(hql, id);
        if (list != null) {
            if (list.size() > 0) {
                return list.get(0);
            }
        }
        return null;
    }
}