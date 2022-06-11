package com.java9.diamondoperator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author wxg
 * @date 2022/5/24-15:47
 * @quotes 小不忍则乱大谋
 */
public class OperatorImprove {
    public static void main(String[] args) {
    }


    //java9特性五：钻石操作符的升级
    @Test
    public void test2() {
        //钻石操作符与匿名内部类在java 8中不能共存。在java9可以。
        Comparator<Object> com = new Comparator<>() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };
        //jdk7中的新特性：类型推断
        ArrayList<String> list = new ArrayList<>();
    }
}
