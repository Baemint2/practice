package car;

public class Model {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota", 2001);
        Car car2 = new Car("Honda", 2002);



        String car1Name = car1.getName();
        int car1Year = car1.getYear();

        String car2Name = car2.getName();
        int car2Year = car2.getYear();

        System.out.println(car1Name + " : " + car1Year);
        System.out.println(car2Name + " : " + car2Year);

    }
}
