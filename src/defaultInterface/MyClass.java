package defaultInterface;

public class MyClass implements MyInterface{

    @Override
    public void sayHello() {
        System.out.println("추상메서드 구현한겁니다.");
    }


    @Override
    public void defaultMethod() {
        System.out.println("디폴트메서드 였던것");
    }
}

