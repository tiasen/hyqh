package cn.tiasen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model) throws Exception {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = dateFormat.format(new Date());
        model.addAttribute("now",s);
        if(true){
            throw new RuntimeException("hello");
        }
        return "hello";
    }
}
