package edu.sdust.dao;

import java.util.List;
import java.util.Map;

public  interface IUserDAO {
    String login(String uname,String upwd);
    boolean register(String uname,String upwd,String email);
    List<Map<String,Object>> findAllUser(int page, int pageSize);
    List<Map<String,Object>> userTotal();
    Map<String,Object> findUserCount();
    int deleteUserInfoById(int id);
    String returnRole(String uname);
    Map<String,Object> returnAUser(String uname);
    String editPwd(String uname, String pwd);

}
