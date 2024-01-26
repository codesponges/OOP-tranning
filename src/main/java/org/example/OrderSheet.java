package org.example;

public class OrderSheet {

    // static으로 선언하면 static 공간에 따로 저장되서 객체 생성 없이 바로 호출할 수 있다 ex) OrderSheet.serialNum
    static int serialNum = 100; // 주문번호
    int orderNum; // 넌 뭐냐? -> 아 너도 주문번호 ㅇㅋ
    int coffeeNum; // 주문 들어온 커피 수
    boolean isCompleted = false; // 작업 상태 : 초기는 false로 지정


    public OrderSheet (int coffeeNum) { // 생성자는 호출과 동시에 객체를 생성하며 값을 초기화한다
        this.coffeeNum = coffeeNum;
        serialNum++; // 주문 들어오면 주문번호 1 늘려서
        orderNum = serialNum; // orderNum 변수에 저장
        isCompleted = false; // 주문 상태 기본값을 false로
    }

    public void showInfo() {
        System.out.println("주문서 번호는 " + orderNum + "이고, 커피수는 " + coffeeNum + "이미 완료 여부는 " + isCompleted + "입니다.");
    }

}
