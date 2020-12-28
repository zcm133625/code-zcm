package Thread;

public class TestThread2 implements Runnable{
    private int num=10;
    @Override
    public void run() {
        while (true){
            if (num<=0){
                break;
            }
            System.out.println(Thread.currentThread().getName()+"拿到了"+num--+"张票");

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {
        TestThread2 thread2=new TestThread2();
        new Thread(thread2,"小米").start();
        new Thread(thread2,"小明").start();
        new Thread(thread2,"坑壁").start();
    }
}
