package com.lee.springbootdemo.config;

import com.alibaba.druid.pool.DruidDataSource; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.sql.DataSource;

/**
 * Created by 李士军 on 2017/4/17.
 */
@Configuration
@EnableConfigurationProperties(DruidConfigProperties.class)
@EnableTransactionManagement
@AutoConfigureBefore(DataSourceAutoConfiguration.class)
@EnableWebMvc
public class DruidDataSourceConfig {

    @Autowired
    private DruidConfigProperties properties;

    @Bean(initMethod = "init",destroyMethod = "close")
    public DataSource dataSource()
    {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(properties.getUrl());
        dataSource.setUsername(properties.getUsername());
        dataSource.setPassword(properties.getPassword());
        dataSource.setInitialSize(properties.getInitialSize());
        dataSource.setMaxActive(properties.getMaxActive());
        dataSource.setMinIdle(properties.getMinIdle());
        dataSource.setMaxWait(properties.getMaxWait());
        dataSource.setDriverClassName(properties.getDriverClassName());
        if(properties.getValidationQuery()!=null&& !properties.getValidationQuery().isEmpty())
        {
            dataSource.setValidationQuery(properties.getValidationQuery());
        }
        dataSource.setTestOnBorrow(properties.isTestOnBorrow());
        dataSource.setTestOnReturn(properties.isTestOnReturn());
        dataSource.setTestWhileIdle(properties.isTestWhileIdle());
        dataSource.setTimeBetweenEvictionRunsMillis(properties.getTimeBetweenEvictionRunsMillis());
        dataSource.setMinEvictableIdleTimeMillis(properties.getMinEvictableIdleTimeMillis());
        dataSource.setRemoveAbandoned(properties.isRemoveAbandoned());
        dataSource.setRemoveAbandonedTimeout(properties.getRemoveAbandonedTimeout());
        dataSource.setLogAbandoned(properties.isLogAbandoned());
        if(properties.getFilters()!=null&& !properties.getFilters().isEmpty())
        {
          //  dataSource.setValidationQuery(properties.getFilters());
        }else
        {
          //  dataSource.setValidationQuery("stat");
        }
        return  dataSource;
    }

}
