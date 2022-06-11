package com.java9.privatemethodofinterface;

/**
 * @author shkstart
 * @create 2019 下午 2:25
 */
public interface MyInterface {
    static void methodStatic() {
        System.out.println("我是接口中的静态方法");
    }

    //如下的三个方法的权限修饰符都是public
    void methodAbstract();

    default void methodDefault() {
        System.out.println("我是接口中的默认方法");
        methodPrivate();
    }

    //jdk 9中允许接口中定义私有的方法
    private void methodPrivate() {
        System.out.println("我是接口中的私有方法");
    }
}
