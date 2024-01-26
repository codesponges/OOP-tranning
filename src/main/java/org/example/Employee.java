package org.example;

public class Employee {
    String name;
    protected int salary;

    // 생성자를 별도로 만들지 않으면 기본 생성자가 기본값으로 존재한다

    public int getSalary() {
        return salary;
    }


    public void setSalary(int salary) {
        if(salary <= this.salary) { // 매개변수 salary가 기존 salary 보다 적다면
            System.out.println("기존 연봉보다는 올랐으면 좋겠습니다");
            return; // 해당 위치에서 메서드를 종료하고 하단의 코드를 실행하지 않는다
        }

        // 4000 초과의 값이 넘어온다면
        this.salary = salary;
    }


    public void showSalary() {
        System.out.println("직원 " + name + "의 연봉은 " + salary + "입니다.");
    }


}
