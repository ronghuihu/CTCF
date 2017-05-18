package com.tedu.shiro;

import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/6/1.
 */
@Configuration
public class ShiroConfiguration {

    private static Map<String, String> filterChainDefinitionMap = new LinkedHashMap<String, String>();

    @Bean(name = "lifeCycleBeanProcessor")
    public LifecycleBeanPostProcessor getLifecycleBeanPostProcessor() {
        return new LifecycleBeanPostProcessor();
    }

    /*不知是否需要depends-on,待定*/
    @Bean
    @DependsOn("lifeCycleBeanProcessor")
    public DefaultAdvisorAutoProxyCreator getDefaultAdvisorAutoProxyCreator() {
        DefaultAdvisorAutoProxyCreator daap = new DefaultAdvisorAutoProxyCreator();
        daap.setProxyTargetClass(true);
        return daap;
    }


    @Bean(name = "securityManager")
    public DefaultWebSecurityManager getDefaultWebSecurityManager() {
        DefaultWebSecurityManager dwsm = new DefaultWebSecurityManager();
        dwsm.setRealm(getShiroRealm());
        return dwsm;
    }


    @Bean(name = "AuthRealm")
    public AuthRealm getShiroRealm() {
        AuthRealm realm = new AuthRealm();
        realm.setCredentialsMatcher(getAuthCredential());
        return realm;
    }


    @Bean(name = "credentialsMatcher")
    public AuthCredential getAuthCredential() {
        return new AuthCredential();
    }


    @Bean
    public AuthorizationAttributeSourceAdvisor getAuthorizationAttributeSourceAdvisor(DefaultWebSecurityManager securityManager) {
        AuthorizationAttributeSourceAdvisor aasa = new AuthorizationAttributeSourceAdvisor();
        aasa.setSecurityManager(securityManager);
        return aasa;
    }


    @Bean(name = "shiroFilter")
    public ShiroFilterFactoryBean getShiroFilterFactoryBean() {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(getDefaultWebSecurityManager());
        shiroFilterFactoryBean.setLoginUrl("/index.jsp");
//        shiroFilterFactoryBean.setSuccessUrl("/map");

        filterChainDefinitionMap.put("/staticfile/**", "anon");
        filterChainDefinitionMap.put("/tologin", "anon");
        filterChainDefinitionMap.put("/toregist", "anon");
        filterChainDefinitionMap.put("/toregist.action", "anon");
        filterChainDefinitionMap.put("/regist", "anon");
        filterChainDefinitionMap.put("/regist.action", "anon");
        filterChainDefinitionMap.put("/tologin.action", "anon");
        filterChainDefinitionMap.put("/login.action", "anon");
        filterChainDefinitionMap.put("/zhejiang.action", "anon");
        filterChainDefinitionMap.put("/toCityCultureController.action", "anon");
        filterChainDefinitionMap.put("/map.action", "anon");
        filterChainDefinitionMap.put("/toWall.action", "anon");
        filterChainDefinitionMap.put("/toCulturyInfo", "anon");
        filterChainDefinitionMap.put("/**", "authc");


        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
        return shiroFilterFactoryBean;
    }


    @Bean
    public AuthorizationAttributeSourceAdvisor getAuthorizationAttributeSourceAdvisor() {
        AuthorizationAttributeSourceAdvisor aasa = new AuthorizationAttributeSourceAdvisor();
        aasa.setSecurityManager(getDefaultWebSecurityManager());
        return new AuthorizationAttributeSourceAdvisor();
    }


}
