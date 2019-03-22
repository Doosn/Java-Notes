package com.swu.leosanqing.annotation;

import java.lang.annotation.*;

// 表示作用在类上
@Target(ElementType.PARAMETER)
// 定义在什么时候启用，表示在运行中启用
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyRequestParam {
    String value() default "";
}
