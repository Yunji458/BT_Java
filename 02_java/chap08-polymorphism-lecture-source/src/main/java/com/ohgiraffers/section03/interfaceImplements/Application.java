package com.ohgiraffers.section03.interfaceImplements;

public class Application {
    public static void main(String[] args) {
        Product product = new Product();
        product.nonStaticMethod(1);

        /* 설명. 추상클래스와 마찬가지로 생성자를 활용헌 객체 생성 X (생성자 자체가 X) */
//        InterProduct i = new InterProduct();

        InterProduct inter = new Product();
        inter.nonStaticMethod(2);
    }
}
