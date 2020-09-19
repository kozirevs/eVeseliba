package com.java7.eveseliba.interceptor;

import com.java7.eveseliba.model.Log;
import com.java7.eveseliba.service.LogService;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.nio.charset.StandardCharsets;
import java.util.Date;

@Component
public class RestControllerInterceptor extends HandlerInterceptorAdapter {
    private Logger logger = LoggerFactory.getLogger(RestControllerInterceptor.class);

    @Value("${environment}")
    private String environment;

    private final LogService logService;

    public RestControllerInterceptor(LogService logService) {
        this.logService = logService;
    }
    Log log = new Log();

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {
        logger.info("Enter preHandler interceptor.");
        log.setDate(new Date());
        log.setEnvironment(environment);
        log.setMethod(request.getMethod());
        log.setMessage("Message");
        log.setRequestIpV6(request.getRemoteAddr());
        log.setUrl(request.getRequestURL().toString());
        log.setResult("REQUEST");

        String requestBody = IOUtils.toString(request.getInputStream(), StandardCharsets.UTF_8);
        log.setRequestJson(requestBody);

        logService.saveLog(log);

        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response,
                                Object handler,
                                Exception ex) throws Exception {

    }
}
