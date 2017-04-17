package com.lee.springbootdemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by 李士军 on 2017/4/17.
 */
@ConfigurationProperties(prefix = "druid" )
public class DruidConfigProperties {


    @Value("${druid.url}")
    private String url ;

    @Value("${druid.driverClassName}")
    private String driverClassName;

    @Value("${druid.username}")
    private String username ;

    @Value("${druid.password}")
    private String password ;

    @Value("${druid.initialSize}")
    private int initialSize ;

    @Value("${druid.maxActive}")
    private int maxActive ;

    @Value("${druid.minIdle}")
    private int minIdle  ;

    @Value("${druid.maxWait}")
    private Long maxWait ;

    @Value("${druid.validationQuery}")
    private String validationQuery ;

    @Value("${druid.testOnBorrow}")
    private boolean testOnBorrow ;

    @Value("${druid.testOnReturn}")
    private boolean testOnReturn ;

    @Value("${druid.testWhileIdle}")
    private boolean testWhileIdle ;

    @Value("${druid.timeBetweenEvictionRunsMillis}")
    private Long timeBetweenEvictionRunsMillis ;

    @Value("${druid.minEvictableIdleTimeMillis}")
    private Long minEvictableIdleTimeMillis ;

    @Value("${druid.removeAbandoned}")
    private boolean removeAbandoned  ;

    @Value("${druid.removeAbandonedTimeout}")
    private Integer removeAbandonedTimeout ;

    @Value("${druid.logAbandoned}")
    private boolean logAbandoned ;

    @Value("${druid.filters}")
    private String filters ;


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getInitialSize() {
        return initialSize;
    }

    public void setInitialSize(int initialSize) {
        this.initialSize = initialSize;
    }

    public int getMaxActive() {
        return maxActive;
    }

    public void setMaxActive(int maxActive) {
        this.maxActive = maxActive;
    }

    public int getMinIdle() {
        return minIdle;
    }

    public void setMinIdle(int minIdle) {
        this.minIdle = minIdle;
    }

    public Long getMaxWait() {
        return maxWait;
    }

    public void setMaxWait(Long maxWait) {
        this.maxWait = maxWait;
    }

    public String getValidationQuery() {
        return validationQuery;
    }

    public void setValidationQuery(String validationQuery) {
        this.validationQuery = validationQuery;
    }

    public boolean isTestOnBorrow() {
        return testOnBorrow;
    }

    public void setTestOnBorrow(boolean testOnBorrow) {
        this.testOnBorrow = testOnBorrow;
    }

    public boolean isTestOnReturn() {
        return testOnReturn;
    }

    public void setTestOnReturn(boolean testOnReturn) {
        this.testOnReturn = testOnReturn;
    }

    public boolean isTestWhileIdle() {
        return testWhileIdle;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public void setTestWhileIdle(boolean testWhileIdle) {
        this.testWhileIdle = testWhileIdle;
    }

    public Long getTimeBetweenEvictionRunsMillis() {
        return timeBetweenEvictionRunsMillis;
    }

    public void setTimeBetweenEvictionRunsMillis(Long timeBetweenEvictionRunsMillis) {
        this.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
    }

    public Long getMinEvictableIdleTimeMillis() {
        return minEvictableIdleTimeMillis;
    }

    public void setMinEvictableIdleTimeMillis(Long minEvictableIdleTimeMillis) {
        this.minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;
    }

    public boolean isRemoveAbandoned() {
        return removeAbandoned;
    }

    public void setRemoveAbandoned(boolean removeAbandoned) {
        this.removeAbandoned = removeAbandoned;
    }

    public Integer getRemoveAbandonedTimeout() {
        return removeAbandonedTimeout;
    }

    public void setRemoveAbandonedTimeout(Integer removeAbandonedTimeout) {
        this.removeAbandonedTimeout = removeAbandonedTimeout;
    }

    public boolean isLogAbandoned() {
        return logAbandoned;
    }

    public void setLogAbandoned(boolean logAbandoned) {
        this.logAbandoned = logAbandoned;
    }

    public String getFilters() {
        return filters;
    }

    public void setFilters(String filters) {
        this.filters = filters;
    }
}
