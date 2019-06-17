package edu.sdust.service.impl;


import edu.sdust.dao.IUserDAO;
import edu.sdust.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    IUserDAO userDAO;

    @Override
    public String login(String uname, String upwd) {
        System.out.println(this.toString() + "<-login->" + uname + "," + upwd);
        return userDAO.login(uname, upwd);

       /* if (uname.equals("admin") && upwd.equals("123456"))
            return "success";
            //System.out.println(uname + "," + upwd);
        else
            return "fault";*/
    }

    @Override
    public boolean register(String uname, String upwd, String email) {
        System.out.println(this.toString() + "<-register->" + uname + "," + upwd + "," + email);
        boolean temp = userDAO.register(uname, upwd, email);
        return temp;
    }
    @Override
    public List<Map<String, Object>> findAllUser(int page, int pageSize) {
        return userDAO.findAllUser(page,pageSize);
    }

    @Override
    public Map<String, Object> findUserCount() {
        return userDAO.findUserCount();
    }

    @Override
    public int deleteUserInfoById(int id) {
        return userDAO.deleteUserInfoById(id);
    }

    @Override
    public List<Map<String, Object>> userTotal() {
        return userDAO.userTotal();
    }

    @Override
    public String returnRole(String uname) {
        return userDAO.returnRole(uname);
    }

    @Override
    public Map returnAUser(String uname) {
        return userDAO.returnAUser(uname);
    }

    @Override
    public String editPwd(String uname, String pwd) {
        return userDAO.editPwd(uname, pwd);
    }
}
