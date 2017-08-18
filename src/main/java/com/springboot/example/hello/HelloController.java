package com.springboot.example.hello;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Amruta on 4/21/2017.
 */

@Component
@RestController
public class HelloController {

    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String sayHi() {
        return "Hi";
    }
}
