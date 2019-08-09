package com.wk.nacos.controller;

import com.alibaba.nacos.api.exception.NacosException;
import com.wk.nacos.service.DiscoveryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wangkai
 * @since JDK8
 */
@RestController
public class DiscoveryController {

    @Resource
    private DiscoveryService discoveryService;

    //http://localhost:8080/service/get?serviceName=providers:com.wk.service.account.AccountProvider

    @GetMapping(value = "service/get")
    public Object getService(@RequestParam String serviceName) {
        try {
            return discoveryService.getService(serviceName);
        } catch (NacosException e) {
            return e.getErrCode() + ", " + e.getErrMsg();
        }
    }


}
