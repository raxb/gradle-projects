package com.example.gradle;

import org.apache.commons.codec.digest.DigestUtils;

public class GradleApplication {
    public static void main(String[] args) {
        System.out.println("Hi, This application has been build via Gradle build tool!");
        System.out.println(DigestUtils.sha256("P@$$c0d3"));
    }
}
