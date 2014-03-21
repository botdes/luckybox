package ru.cleancode.luckybox.webtestapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

@Configuration
@ComponentScan(basePackages="ru.cleancode.luckybox.webtestapp")
public class AppConfig {

    @Bean
    public ServletContextTemplateResolver templateResolver() {
        final ServletContextTemplateResolver newTemplateResolver = new ServletContextTemplateResolver();
        newTemplateResolver.setPrefix("/WEB-INF/templates/");
        newTemplateResolver.setSuffix(".html");
        newTemplateResolver.setTemplateMode("HTML5");

        return newTemplateResolver;
    }

    @Bean
    public SpringTemplateEngine templateEngine() {
        final SpringTemplateEngine newTemplateEngine = new SpringTemplateEngine();
        newTemplateEngine.setTemplateResolver(templateResolver());

        return newTemplateEngine;
    }

    @Bean
    public ThymeleafViewResolver viewResolver() {
        final ThymeleafViewResolver newViewResolver = new ThymeleafViewResolver();
        newViewResolver.setTemplateEngine(templateEngine());

        return newViewResolver;
    }
}
