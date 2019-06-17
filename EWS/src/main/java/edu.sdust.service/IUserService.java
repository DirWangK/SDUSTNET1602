package edu.sdust.service;

import java.util.List;
import java.util.Map;

public interface IUserService {
    String login(String uname,String upwd);
    //String register(String uname,String upwd,String email);
    boolean register(String uname,String upwd,String email);
    List<Map<String,Object>> findAllUser(int page, int pageSize);
    Map<String,Object> findUserCount();
    int deleteUserInfoById(int id);
    List<Map<String,Object>> userTotal();
    String returnRole(String uname);

    Map<String,Object> returnAUser(String uname);

    String editPwd(String uname, String pwd);
}
