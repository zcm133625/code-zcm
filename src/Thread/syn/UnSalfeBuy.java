package Thread.syn;

import java.util.ArrayList;
import java.util.List;

public class UnSalfeBuy {
    public static  void main(String[] args) throws InterruptedException {

        List list=new ArrayList();

        for (int i = 1; i <=10000 ; i++) {
            int finalI = i;
            new Thread(()->{
                synchronized (list){
                    list.add(Thread.currentThread().getName() );
                }

            }).start();
        }
        Thread.sleep(200);
        System.out.println(list.size());
    }
}
class BuyTickes implements Runnable{
    private int num=20;
    @Override
    public void run() {
            while (num>0){
                System.out.println(Thread.currentThread().getName()+"买到了第"+ num-- +"张票！");
            }
    }
}


