package com.lumen.microservice.DbConnection.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Value("${spring.datasource.db1.url}")
    private String dbAUrl;

    @Value("${spring.datasource.db1.username}")
    private String dbAUsername;

    @Value("${spring.datasource.db1.password}")
    private String dbAPassword;

    @Value("${spring.datasource.db2.url}")
    private String dbBUrl;

    @Value("${spring.datasource.db2.username}")
    private String dbBUsername;

    @Value("${spring.datasource.db2.password}")
    private String dbBPassword;

    @Bean(name = "dataSourceA")
    DataSource dataSourceA() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl(dbAUrl);
        dataSource.setUsername(dbAUsername);
        dataSource.setPassword(dbAPassword);
        return dataSource;
    }

    @Bean(name = "dataSourceB")
    DataSource dataSourceB() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl(dbBUrl);
        dataSource.setUsername(dbBUsername);
        dataSource.setPassword(dbBPassword);
        return dataSource;
    }

    @Bean(name = "jdbcTemplateA")
    JdbcTemplate jdbcTemplateA() {
        return new JdbcTemplate(dataSourceA());
    }

    @Bean(name = "jdbcTemplateB")
    JdbcTemplate jdbcTemplateB() {
        return new JdbcTemplate(dataSourceB());
    }
}
