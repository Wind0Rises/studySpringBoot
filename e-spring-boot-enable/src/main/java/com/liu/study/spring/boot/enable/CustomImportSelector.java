package com.liu.study.spring.boot.enable;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @desc 
 * @author Liuweian
 * @createTime 2020/6/12 15:18
 * @version 1.0.0
 */
public class CustomImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.liu.study.spring.boot.enable.injected.UserService"};
    }

}
