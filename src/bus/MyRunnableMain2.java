package bus;

public class MyRunnableMain2 {
    public static void main(String[] args) {

        MyRunnableExecute myRunnableExecute = new MyRunnableExecute();
        System.out.println("------------------");
        myRunnableExecute.execute(() -> System.out.println("안녕!!!!!!"));
        System.out.println("-------------------");
    }

}
