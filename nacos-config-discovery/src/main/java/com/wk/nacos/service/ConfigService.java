package com.wk.nacos.service;

import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;
import org.springframework.stereotype.Service;

/**
 * @author wangkai
 * @since JDK8
 */
@Service
public class ConfigService {

    @NacosValue(value = "${username1:true23}", autoRefreshed = true)
    private String username;

    public Object getConfig() {
        return username;
    }

}
