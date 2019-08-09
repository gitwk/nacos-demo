package com.wk.nacos.controller;

import com.alibaba.nacos.api.exception.NacosException;
import com.wk.nacos.service.ConfigService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wangkai
 * @since JDK8
 */
@RestController
public class ConfigController {

    @Resource
    private ConfigService configService;

    @GetMapping(value = "config/get")
    public Object getConfig() {
        return configService.getConfig();
    }

}
