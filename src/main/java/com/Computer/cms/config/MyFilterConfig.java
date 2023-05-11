package com.Computer.cms.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Configuration;

import com.Computer.cms.filter.MyNewFilter;

@Configuration
public class MyFilterConfig {
    
    public FilterRegistrationBean<MyNewFilter> registrationBean(){

        FilterRegistrationBean<MyNewFilter> registrationBean=new FilterRegistrationBean<>();

        registrationBean.setFilter(new MyNewFilter());
        registrationBean.addUrlPatterns("/customer/*");

        return registrationBean;
    }

}
