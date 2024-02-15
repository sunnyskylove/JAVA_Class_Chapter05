package com.ohgiraffers.section03.sort;

public class Application01 {
    public static void main(String[] args) {

        /* 수업목표. 변수의 두 값을 변경하는 방법에 대해 알 수 있다. */
        /* 필기. 변수의 두 값 변경하기 */

        int num1 = 10;
        int num2 = 20;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // 두 변수의 값을 바꾸기 위해 다른 변수 한 개를 만든다.
        int temp;               // 두 상자 안에  각각 10, 20 값을 바꾸고 싶을때 떠올리자~
        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        // num1과 num2의 값의 위치만 바뀌게 된 것이다.

        int[] arr = {2, 1, 3};      // ▼ {1,2,3} 으로 순서 바꾸고 싶을때 방법!!

        int temp2;   // 임의의 수인 temp2를 미리 만든다.
        temp2 = arr[0];
        arr[0] = arr[1];
        arr[1] = temp2;

        for(int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
        }

    }

}
