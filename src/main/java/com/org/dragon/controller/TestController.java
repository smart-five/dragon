package com.org.dragon.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <Description> <br>
 *
 * @author wushangqing<br>
 * @version 1.0<br>
 * @createDate 2019/07/31 13:37 <br>
 * @see com.org.dragon.controller <br>
 */

@RestController
@RequestMapping("/test")
public class TestController {


    @GetMapping("demo")
    public Object getMyTest() {

        return null;
    }

    public static void main(String[] args) {

    }
}



