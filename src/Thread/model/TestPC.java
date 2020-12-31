package Thread.model;

/**生产消费者模型---管层者*/
public class TestPC {
    public static void main(String[] args) {
        SynContainer container=new SynContainer();
        new Product(container).start();
        new Consumer(container).start();
    }
}
//生产者
class Product extends Thread{
    SynContainer container;
    public Product(SynContainer container){
        this.container=container;
    }
    @Override
    public void run(){
        for (int i = 1; i <=100 ; i++) {
            System.out.println("生产了"+i+"只鸡");
            try {
                container.push(new Chicken(i));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
//消费者
class Consumer extends Thread{
    SynContainer container;
    public Consumer(SynContainer container){
        this.container=container;
    }
    @Override
    public void run(){
        for (int i = 1; i <=100 ; i++) {
            try {
                System.out.println("消费了"+container.pop().id+"只鸡");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
//产品
class Chicken{
    int id;

    public Chicken(int id) {
        this.id = id;
    }
}
//缓冲区
class SynContainer{
    //需要一个容器
    Chicken[] chickens=new Chicken[10];
    int count=0;
    //生产这放入产品
    public synchronized void push(Chicken chicken) throws InterruptedException {
        //容器满了得消费
        if (count==chickens.length){
            this.wait();
        }
        //没满得翻入产品
        chickens[count]=chicken;
        count++;
        this.notify();
    }
    //消费者消费产品
    public synchronized Chicken pop() throws InterruptedException {
        if (count==0){
            this.wait();
        }
        count--;
        Chicken chicken=chickens[count];
        this.notifyAll();
        return chicken;
    }
}
