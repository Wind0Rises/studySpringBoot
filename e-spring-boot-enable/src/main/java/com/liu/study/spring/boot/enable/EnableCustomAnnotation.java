package com.liu.study.spring.boot.enable;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
@Import({CustomImportSelector.class, CustomImportBeanDefinitionRegistrar.class})
public @interface EnableCustomAnnotation {
}
