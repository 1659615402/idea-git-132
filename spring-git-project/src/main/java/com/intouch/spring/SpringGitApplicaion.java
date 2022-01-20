package com.intouch.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:李少鹏
 * @date:2022/1/20,14:46
 * @version:1.0
 */
public class SpringGitApplicaion {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("helloGit");
        System.out.println("update1");
        System.out.println("update2");
    }
}
