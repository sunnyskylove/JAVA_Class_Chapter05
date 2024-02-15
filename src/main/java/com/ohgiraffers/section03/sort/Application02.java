package com.ohgiraffers.section03.sort;

public class Application02 {
    public static void main(String[] args) {

        /* 수업목표. 순차 정렬에 대해 이해하고 활용할 수 있다. */
        /* 필기.
         *   순차정렬이란, 정렬 알고리즘에서 가장 간단하고 기본이 되는 알고리즘으로,
         *   배열의 처음과 끝을 탐색하면서 차순대로 정렬하는 가장 기초적인 정렬 알고리즘이다.
         * */

        int[] iarr = {2, 5, 4, 6, 1, 3};

        /*필기.
         *  인덱스를 한 개씩 증가시키는 반복문
         *  첫 번쨰 인덱스는 비교할 필요가 없어서 1번부터 시작
         * */

        // 인덱스가 증가할 때마다 처음부터 인덱스까지 값을 비교하는 반복문
        for (int i = 1; i < iarr.length; i++) {    // 1조건문에서 초기화 비교 만들기
            for (int j = 0; j < i; j++) {          // 2조건문에서 1조건문보다 작음 만들기
                // 이중 for 문 만들어짐
                // {}안 숫자가 한개씩 실행 되서 true로 맞을때까지 실행되므로, 결국 작은거에서 큰숫자로 변경이 됨

                if (iarr[i] < iarr[j]) {     // true면, if 안에 있는 값을 실행할 것임
                                            // 하지만 false이기 때문에 값을 ▼ 변경해준다.

                    int temp;
                    temp = iarr[i];
                    iarr[i] = iarr[j];
                    iarr[j] = temp;

                }
            }

        }

        for (int i = 0; i < iarr.length; i++) {

            System.out.print(iarr[i] + " ");

        }

    }

}
