package com.cold.day02.d_custom;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Target 作用域  表示这个注解作用于什么地方，类、属性、方法
 * ElementType.TYPE 注解只能写在类上面
 * ElementType.METHOD  注解只能写在方法上面
 * ElementType.FIELD  注解只能写在属性上面
 * @Retention 注解保留的时间
 * @Retention(RetentionPolicy.RUNTIME)  注解保留到运行时期
 * @Retention(RetentionPolicy.CLASS)  注解保留到Class，但是jvm加载类之后,注解会被遗弃
 * @Retention(RetentionPolicy.SOURCE)  注解只保留在源文件中，当java文件编译之后，注解会被遗弃
 *
 */
@Target({ElementType.FIELD,ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    //必须定义个String属性值
    String  value();
    //不写的话加 default""
    //String  value() default"";
}
