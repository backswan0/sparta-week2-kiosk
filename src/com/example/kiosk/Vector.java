package com.example.kiosk;

// call by value
// call by reference

public class Vector {
    public int x;
    public int y;

    public Vector () {}

    public void addByValue (int numOne, int numTwo) {
        numOne = numOne + numTwo;
        // 객체가 아닌 원시 타입은(기본형) stack에 들어간다
        // 후입선출
        // stack 포인트만 띡 올리고 딱 내리면
        // 지역 변수, 함수 호출 -> 자동으로 되니까
        // stack에 저장된 데이터는 생명주기가 짧다.
        // 쓰레드마다 stack이 생긴다.
        // static은 메서드 영역에 저장된다.
    }

    // 어떤 메서드에 객체를 넘겨주었는데, 설정을 해야 한다면 넘겨받은 vector 값이 변할 수 있다는 점만 인지하면 된다.
    // == List를 생각해보자
    // 어느 곳에 넘겨주어도 주솟값을 넘겨줬기 때문에 main에서 리스트를 선언하고 벡터에서 값을 변경하면, 메인에서 선언한 리스트 안에
    // 있는 값도 변경이 된다는 점만 이해하면..! 잘못 쓸 일도 없고, 그걸 이용해서 코딩할 수도 있다..!
    // 깊은 복사 / 얕은 복사 꼭 같이 확인해주기
    // "주소값을 가져왔으니까, 값을 변경하면 원본의 객체도 변경되겠구나...!!!!!"
    public void addByReference (Vector vector, int number) {
        vector.x = vector.x + number;
    }

    public static void main(String[] args) {
        Vector example = new Vector();
        // 객체가 있는 방의 주소가 heap에 저장된다 (= 호텔에서 보관하는 열쇠 방)
        // 스위트룸이든 어디든 객체가 산다..!
        // 적합한 빈 공간 크기를 검색해야 한다
        // stack은 신경 쓸 필요가 없지만 heap은 사람 또는 가비지 콜렉터가 관리해야 한다. (일명 저승사자)
        // Q: stack이 왜 heap보다 빠를까?
        // 그래서 객체 같은 동적인 데이터는 heap에 들어가야 한다
        // 명시적으로 해제되기 전까지 유지가 된다.

        example.x = 10;
        example.y = 20;

        example.addByValue(example.x, example.y);
        System.out.println(example.x);

        example.addByReference(example, 20);
        System.out.println(example.x);
    }
}