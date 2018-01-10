package com.steve.config;

import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2018/1/10 下午4:43
 */
@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean druidStatFilter() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new WebStatFilter());
        //过滤规则
        filterRegistrationBean.addUrlPatterns("/*");
        //不需要过滤
        filterRegistrationBean.addInitParameter("exclusions", "*.js,*.css,*.gif,*.jpg,*.ico,/druid/*");
        return filterRegistrationBean;
    }
}
