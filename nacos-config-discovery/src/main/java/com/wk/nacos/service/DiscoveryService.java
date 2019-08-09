package com.wk.nacos.service;

import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;
import org.springframework.stereotype.Service;

/**
 * @author wangkai
 * @since JDK8
 */
@Service
public class DiscoveryService {

    @NacosInjected
    private NamingService namingService;

    public Object getService(String serviceName) throws NacosException {
        return namingService.getAllInstances(serviceName);
    }

}
