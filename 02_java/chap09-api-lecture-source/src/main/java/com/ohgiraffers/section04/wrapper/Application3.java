package com.ohgiraffers.section04.wrapper;

public class Application3 {
    public static void main(String[] args) {

        String b = Byte.valueOf((byte)1).toString();
        String s = Short.valueOf((byte)2).toString();
        String i = Integer.valueOf((byte)4).toString();
        String l = Long.valueOf((byte)8L).toString();
        String f = Float.valueOf((byte)4.0f).toString();
        String d = Double.valueOf((byte)8.0).toString();
        String isTrue = Boolean.valueOf(true).toString();
        String ch = Character.valueOf('a').toString();

        String byteStre = (byte)1 + "";

    }
}
