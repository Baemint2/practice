package bus;

public class CarExam {
    public static void main(String[] args) {


        Car car = new Car() {
            @Override
            public void a()  {
                System.out.println("a였던것");
            }
        };


        car.a();
    }
}
