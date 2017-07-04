package template.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jifeng on 2017-07-04.
 */
@RestController
@RequestMapping(value="/api/")
public class ApiController {
    @RequestMapping(value = "/example", method = { RequestMethod.GET })
    public String tfa(){
        return "{\"status\":\"OK\"}";
    }
}
