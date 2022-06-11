package com.java9.moduletest;

import bean.Person;

/**
 * @author wxg
 * @date 2022/5/24-14:54
 * @quotes 小不忍则乱大谋
 */
public class ModuleTest {
    public static void main(String[] args) {
        final Person person = new Person("zhangsan", 18);
        System.out.println(person);
    }
}
