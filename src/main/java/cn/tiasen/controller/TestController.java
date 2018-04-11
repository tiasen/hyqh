package cn.tiasen.controller;

import cn.tiasen.vo.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {

    @GetMapping("/helloworld")
    public String helloworld() throws Exception {
        if(true){
            throw new Exception("1234");
        }
        return "helloworld123";
    }

    @GetMapping("/s1")
    public Result s1(){
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("a",1);
        map.put("b",2);
        return Result.success(map);
    }

}
