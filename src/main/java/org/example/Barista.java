package org.example;

public class Barista extends Employee implements Cleaning {
    

    int coffeeTotalNum; // 총 만든 커피의 수
    
    // 자바에서 원시 타입의 기본값은 0이다. 따라서 위의 salary와 coffeeTotalNum은 0으로 초기화 된 상태
    
    
    public Barista (String name) { // 생성자 - 객체의 생성과 동시에 속성 값을 초기화
        this.name = name; // this는 본인을 의미한다. 아마 객체가 되겠지?
    }


    public Barista (String name, int salary){ // 객체 생성과 동시에 이름, 연봉을 초기화 해주는 생성자
        this.name = name;
        this.salary = salary;
    }

    
    public void makeCoffee (OrderSheet order) { // 파라미터 = 매개변수 = 필요한 재료
        // 방어코드, 유효성 검사 코드 -> 프로그램의 성능 향상과 안전성을 높이는 역할
        // 가능한 앞 쪽에 위치하여 메모리 효율을 높이는 관점을 가질 것
        if(order.isCompleted == true) {
            return; // 해당 위치에서 메서드를 바로 종료시키고 하단의 코드들은 실행하지 않는다
        }
        
        order.isCompleted = true;
        coffeeTotalNum += order.coffeeNum;
    }
    

    public void showInfo() {
        System.out.println("*** 바리스타 " + name + "이 만든 총 커피의 개수는 " + coffeeTotalNum + "입니다");
    }



    public void sweep() {
        System.out.println("*** 바리스타 " + name + "은 커피 머신을 쓸어 냅니다");
    }

    public void wipe() {
        System.out.println("*** 바리스타 " + name + "은 커피 머신을 닦아냅니다");
    }

    public void arrange() {
        System.out.println("*** 바리스타 " + name + "은 커피 원두와 커피 머신을 정리합니다");
    }

    
}
