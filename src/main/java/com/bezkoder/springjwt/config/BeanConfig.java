package com.bezkoder.springjwt.config;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class BeanConfig {
    @Bean
    public MapperFacade mapper(){
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
//        mapperFactory.getConverterFactory().registerConverter();
        return mapperFactory.getMapperFacade();
    }
}
