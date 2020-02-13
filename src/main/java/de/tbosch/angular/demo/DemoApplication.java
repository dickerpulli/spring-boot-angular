package de.tbosch.angular.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.tuckey.web.filters.urlrewrite.UrlRewriteFilter;

import javax.servlet.FilterConfig;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public FilterRegistrationBean<UrlRewriteFilter> loggingFilter() {
        FilterRegistrationBean<UrlRewriteFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new UrlRewriteFilter());
        registrationBean.addUrlPatterns("/**/*");
        return registrationBean;
    }

}
