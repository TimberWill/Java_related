package com.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 作者：whl
 * 日期：2023-09-13 10:51
 * 描述：自定义注解
 */
public class TestDemo03 {
    //注解可以显式赋值，如果没有默认值，就必须给注解赋值
    @MyAnnotation3(name = "TimberWill")
    public void test(){}

    @MyAnnotation4("啊")
    public void test2(){}

}

//自定义注解
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation3{
    //注解的参数：参数类型+参数名（）；
    //如果写了默认值，就不用写注解的参数
    String name() default "";
    int age() default 0;
    int id() default -1;//如果默认值为-1，代表不存在
    String[] school() default {"清华大学", "华东师范大学"};
}

//如果注解只有一个参数，建议用value()命名，只有value()可以省略。并且在使用的时候可以省略参数名，直接写值
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation4{
    String value();
}