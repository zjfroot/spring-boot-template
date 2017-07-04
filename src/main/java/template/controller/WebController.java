package template.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by jifeng on 2017-07-04.
 */
@Controller
public class WebController {

    @RequestMapping(value = "/", method = { RequestMethod.GET })
    public String index() {
        return "index";
    }
}
