package com.zone.manage.Controller;

import com.zone.manage.Config.properties.ZoneProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/demo")
public class DemoController {

    private static Logger logger=LoggerFactory.getLogger(DemoController.class);

    @Resource
    private ZoneProperties zoneProperties;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public  String hello(){
        return "hello1.html";
    }

    /**
     * 读取配置文件内容
     * @return
     */
    @RequestMapping(value = "/config",method = RequestMethod.GET)
    @ResponseBody
    public  String config(){
        String zonrhost=zoneProperties.getZoneHost();
        return zonrhost;
    }

    /**
     * 读取配置文件内容
     * @return
     */
    @RequestMapping(value = "/logback",method = RequestMethod.GET)
    @ResponseBody
    public  String logback(){
        logger.debug("debug----输出");
        logger.info("info----输出");
        logger.warn("warn----输出");
        logger.error("error----输出");
        return "输入日志";
    }

}
