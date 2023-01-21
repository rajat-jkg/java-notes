public class P13 {
    public static void main(String[] args) {
        Runnable O1 = ()->{
            for(int i=0;i<5;i++){
            System.out.println("Thread 1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }}
        };
        Runnable O2 = ()->{
            for(int i=0;i<5;i++){
            System.out.println("Thread 2");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }}
        };


        Thread t1 = new Thread(O1);
        Thread t2 = new Thread(O2);

        t1.start();
        t2.start();

    }
}
