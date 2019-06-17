package edu.sdust.action;

import edu.sdust.service.IUserService;
import edu.sdust.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserAction {
    @Autowired
    IUserService userService;
    @RequestMapping("/login.do")
    @ResponseBody
    public String login(String uname, String upwd) {

        String str=userService.login(uname,upwd);
        return str;
        /*if (uname.equals("admin") && upwd.equals("123456"))
            return "success";
            //System.out.println(uname + "," + upwd);
        else
            return "fault";*/
    }

    @RequestMapping("/register.do")
    @ResponseBody
    public String register(String r_uname, String r_upwd,String email) {
        //IUserService userService=new UserServiceImpl();
        boolean temp=userService.register(r_uname, r_upwd, email);
        /*boolean temp=true;
        //uname.equals("admin") && upwd.equals("123456")
        System.out.println(r_uname+", "+r_upwd+", "+email);
        */
        if (temp)
            return "success";
//                    +"<br>"+r_uname+", "+r_upwd+", "+email;
            //System.out.println(uname + "," + upwd);
        else
            return "fault";
    }
    @RequestMapping("/findAllUser.do")
    @ResponseBody
    public Map<String, Object> findAllUser(int page, int limit) {
        System.out.println(page+","+limit);
        List<Map<String, Object>> list = userService.findAllUser(page, limit);
        Map<String, Object> userCount = userService.findUserCount();
        Map map = new HashMap();
        map.put("code", 0);
        map.put("msg", "用户信息");
        map.put("count", userCount.get("count"));//用户表中的总记录数
        map.put("data", list);
        return map;//返回JSON格式数据，但是不能转换，因为找不到JSON消息转换器
    }

    @RequestMapping("/userTotal.do")
    @ResponseBody
    public Map<String, Object> userTotal(){
        List<Map<String, Object>> list = userService.userTotal();
        Map map = new HashMap();
        List roleList=new ArrayList();
        List countList=new ArrayList();
        System.out.println(list.toString());
        for(Map mp:list){
            roleList.add(mp.get("role"));
            countList.add(mp.get("count"));
        }
        map.put("roleList",roleList);
        map.put("countList",countList);
        return map;//返回JSON格式数据，但是不能转换，因为找不到JSON消息转换器
    }

    @RequestMapping("/deleteUserInfoById.do")
    @ResponseBody
    public String deleteUserInfoById(String id) {
        System.out.println(id);
        String result = "success";
        int i=0;
        try{
            String  [] arr= id.split(",");
            for (String index:arr) {
                i= userService.deleteUserInfoById(Integer.parseInt(index));
                System.out.println("正在删除第"+index+"条");
            }
        }catch ( Exception e){
            i=0;
            e.printStackTrace();
        }
        if (i == 0)
            result = "fault";
        return result;//返回JSON格式数据，但是不能转换，因为找不到JSON消息转换器
    }
    @RequestMapping("/returnRole.do")
    @ResponseBody
    public String returnRole(String uname){
        String str=userService.returnRole(uname);
        System.out.println(str);
        return str;
    }
    @RequestMapping("/returnAUser.do")
    @ResponseBody
    public Map<String,Object> returnAUser(String uname){
        Map map=new HashMap();
        map=userService.returnAUser(uname);
        System.out.println(map);
        return map;
    }

    @RequestMapping("/editPwd.do")
    @ResponseBody
    public String editPwd(String uname,String pwd,String newpwd){
        String s=userService.login(uname, pwd);
        if(s!="success")
            return "fault";
        System.out.println("原密码正确");
       String str=userService.editPwd(uname,newpwd);
       return str;
    }
}
