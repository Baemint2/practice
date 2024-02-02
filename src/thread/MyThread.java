package thread;

// 1. Thread 클래스 상속
public class MyThread extends Thread {
    private String str;

    public MyThread(String str) {
        this.str = str;
    }
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println("---" + name + " ---");
        for (int i = 0; i < 10; i++) {
            System.out.print(str);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

    }
}
