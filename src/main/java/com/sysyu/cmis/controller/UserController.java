package com.sysyu.cmis.controller;

import com.sysyu.cmis.bean.User;
import com.sysyu.cmis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author yupeng
 * @description
 * @date 2019/1/16 0016 18:00
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("show")
    public String showUserById(Model model,@RequestParam("id") long id) {
        User user = userService.getUserById(id);
        System.out.println("userName="+user.getUserName());
        model.addAttribute("users", user);
        return "show";
    }
    @GetMapping("getId")
    @ResponseBody
    public User showUserById2(@RequestParam("id") long id) {
        User user = userService.getUserById(id);
        System.out.println("userName="+user.getUserName());
        return user;
    }

    @RequestMapping(value="index",method = RequestMethod.GET)
    public ModelAndView page1() {
        return new ModelAndView("/index.html") ;
    }

    //@RequestMapping(value="list",method = RequestMethod.GET)
    @GetMapping("list")
    public String getOrderList(Model model) {
        List<User> list=userService.getAll();
        System.out.println(list.size());
        for (User user:list) {
            System.out.println(user.getUserName());
        }
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
    public User addUser(User user){
        int i=userService.addUser(user);
        User u = null;
        if(i==1){
            u = userService.getUserById(user.getId());
        }else{

        }
        return u;
    }
}
