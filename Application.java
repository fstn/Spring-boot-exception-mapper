package com.itesoft.t4html;

import com.itesoft.t4html.service.*;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import javax.inject.Named;
import javax.ws.rs.ApplicationPath;

/**
 * Created by stephen on 18/03/2016.
 */
@SpringBootApplication
public class Application
{

    @Named
    @ApplicationPath("/rest")
    public static class JerseyConfig extends ResourceConfig
    {

        public JerseyConfig() {
            packages("com.itesoft.t4html");
            this.register(BlocksService.class);
            this.register(PackagesService.class);
            this.register(GeneratorsService.class);
            this.register(ExportService.class);
            this.register(FilesService.class);
            this.register(CheckService.class);
            this.register(ExposeService.class);

        }
    }

    @Bean
    public FilterRegistrationBean contextFilterRegistrationBean() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        AccessControlAllowOriginFilter contextFilter = new AccessControlAllowOriginFilter();
        registrationBean.setFilter(contextFilter);
        registrationBean.setOrder(1);
        return registrationBean;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}