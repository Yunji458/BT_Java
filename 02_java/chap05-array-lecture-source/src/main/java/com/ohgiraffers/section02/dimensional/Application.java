package com.ohgiraffers.section02.dimensional;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        /* 설명.
         *  다차원 배열은
         *  (일반적으로 최대 3차원 정도까지 고려하며 그 이상은 우리의)
        * */

        int[][] iArr1;
        int[][] iArr2;   // 추천 X
        int iArr3[][];   // 추천 X

        iArr1 = new int[3][2];    // 크기 2짜리 1차원 배열만 관리하는 정변배열
        iArr2 = new int[3][2];    // 크기가 다룰 수 있는 1차원 배열들을 관리하는 가변배열

        /* 설명. 1. 정변 배열일 경우 */
        int num = 0;
        for (int i = 0; i < iArr1.length; i++) {
            for (int j = 0; j < iArr1[i].length; j++) {
                iArr1[i][j] += ++num;
            }
            System.out.println(Arrays.toString(iArr1[i]));
            
        }

//        for (int i = 0; i < iArr1.length; i++) {
//            System.out.println(Arrays.toString(iArr1[i]));
//        }

        /* 설명. 2. 가변 배열일 경우 */
        iArr2[0] = new int[]{1, 3};
        iArr2[1] = new int[]{10, 20, 30, 40};
        iArr2[2] = new int[]{5, 7, 1};

        for (int i = 0; i < iArr2.length; i++) {
            System.out.println(Arrays.toString(iArr2[i]));

        }

    }
}
