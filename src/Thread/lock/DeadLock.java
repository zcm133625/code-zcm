package Thread.lock;

public class DeadLock {


    public static void main(String[] args) {
        Makeup g1=new Makeup(0,"灰姑娘");
        Makeup g2=new Makeup(1,"白雪公主");
        g1.start();
        g2.start();
    }
}
//口红
class lipstick{

}
//镜子
class Mirror{

}
class Makeup extends Thread{
    static lipstick lipstick=new lipstick();
    static Mirror mirror=new Mirror();

    int choice;//选择
    String girlName;//使用的人
    Makeup(int choice,String girlName){
        this.choice=choice;
        this.girlName=girlName;
    }
    @Override
    public void run(){
        try {
            makeup();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void makeup() throws InterruptedException {
        if (choice==0){
            synchronized (lipstick){
                System.out.println(this.girlName+"获得口红的锁");
                Thread.sleep(1000);
                synchronized (mirror){
                    System.out.println(this.girlName+"获得镜子的锁");
                }

            }

        }else {
            synchronized (mirror){
                System.out.println(this.girlName+"获得镜子的锁");
                Thread.sleep(2000);
                synchronized (lipstick){
                    System.out.println(this.girlName+"获得口红的锁");
                }

            }

        }
    }
}
