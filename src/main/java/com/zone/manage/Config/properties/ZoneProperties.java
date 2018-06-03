package com.zone.manage.Config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 配置文件
 */
@Component
@ConfigurationProperties(prefix = "zone")
public class ZoneProperties {


    private String zoneHost; //项目域名

    public String getZoneHost() {
        return zoneHost;
    }

    public void setZoneHost(String zoneHost) {
        this.zoneHost = zoneHost;
    }
}
