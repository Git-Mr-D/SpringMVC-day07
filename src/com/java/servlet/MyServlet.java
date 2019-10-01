package com.java.servlet;

import com.java.pojo.Usere;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/MyServlet")
public class MyServlet {


    @RequestMapping("/login.do")
    public @ResponseBody Map<String,Object> login(){
      Map<String,Object> map1=new HashMap<>();
      map1.put("id",1L);
      map1.put("uName","王二麻子");
      return map1;
    }

    @RequestMapping("/loggin.do")
    public @ResponseBody List<Map<String,Object>> loggin(){
        Map<String,Object> map1=new HashMap<>();
        map1.put("id",1L);
        map1.put("uName","王二麻子");

        Map<String,Object> map2=new HashMap<>();
        map2.put("id",2L);
        map2.put("uName","王二麻子");

        Map<String,Object> map3=new HashMap<>();
        map3.put("id",3L);
        map3.put("uName","王二麻子");

        Map<String,Object> map4=new HashMap<>();
        map4.put("id",4L);
        map4.put("uName","王二麻子");

        List<Map<String, Object>> mapList = Arrays.asList(map1, map2, map3, map4);

        return mapList;
    }

    @RequestMapping("/User.do")
    public void Usere(@RequestParam Map<String,Object> map){
        System.out.println(map);
    }

    @RequestMapping("/ZhuCe.do")
    public String ZhuCe(Usere usere){
        return "/show.jsp";
    }

    @RequestMapping("/usere")
    public String usere(Integer id, HttpServletRequest request){
         //业务层.删除方法


        return "/";
    }
}
