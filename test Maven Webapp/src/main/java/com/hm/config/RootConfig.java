package com.hm.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages={"com.hm"},excludeFilters= {
		@Filter(type=FilterType.ANNOTATION,value=EnableWebMvc.class)})
public class RootConfig {

	
	@Bean
	public DataSource dataSource() {
		
		BasicDataSource basicDataSource=new BasicDataSource();
		
		basicDataSource.setDriverClassName("com.mysql.jdbc.Driver");
		
		basicDataSource.setUrl("jdbc:mysql://localhost:3306/schoollist");

		basicDataSource.setUsername("piliang");
		
		basicDataSource.setPassword("12345678");
		//开始初始化连接池数量
		basicDataSource.setInitialSize(3);
		return basicDataSource;	
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate jdbcTemplate =new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource());
		return jdbcTemplate;
	}
}
