package com.wipro.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

		@Bean(name="StaffBean")
		public StaffBean classBean()
		{
			return new StaffBean();
		}
		@Bean(name="StudentDetails")
		public StudentDetails classBean2()
		{
			return new StudentDetails();
		}
}
