package com.ohgiraffers.section04.override;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SubClass extends SuperClass {

    /* 설명. 부모 클래스의 메소드와 동일한 레벨의 예외 throws 시 문제 없음 */
//    @Override
//    public void method()  {
//    }

    /* 설명. 부모 클래스의 메소드에서 발생한 예외보다 자식 타입은 가능 (feat. 더 적은 예외 발생) */
    @Override
    public void method() throws FileNotFoundException {

    }

    /* 설명. 부모 클래스의 메소드에서 발생한 예외보다 부모 타입은 불가능 (feat. 더 많은 예외 발생)*/
//    @Override
//    public void method() throws Exception{
//
//    }
}