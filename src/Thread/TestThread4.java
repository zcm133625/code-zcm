package Thread;

public class TestThread4 {
    public static void main(String[] args) throws InterruptedException {
        Thread1 thread1=new Thread1();
        Thread thread=new Thread(thread1);
        thread.start();
        for (int i = 1; i <=1000 ; i++) {
            if (i==200){
                thread.join();
            }
            System.out.println("主线程-"+i);
        }

    }

}
class Thread1 implements Runnable{

    @Override
    public void run() {
        System.out.println("线程1开始");
        for (int i = 1; i <=1000 ; i++) {
            System.out.println("线程1-"+i);
        }

        System.out.println("线程1结束");
    }
}
class Thread2 implements Runnable{

    @Override
    public void run() {
        System.out.println("线程2开始");
        for (int i = 1; i <=1000 ; i++) {
            System.out.println("线程2-"+i);
        }
        System.out.println("线程2结束");
    }
}
