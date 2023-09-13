package com.annotation;

import java.lang.annotation.*;

/**
 * 作者：whl
 * 日期：2023-09-13 9:33
 * 描述：元注解
 */
@MyAnnotation
public class TestDemo02 {

}

//定义一个注解
//@Target：表示我们的注解可以用在哪里
//@Retention：表示注解在什么时候还有效
//@Documented：表示是否将注解生成在Javadoc中
//@Inherited：表示子类可以继承父类的元注解
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(value = RetentionPolicy.RUNTIME)
@Documented
@Inherited
@interface MyAnnotation{

}