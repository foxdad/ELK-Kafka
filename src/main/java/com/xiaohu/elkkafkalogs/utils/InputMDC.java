package com.xiaohu.elkkafkalogs.utils;



import org.jboss.logging.MDC;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @author XiaoHu
 * @version v1.0.0
 * @Package : com.xiaohu.elk.log.utils
 * @Description : log4j的自定义属性设置值
 * @Create on : 2020/11/29 21:43
 **/
@Component
public class InputMDC implements EnvironmentAware {

    private static Environment environment;

    @Override
    public void setEnvironment(Environment environment) {
        InputMDC.environment = environment;
    }

    public static void putMDC () {

        MDC.put("hostname",NetUtil.getLocalHostName());
        MDC.put("ip",NetUtil.getLocalIp());
        MDC.put("applicationName",environment.getProperty("spring.application.name"));
    }
}
