package com.ohgiraffers.section02.openclosed.resolved;

public class NaverPayPayment implements Payment {
    @Override
    public void process() {
        System.out.println("네이버페이로 결제 처리");

    }
}
