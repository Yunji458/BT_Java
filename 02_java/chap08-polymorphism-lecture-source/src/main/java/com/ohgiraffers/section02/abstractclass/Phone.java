package com.ohgiraffers.section02.abstractclass;

public class Phone extends Product {

    public Phone() {
        super();
    }

    @Override
    public void abstractMMethod() {

        System.out.println("안 빼먹고 오버라이딩 잘 했다잉!~");
    }
}
