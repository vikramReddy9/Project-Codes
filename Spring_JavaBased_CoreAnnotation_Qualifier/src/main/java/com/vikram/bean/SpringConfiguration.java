package com.vikram.bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.vikram.bean")
@ComponentScan("com.vikram.service")
public class SpringConfiguration {

}
