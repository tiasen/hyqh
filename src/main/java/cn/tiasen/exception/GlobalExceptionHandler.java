package cn.tiasen.exception;

import cn.tiasen.vo.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

//    @ExceptionHandler(value = Exception.class)
//    public ModelAndView defalultErrorHandler(HttpServletRequest req,Exception e) throws Exception{
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("execption",e);
//        modelAndView.addObject("url",req.getRequestURL());
//        modelAndView.setViewName("errorPage");
//        return modelAndView;
//    }

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result defaultErrorHandler(Exception e){
        return Result.error(e.getMessage());
    }
}
