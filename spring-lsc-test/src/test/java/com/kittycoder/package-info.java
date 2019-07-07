package com.kittycoder;

/**
 * 单元测试目录：
 * 1. simpledemo
 * SimpleDemoTest 简单的spring使用
 * ConstructorTest 构造器注入
 * InstanceFactory 实例工厂注入
 * StaticFactory 静态工厂注入
 *
 * 2. autowiretest
 * AutowireTest1 根据type注入
 * AutowireTest2 根据beanId注入
 *
 * 3. circledependency
 * CircledependencyTest 循环依赖
 *
 * 4. awaretest
 * AwareTest 测试Aware接口
 * GetContextTest 测试SpringContext工具类
 *
 * 5. beanpostprocessor
 * BeanPostProcessorTest 测试BeanPostProcessor接口，手动加到DefaultListableBeanFactory中
 * BeanPostProcessorTest2 测试BeanPostProcessor接口，使用ApplicationContext
 *
 * 6. initializingbean
 * InitializingBeanTest 实现InitializingBean接口的方式，有侵入性
 * InitializingBeanTest2 在beans.xml中配置init-method方法（实际通过反射调用），无侵入性
 **/