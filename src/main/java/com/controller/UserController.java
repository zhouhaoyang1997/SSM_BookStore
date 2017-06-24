package com.controller;

import com.entry.User;
import com.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @author zhy
 * @create 2017-06-23 21:25
 **/
@Controller
public class UserController {
    @Resource
    private UserService userService;

    /**
     * 登陆
     * @param user
     * @return
     */
    @RequestMapping("login.do")
    public ModelAndView login(User user, HttpSession session) {
        if(userService.login(user)){
            session.setAttribute("user",user);
            return new ModelAndView("redirect:index");
        }else {
            return new ModelAndView("redirect:login","message","账号或密码错误！");
        }
    }

    /**s
     * 注册
     * @param user
     */
    @RequestMapping("register.do")
    public ModelAndView register(User user) {
        if (userService.register(user)){
            return new ModelAndView("redirect:index");
        }else{
            return new ModelAndView("redirect:register","message","账号已存在！");
        }
    }

}
