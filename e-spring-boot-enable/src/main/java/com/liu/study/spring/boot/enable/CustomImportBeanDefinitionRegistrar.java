package com.liu.study.spring.boot.enable;

import com.liu.study.spring.boot.enable.injected.MerchantService;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.util.StringUtils;

/**
 * @desc 
 * @author Liuweian
 * @createTime 2020/6/12 15:35
 * @version 1.0.0
 */
public class CustomImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        /**
         * 可以自定义规则来加载满足规则的类，比如SPI。
         */
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(MerchantService.class);
        String name = StringUtils.uncapitalize(MerchantService.class.getName());
        System.out.println(name);
        registry.registerBeanDefinition(name, rootBeanDefinition);
    }
}
