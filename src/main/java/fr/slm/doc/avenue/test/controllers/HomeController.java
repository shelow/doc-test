package fr.slm.doc.avenue.test.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    private static final Logger LOG = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping("/")
    public String index(){
        LOG.info("open home page");
        return "index.html";
    }
}
