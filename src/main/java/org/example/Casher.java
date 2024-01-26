package org.example;

public class Casher extends Employee implements Cleaning {


    int orderTotalNum; // 총 만든 주문서의 개수

    public Casher (String name) { // 생성자는 뭐라고? 객체를 생성함과 동시에 객체의 속성 값을 초기화
        this.name = name;
    }

    public Casher (String name, int salary) { // 생성자를 호출함과 동시에 객체가 생성되고 속성 값이 초기화 된다
        this.name = name;
        this.salary = salary;
    }


    public OrderSheet makeOrderSheet(int coffeeNum) {
        OrderSheet order = new OrderSheet(coffeeNum);
        orderTotalNum++; // 총 만든 주문서 개수 1 증가시키고
        return order; // 리턴 타입에 맞게 주문서 반환
    }


    public void showInfo() {
        System.out.println("&&& 캐셔 " + name + "이 처리한 총 주문서의 개수는 " + orderTotalNum + "입니다.");
    }



    public int getSalary() { // private 접근 제어자로 선언된 변수의 값을 가져오는 게터 메서드로 public으로 선언해야 한다
        return salary;
    }


    public void showSalary() {
        System.out.println("&&& 캐셔 " + name + "의 연봉은 " + salary + "입니다.");
    }



    public void sweep() {
        System.out.println("*** 캐셔 " + name + "은 카운터 바닥을 청소함");
    }

    public void wipe() {
        System.out.println("*** 캐셔 " + name + "은 카운터 바닥을 닦음");
    }

    public void arrange() {
        System.out.println("*** 캐셔 " + name + "은 카운터를 정리 정돈 함");
    }


}
