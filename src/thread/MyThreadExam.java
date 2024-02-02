package thread;

public class MyThreadExam {
    public static void main(String[] args){
        String name = Thread.currentThread().getName();
        System.out.println("Thread name : " + name);
        System.out.println("start!!");

        MyThread mt1 = new MyThread("*");
        MyThread mt2 = new MyThread("+");

        mt1.start();
        mt2.start();

        System.out.println("end!");


        }
    }
