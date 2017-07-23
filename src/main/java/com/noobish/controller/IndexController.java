package com.noobish.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ibhi on 23/7/17.
 */
@RestController
public class IndexController {
    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String index() {
        return "Hello world";
    }
}
