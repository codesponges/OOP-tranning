package org.example;

public interface Cleaning {

    // 인터페이스는 몸체 {} 가 없는 메서드만 사용 가능
    // 인터페이스를 구현하는 쪽에서 반드시 모두 구현해야 한다
    // 인터페이스는 인스턴스를 생성할 수 없고 생성자가 존재하지 않는다
    // 인터페이스는 혼자서 할 수 있는 것이 없다. 그저 구현하는 쪽에 뼈대를 제공하는 역할을 할 뿐이다
    // 인터페이스는 꼭 지켜야 할 규칙으로 하나라도 구현하지 않을 경우 에러를 표시한다
    // 상속은 extends 라면 구현은 implements
    // public abstract void 생략
    // public static final 생략

    public abstract void sweep();
    void wipe();
    void arrange();
}
