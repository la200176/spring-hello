package org.ludi.springhello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @RequestMapping("/rest")
    public String helloRest() {
        return "Mahlzeit";
    }
}
