package com.companyname.springapp.web.controllers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    protected final Log logger = LogFactory.getLog(getClass());

    @RequestMapping("/")
    public ModelAndView home() {
        logger.info("Returning index view");
        return new ModelAndView("index");
    }
}
