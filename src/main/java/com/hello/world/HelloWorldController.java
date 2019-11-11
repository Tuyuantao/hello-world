package com.hello.world;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * desc:
 *
 * @author tuyuantao
 * @version 1.0.0
 * @date 2019-11-11
 */
@RestController
public class HelloWorldController {

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String hello() {
        return "hello world";
    }

    @RequestMapping(value = "/")
    @ResponseBody
    public String index() {
        return "hello world";
    }
}
