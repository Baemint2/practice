package bus;

public class MyRunnableMain {
    public static void main(String[] args) {


        MyRunnable m = new MyRunnable() {
            @Override
            public void run() {
                System.out.println("달릴거야!!!!!!");
            }
        };
        m.run();
    }
}
