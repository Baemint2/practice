package defaultInterface;

public class Main {
    public static void main(String[] args) {

        Hello hello = new Hello();

        hello.Hi(()->
            System.out.println("반가워!!!!!!"));
    }
}
