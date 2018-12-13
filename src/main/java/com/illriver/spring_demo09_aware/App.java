package com.illriver.spring_demo09_aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 主体类
 *
 */
public class App {
    public static void main( String[] args ){
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);
    	AwareService awareService = context.getBean(AwareService.class);
    	awareService.outResult();
    	context.close();
    }
}
