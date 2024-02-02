package defaultInterface;

public interface MyInterface {
    void sayHello();

    default void defaultMethod() {
       System.out.println("디폴트 구현입니다.");
    }
}
