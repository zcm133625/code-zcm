package Thread;

public class Race implements Runnable{
    public static void main(String[] args) {
        Race race=new Race();

        new Thread(race,"乌龟").start();
        new Thread(race,"兔子").start();

    }

    @Override
    public void run() {
        for (int i = 1; i <=101 ; i++) {
            if (isWin(i)){
                System.out.println(Thread.currentThread().getName()+"赢了");
                break;

            }
            if (Thread.currentThread().getName().equals("兔子") && i%20==0){
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()+"跑了第"+i+++"步");
        }
    }
    public static boolean isWin(int x){
        if (x>=100){
            return true;
        }else {
            return false;
        }
    }
}
