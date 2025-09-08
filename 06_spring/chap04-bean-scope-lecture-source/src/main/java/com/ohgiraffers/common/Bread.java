package com.ohgiraffers.common;

import lombok.NoArgsConstructor;
import java.util.Date;

@NoArgsConstructor
public class Bread extends Product {
    private java.util.Date breadDate;    //생성 시간

    public Bread(String name, int price, Date breadDate) {
        super(name, price);
        this.breadDate = breadDate;
    }

    @Override
    public String toString() {
        return "Bread{" +
                "breadDate=" + breadDate +
                "} " + super.toString();
    }
}
