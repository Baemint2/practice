package bus;

import java.lang.reflect.Method;

public class ClassLoaderMain {
    public static void main(String[] args) throws Exception{

        //클래스 영역에서

        String className = "bus.SuperCar";
        Class clazz = Class.forName(className);
        Object o = clazz.newInstance();
        Car b = (Car) o;
        b.a();
    }
}
