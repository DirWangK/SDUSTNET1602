package edu.sdust.service;

import java.util.List;
import java.util.Map;



public interface IEquRepService {
    List<Map<String,Object>> findAllEquRep(int page, int limit);
    Map<String,Object> findEquRepCount();
    List<Map<String,Object>> equRepTotal();
    Map<String, Object> findEquNeedRepCount();

    boolean equRepUpdate(String snumber);

    List<Map<String, Object>> findAllEquNeedRep(int page, int limit);
    boolean equInsRepLog(String snumber, String iname, String itype, String dept, String iproducetime, String latestrepairtime,String uname);

    List<Map<String, Object>> findAllEquRepLog(int page, int limit);
    Map<String, Object> findEquRepCountLog();
    int deleteRepLogInfoBySnumber(String snumber);
}
