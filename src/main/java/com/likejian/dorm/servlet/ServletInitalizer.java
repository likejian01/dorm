package com.likejian.dorm.servlet;

import com.likejian.dorm.DormApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitalizer extends SpringBootServletInitializer {

    @Override
    protected final SpringApplicationBuilder configure(final SpringApplicationBuilder application) {
        return application.sources(DormApplication.class);
    }
}
