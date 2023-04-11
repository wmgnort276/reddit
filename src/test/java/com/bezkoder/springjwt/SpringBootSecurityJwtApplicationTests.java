package com.bezkoder.springjwt;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class SpringBootSecurityJwtApplicationTests {

	@Test
	public void contextLoads() {
	}




	@Test
	public void givenSrcAndDest_whenMaps_thenCorrect() {
		MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
		mapperFactory.classMap(Src.class, Des.class);
		MapperFacade mapper = mapperFactory.getMapperFacade();
		Src src = new Src("Baeldung", 10);
		Des dest = mapper.map(src, Des.class);
		System.out.println(dest);
	}
}
