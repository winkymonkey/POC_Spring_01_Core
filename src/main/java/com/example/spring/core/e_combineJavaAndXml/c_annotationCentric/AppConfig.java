package com.example.spring.core.e_combineJavaAndXml.c_annotationCentric;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;


@Configuration
@ImportResource("classpath:/com/example/spring/core/e_combineJavaAndXml/c_annotationCentric/Beans.xml")
public class AppConfig {
	
}
