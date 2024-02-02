package com.hexaware.beanindetail;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean(name={"addressBean","address"})
	public Address address()
	{
		return new Address();
	}
	@Bean(initMethod="init",destroyMethod="destroy")
	public Student student()
	{
		return new Student(address());
	}

}
