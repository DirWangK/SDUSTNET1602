package edu.sdust.dao.impl;

import edu.sdust.dao.IUserDAO;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository("userDAO")
public class UserDAOImpl implements IUserDAO {
    @Autowired
    SqlSessionFactory sessionFactoryBean;

    @Override
    public String login(String uname, String upwd) {
        System.out.println(this.toString() + "<-login->" + uname + "," + upwd);

        SqlSession sqlSession = sessionFactoryBean.openSession(true);
        String statment = "edu.sdust.mapping.userMapper.login";
        Map map = new HashMap();
        map.put("uname", uname);
        map.put("upwd", upwd);
        List<Map<String, Object>> list = sqlSession.selectList(statment, map);
        if (!list.isEmpty()) {
            System.out.println(list);
            statment = "edu.sdust.mapping.userMapper.updateLoginTime";
            sqlSession.update(statment, uname);
            return "success";
        } else {
            return "fault";
        }
        /* if (uname.equals("admin") && upwd.equals("123456"))
            return "success";
            //System.out.println(uname + "," + upwd);
        else
            return "fault";*/
    }

    @Override
    public boolean register(String uname, String upwd, String email) {
        System.out.println(this.toString() + "<-register->" + uname + "," + upwd + "," + email);

        SqlSession sqlSession = sessionFactoryBean.openSession(true);

        String statment1 = "edu.sdust.mapping.userMapper.select";

        String statment = "edu.sdust.mapping.userMapper.register";
        Map map = new HashMap();
        map.put("uname", uname);
        List<Map<String, Object>> list1 = sqlSession.selectList(statment1, map);

        map.put("upwd", upwd);
        map.put("email", email);
        if (list1.size() > 0)
            return false;

        int i = sqlSession.insert(statment, map);
        if (i > 0)
            return true;
        else
            return false;

        /*System.out.println(this.toString() + "<-->" + email);
        return true;*/
    }

    @Override
    public List<Map<String, Object>> findAllUser(int page, int pageSize) {
        try {
            SqlSession sqlSession = sessionFactoryBean.openSession(true);
            String statement = "edu.sdust.mapping.userMapper.findAllUser";
            Map map = new HashMap();
            map.put("page", (page - 1) * pageSize);
            map.put("pageSize", pageSize);
            List<Map<String, Object>> list = sqlSession.selectList(statement, map);
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Map<String, Object>> userTotal() {
        try {
            SqlSession sqlSession = sessionFactoryBean.openSession(true);
            String statement = "edu.sdust.mapping.userMapper.userTotal";
            List<Map<String, Object>> list = sqlSession.selectList(statement);
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Map<String, Object> findUserCount() {
        try {
            SqlSession sqlSession = sessionFactoryBean.openSession(true);
            String statement = "edu.sdust.mapping.userMapper.findUserCount";
            Map map = sqlSession.selectOne(statement);
            System.out.println(map);
            return map;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int deleteUserInfoById(int id) {
        try {
            SqlSession sqlSession = sessionFactoryBean.openSession(true);
            String statement = "edu.sdust.mapping.userMapper.deleteUserInfoById";
            int i = sqlSession.delete(statement, id);
            System.out.println(i);
            return i;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public String returnRole(String uname) {
        try {
            SqlSession sqlSession = sessionFactoryBean.openSession(true);
            String statement = "edu.sdust.mapping.userMapper.returnRole";
//            Map map = new HashMap();
//            map.put("uname", uname);
            Map<String, Object> map = sqlSession.selectOne(statement, uname);
            if (map.isEmpty())
                return "error";
            return (String)map.get("role");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "error";
    }

    @Override
    public Map<String,Object> returnAUser(String uname) {
        try {
            SqlSession sqlSession = sessionFactoryBean.openSession(true);
            String statement = "edu.sdust.mapping.userMapper.select";
            Map map = new HashMap();
            map.put("uname", uname);
             List<Map<String,Object>> list= sqlSession.selectList(statement, map);
            if (list.isEmpty())
                return null;
            return  list.get(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String editPwd(String uname, String pwd) {
        try {
            SqlSession sqlSession = sessionFactoryBean.openSession(true);
            String statement = "edu.sdust.mapping.userMapper.editPwd";
            Map map = new HashMap();
            map.put("uname", uname);
            map.put("pwd", pwd);
            int i= sqlSession.update(statement, map);
            if (i==0)
                return "fault";
            return  "success";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "success";
    }
}
