package Thread.lock;

import java.util.concurrent.locks.ReentrantLock;

public class TestLock implements Runnable {
    private int ticks=10;
    private final ReentrantLock lock=new ReentrantLock();


    public static void main(String[] args) {
        TestLock lock=new TestLock();
        new Thread(lock).start();
        new Thread(lock).start();

    }
    @Override
    public void run(){
        while (true){
            try {
                lock.lock();//加锁
                if (ticks>0){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(ticks);
                    ticks--;
                }else {
                    break;
                }
            }finally {
                lock.tryLock();//解锁
            }
        }
    }
}
