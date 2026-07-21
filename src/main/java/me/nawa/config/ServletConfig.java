package me.nawa.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@ComponentScan(basePackages = {
        "me.nawa.auth.exception",
        "me.nawa.common.exception",
        "me.nawa.event.exception",
        "me.nawa.journey.exception",
        "me.nawa.map.exception",
        "me.nawa.member.exception",
        "me.nawa.wallet.exception"})
public class ServletConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/")
//                .setViewName("forward:/resources/index.html");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry
//                .addResourceHandler("/resources/**")     // url이 /resources/로 시작하는 모든 경로
//                .addResourceLocations("/resources/");    // webapp/resources/경로로 매핑
    }
}
