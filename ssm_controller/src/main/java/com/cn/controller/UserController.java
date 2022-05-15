package com.cn.controller;

import com.cn.domain.LoginUser;
import com.cn.domain.User;
import com.cn.service.UserService;
import com.cn.utils.CheckCodeUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("/login")
    public ModelAndView login(LoginUser userLogin,String security,HttpSession session){
        LoginUser user = userService.login(userLogin);
        String checkcode_server = (String) session.getAttribute("CHECKCODE_SERVER");
        ModelAndView mv = new ModelAndView();
        mv.addObject("user",user);
        if (! checkcode_server.equalsIgnoreCase(security)){
            //验证码不正确
            //提示信息
            mv.addObject("msg","验证码不正确或为空请重新输入！");
            //跳转登录页面
            mv.setViewName("/index.jsp");
        }
        if (user !=null){
            mv.addObject("success","恭喜你！"+userLogin.getUsername()+"登录成功！");
            mv.setViewName("display");
        }else {
            mv.setViewName("fail");
        }
        return mv;
    }
    @RequestMapping("/delete")
    public  String delete(int id){
        userService.delete(id);
        return "redirect:/user/findAll";
    }
    @RequestMapping("/deleteSelect")
    public  String deleteSelect(int[] uid){
        userService.deleteSelect(uid);
        return "redirect:/user/findAll";
    }
    @RequestMapping("/update")
    public String update(User user){
        userService.update(user);
        return "redirect:/user/findAll";
    }
    @RequestMapping("/add")
    public String add(User user){
        userService.insert(user);
        return "redirect:/user/findAll";
    }
    @RequestMapping("/findAll")
    public ModelAndView findAll(HttpServletRequest request){
        List<User> users = userService.findAll();
        ModelAndView mv = new ModelAndView();
        request.setAttribute("users",users);
        mv.setViewName("all_list");
        return mv;
    }
    @RequestMapping("/findByNameAndAddressAndEmail")
    public ModelAndView findByNameAndAddressAndEmail(String name,String address,String email,HttpServletRequest request){
        List<User> partSelect = userService.findByNameAndAddressAndEmail(name, address, email);
        ModelAndView mv = new ModelAndView();
        request.setAttribute("partSelect",partSelect);
        mv.setViewName("partSelect_list");
        return mv;
    }

    @RequestMapping("/findUserByPage")
    public ModelAndView findUserByPage(int currentPage, HttpServletRequest request){
        PageHelper.startPage(currentPage,5); //设置分页相关参数必须放在查询所有用户之前，其作用是限制查询范围。
        List<User> userList = userService.findAll();
        PageInfo<User> pageInfo = new PageInfo<>(userList);
        ModelAndView mv = new ModelAndView();
        request.setAttribute("pageInfo",pageInfo);
        request.setAttribute("userList",userList);
        mv.setViewName("paging_list");
        return mv;
    }
    @RequestMapping("/find")
    public ModelAndView find(int id,HttpServletRequest request){
        User user = userService.find(id);
        ModelAndView mv = new ModelAndView();
        request.setAttribute("User",user);
        mv.setViewName("update");
        return mv;
    }

    @RequestMapping("/checkCode")
    @ResponseBody
    public void checkCode(HttpServletResponse response, HttpSession session){
        //服务器通知浏览器不要缓存
        response.setHeader("pragma","no-cache");
        response.setHeader("cache-control","no-cache");
        response.setHeader("expires","0");

        //在内存中创建一个长80，宽30的图片，默认黑色背景
        //参数一：长
        //参数二：宽
        //参数三：颜色
        int width = 80;
        int height = 30;
        BufferedImage image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);

        //获取画笔
        Graphics g = image.getGraphics();
        //设置画笔颜色为灰色
        g.setColor(Color.GRAY);
        //填充图片
        g.fillRect(0,0, width,height);

        //产生4个随机验证码，12Ey
        String checkCode = CheckCodeUtils.getCheckCode();
        //将验证码放入HttpSession中
        session.setAttribute("CHECKCODE_SERVER",checkCode);

        //设置画笔颜色为黄色
        g.setColor(Color.YELLOW);
        //设置字体的小大
        g.setFont(new Font("黑体",Font.BOLD,24));
        //向图片上写入验证码
        g.drawString(checkCode,15,25);

        //将内存中的图片输出到浏览器
        //参数一：图片对象
        //参数二：图片的格式，如PNG,JPG,GIF
        //参数三：图片输出到哪里去
        try {
            ImageIO.write(image,"PNG",response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
