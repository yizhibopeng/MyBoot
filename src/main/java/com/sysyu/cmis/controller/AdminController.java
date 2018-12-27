package com.sysyu.cmis.controller;

import com.sysyu.cmis.bean.Order;
import com.sysyu.cmis.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Resource
    private TestService testService;

    @RequestMapping("index")
    public ModelAndView page1() {
        return new ModelAndView("/index.html") ;
    }

    @RequestMapping("list")
    public String getOrderList(Model model) {
        List<Order> list=testService.getAll();
        System.out.println(list.size());
        model.addAttribute("orders", list);
        return "list";
    }

    @RequestMapping("map")
    public Map<String, String> map1() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("name", "张三");
        map.put("age", "28");
        return map;
    }
}