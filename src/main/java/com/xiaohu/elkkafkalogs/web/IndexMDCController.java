package com.xiaohu.elkkafkalogs.web;


import com.xiaohu.elkkafkalogs.utils.InputMDC;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XiaoHu
 * @version v1.0.0
 * @Package : com.xiaohu.elk.log.utils
 * @Description : 测试
 * @Create on : 2020/11/29 22:19
 **/
@Slf4j
@RestController
public class IndexMDCController {

    @RequestMapping("/index")
    public String index () {
        InputMDC.putMDC();

        log.info("info级别测试");

        log.error("error级别测试");

        log.warn("warn级别测试");

        return "success";
    }
    @RequestMapping("/err")
    public String error (){
        InputMDC.putMDC();

        log.error("error级别输出");

        int e = 10/0;

        return "error";
    }
}
