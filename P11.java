//acheiving multithreading through extending thread class

//extending thread class makes it a thread
class T1 extends Thread{
    @Override
    public void run() {
        for(int i = 0; i<=5;i++)
        {System.out.println("In theread 1");
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }}
    }
}
//second thread 
class T2 extends Thread{
    @Override
    public void run() {
        for(int i = 0; i<=5;i++)
        {System.out.println("In second thread");
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }}
    }
}
public class P11 {
    public static void main(String[] args) throws InterruptedException {
        T1 th1 = new T1();
        T2 th2 = new T2();

        th1.start();
        th2.start();
        
    }
}