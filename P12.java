//multithreading through runnable interface

public class P12 {
    public static void main(String[] args) {
        Runnable objA = new A();
        Runnable objB = new B();

        Thread th1 = new Thread(objA);
        Thread th2 = new Thread(objB);

        th1.start();
        th2.start();


    }
}

class A implements Runnable{
    public void run(){
        for(int i = 0; i<=10; i++){
        System.out.println("In A");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }}
    }
}

class B implements Runnable{
    public void run(){
        for(int i = 0; i<=10; i++){
        System.out.println("In B");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }}
    }
}