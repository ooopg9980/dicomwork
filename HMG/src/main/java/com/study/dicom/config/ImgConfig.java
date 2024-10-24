package com.study.dicom.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ImgConfig implements WebMvcConfigurer{
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/mhg/**")
//		.addResourceLocations("file:///C:/mhg/");
		
		//맥북 경로설정
        .addResourceLocations("file:///Users/SOO/Desktop/file001/MHGimage/");
		
	}
}
