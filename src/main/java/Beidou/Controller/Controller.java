package Beidou.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ip")
public class Controller {
    @RequestMapping("route")
    public String getString(){

        return "hello beidou";
    }
}
