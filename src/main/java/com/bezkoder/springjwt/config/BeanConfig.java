package com.bezkoder.springjwt.config;

import com.bezkoder.springjwt.models.SubReddit;
import com.bezkoder.springjwt.models.User;
import com.bezkoder.springjwt.payload.response.SubRedditResponse;
import ma.glasnost.orika.BoundMapperFacade;
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

    @Bean
    public MapperFacade subRedditMapper(){
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
        mapperFactory.classMap(SubReddit.class, SubRedditResponse.class)
                .field("user.username", "username")
                .register();
        return mapperFactory.getMapperFacade();
    }
}
