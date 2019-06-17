package edu.sdust.service.impl;

import edu.sdust.service.IEquRepService;
import edu.sdust.dao.IEquRepDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("equRepService")
public class EquRepServiceImpl implements IEquRepService {
    @Autowired
    IEquRepDAO equRepDAO;
    @Override
    public List<Map<String, Object>> findAllEquRep(int page, int limit) {
        System.out.println(this.toString()+"<-findAllEquRep->");
        return equRepDAO.findAllEquRep(page, limit);
    }

    @Override
    public Map<String, Object> findEquRepCount() {
        System.out.println(this.toString()+"<-findEquRepCount->");
        return equRepDAO.findEquRepCount();
    }

    @Override
    public List<Map<String, Object>> equRepTotal() {
        System.out.println(this.toString()+"<-equRepTotal->");
        return equRepDAO.equRepTotal();
    }



    @Override
    public Map<String, Object> findEquNeedRepCount() {
        System.out.println(this.toString()+"<-findEquNeedRepCount->");

        return equRepDAO.findEquNeedRepCount();
    }

    @Override
    public boolean equRepUpdate(String snumber) {
        System.out.println(this.toString()+"<-equRepUpdate->");
        return equRepDAO.equRepUpdate(snumber);
    }

    @Override
    public List<Map<String, Object>> findAllEquNeedRep(int page, int limit) {
        System.out.println(this.toString()+"<-findAllEquNeedRep->");
        return equRepDAO.findAllEquNeedRep(page, limit);
    }

    @Override
    public boolean equInsRepLog(String snumber, String iname, String itype, String dept, String iproducetime, String latestrepairtime,String uname) {
        System.out.println(this.toString()+"<-equLogUpdate->");
        return equRepDAO.equInsRepLog(snumber, iname, itype, dept, iproducetime, latestrepairtime,uname);
    }

    @Override
    public List<Map<String, Object>> findAllEquRepLog(int page, int limit) {
        System.out.println(this.toString()+"<-findAllEquRepLog->");
        return equRepDAO.findAllEquRepLog(page, limit);
    }

    @Override
    public Map<String, Object> findEquRepCountLog() {
        System.out.println(this.toString()+"<-findEquRepCountLog->");
        return equRepDAO.findEquRepCountLog();
    }

    @Override
    public int deleteRepLogInfoBySnumber(String snumber) {
        System.out.println(this.toString()+"<-deleteRepLogInfoBySnumber->");
        return equRepDAO.deleteRepLogInfoBySnumber(snumber);
    }
}
