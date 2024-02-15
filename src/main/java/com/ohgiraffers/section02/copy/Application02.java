package com.ohgiraffers.section02.copy;

public class Application02 {
    public static void main(String[] args) {

        /* 수업목표. 얕은 복사를 활용하여 매개변수와 리턴값으로 활용할 수 있다. */

        /* 필기.
        *   얕은 복사의 활용
        *   얕은 복사를 활용하는 것은 주로 메소드 호출 시 (전달)인자로 사용하는 경우와
        *   리턴값으로 동일한 배열을 리턴 해주고 싶은 경우 사용한다.
        * */

        String[] names = {"조평훈", "이순신", "홍길동"};

        /* 필기. 얕은 복사 확인을 위한 hashCode 출력 */
        System.out.println("names의 hashCode : " + names.hashCode());

        /* 목차. 1. 인자와 매개변수로 활용 */
        print(names );               // print 전달인자 ▼

        /* 목차. 2. 리턴값으로 활용  */
        String[] animals = getAnimals();        // 밑에 리턴값이 둥둥 떠다니지 않게 배열 입력해줘야함!(착지)

        System.out.println("리턴 받은 animals의 hashCode : " + animals.hashCode());

        print(animals);

    }

    public static void print(String[] sarr){        // ▲ 매개변수

        /*필기. 전달 받은 배열의 hashCode 출력 */
        System.out.println("sarr의 hasCode : " + sarr.hashCode());

        /* 필기. 전달 받은 배열의 값 출력 */
        for(int i = 0; i < sarr.length; i++){
            System.out.println(sarr[i]);

        }

        System.out.println();

    }

    public static String[] getAnimals(){

        String[] animals = new String[]{"낙타", "호랑이", "나무늘보"};

        System.out.println("새로 만든 animals의 hashCode : " + animals.hashCode());

        return animals;        //void로 안했기 때문에 값(animals)을 가지고 돌아가야 한다!(근데 main메소드 안쪽으로 입력 안해주면 둥둥 떠있는 상태)

    }

}