package edu.sdust.dao.impl;

import edu.sdust.dao.IEquRepDAO;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.text.SimpleDateFormat;
import java.util.*;

@Repository("equRepDAO")
public class EquRepDAOImpl implements IEquRepDAO {
    @Autowired
    SqlSessionFactory sessionFactoryBean;

    @Override
    public List<Map<String, Object>> findAllEquRep(int page, int limit) {
        try {
            SqlSession sqlSession = sessionFactoryBean.openSession(true);
            String statement = "edu.sdust.mapping.equRepMapper.findAllEquRep";
            Map map = new HashMap();
            map.put("page", (page - 1) * limit);
            map.put("pageSize", limit);
            List<Map<String, Object>> list = sqlSession.selectList(statement, map);
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
       /* List<Map<String, Object>> list=new ArrayList<Map<String,Object>>();
        Map mm=new HashMap();
        mm.put("dao--findAllEqu>",1);
        list.add(mm);
        return list;*/
    }

    @Override
    public Map<String, Object> findEquRepCount() {
        try {
            SqlSession sqlSession = sessionFactoryBean.openSession(true);
            String statement = "edu.sdust.mapping.equRepMapper.findEquRepCount";
            Map map = sqlSession.selectOne(statement);
//            System.out.println(map);
            return map;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
        /*Map<String, Object> map=new HashMap();
        map.put("dao-->findEquCount",2);
        return map;*/
    }

    @Override
    public Map<String, Object> findEquNeedRepCount() {
        try {
            SqlSession sqlSession = sessionFactoryBean.openSession(true);
            String statement = "edu.sdust.mapping.equRepMapper.findEquNeedRepCount";
            String statement1 = "edu.sdust.mapping.equRepMapper.creatNeedRepView";
            int i = sqlSession.update(statement1);
            Map map = sqlSession.selectOne(statement);
//            System.out.println(map);

            return map;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
        /*Map<String, Object> map=new HashMap();
        map.put("dao-->findEquCount",2);
        return map;*/
    }

    @Override
    public boolean equRepUpdate(String snumber) {
        try {
            SqlSession sqlSession = sessionFactoryBean.openSession(true);
            String statement = "edu.sdust.mapping.equRepMapper.updateLatestrepairtime";
            int i = sqlSession.update(statement, snumber);
            System.out.println("update flag " + i + "--" + snumber);
            if (i == 0)
                return false;
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Map<String, Object>> findAllEquNeedRep(int page, int limit) {
        try {
            SqlSession sqlSession = sessionFactoryBean.openSession(true);
            String statement = "edu.sdust.mapping.equRepMapper.findAllEquNeedRep";
            Map map = new HashMap();
            map.put("page", (page - 1) * limit);
            map.put("pageSize", limit);
            List<Map<String, Object>> list = sqlSession.selectList(statement, map);
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean equInsRepLog(String snumber, String iname, String itype, String dept, String iproducetime, String latestrepairtime,String uname) {
        try {
            SqlSession sqlSession = sessionFactoryBean.openSession(true);
            String statement = "edu.sdust.mapping.equRepMapper.equInsRepLog";

            System.out.println(iproducetime+"<--->"+latestrepairtime);
            long it=new Long(iproducetime);
            Date time1=new Date(it);

            long it2=new Long(latestrepairtime);
            Date time2=new Date(it2);

            Map map = new HashMap();
//            "snumber": snumber,"iname":iname,"itype":itype,"dept":dept,"iproducetime":iproducetime,"pastrepair":latestrepairtime
            map.put("snumber",snumber);
            map.put("iname",iname);
            map.put("itype",itype);
            map.put("dept",dept);
            map.put("iproducetime",time1);
            map.put("latestrepairtime",time2);
            map.put("repairpeople",uname);
//            List<Map<String, Object>> list = sqlSession.selectList(statement, map);
            System.out.println(snumber+iname+itype+dept+time1+time2+uname);
            int i =sqlSession.insert(statement,map);
            if (i==0)
                return false;
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public List<Map<String, Object>> findAllEquRepLog(int page, int limit) {
        try {
            SqlSession sqlSession = sessionFactoryBean.openSession(true);
            String statement = "edu.sdust.mapping.equRepMapper.findAllEquRepLog";
            Map map = new HashMap();
            map.put("page", (page - 1) * limit);
            map.put("pageSize", limit);
            List<Map<String, Object>> list = sqlSession.selectList(statement, map);
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Map<String, Object> findEquRepCountLog() {
        try {
            SqlSession sqlSession = sessionFactoryBean.openSession(true);
            String statement = "edu.sdust.mapping.equRepMapper.findEquRepCountLog";
            Map map = sqlSession.selectOne(statement);
//            System.out.println(map);
            return map;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Map<String, Object>> equRepTotal() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        Map map = new HashMap<String, Object>();
        map.put("dao-equTotal", 3);
        list.add(map);
        return list;
    }

    @Override
    public int deleteRepLogInfoBySnumber(String snumber) {
        try {
            SqlSession sqlSession = sessionFactoryBean.openSession(true);
            String statement = "edu.sdust.mapping.equRepMapper.deleteRepLogInfoBySnumber";
            int i = sqlSession.delete(statement, snumber);
//            System.out.println(i);
            return i;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
}
