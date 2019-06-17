package edu.sdust.dao;

import java.util.List;
import java.util.Map;

public interface IEquRepDAO {
    List<Map<String,Object>> findAllEquRep(int page, int limit);
    Map<String,Object> findEquRepCount();
    List<Map<String,Object>> equRepTotal();
    int deleteRepLogInfoBySnumber(String snumber);
    Map<String, Object> findEquNeedRepCount();
    boolean equRepUpdate(String snumber);
    List<Map<String, Object>> findAllEquNeedRep(int page, int limit);
    boolean equInsRepLog(String snumber, String iname, String itype, String dept, String iproducetime, String latestrepairtime,String uname);
    List<Map<String, Object>> findAllEquRepLog(int page, int limit);
    Map<String, Object> findEquRepCountLog();

}
