package com.config.server.limit_service.controller;

import com.config.server.limit_service.bean.Limits;
import com.config.server.limit_service.configuration.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LimitsController {
    @Autowired
    private LimitConfiguration config;

    @GetMapping("/limits")
    public Limits retriveLimits(){
        return  new Limits(config.getMinimum(),config.getMaximum());
    }
}
