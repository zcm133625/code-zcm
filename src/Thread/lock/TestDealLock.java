package Thread.lock;

public class TestDealLock {


    public static void main(String[] args) {
        ReadBook readBook1=new ReadBook(1,"小明");
        ReadBook readBook2=new ReadBook(0,"小华");
        readBook1.start();
        readBook2.start();
    }

}
class AIBook{

}
class JAVABook{

}
class ReadBook extends Thread{
    static AIBook aiBook=new AIBook();
    static JAVABook javaBook=new JAVABook();

    int choose;
    String name2;
    ReadBook(int choose,String name2){
        this.choose=choose;
        this.name2=name2;
    }
    @Override
    public void run(){
        try {
            readNow();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void readNow() throws InterruptedException {
        if (choose==1){
            synchronized (aiBook){
                System.out.println(this.name2+"在读AI书籍");
                Thread.sleep(1000);
                System.out.println(this.name2+"请求java书籍中...");
                synchronized (javaBook){
                    System.out.println(this.name2+"阅读java书籍");
                }
            }
        }else {
            synchronized (javaBook){
                System.out.println(this.name2+"阅读java书籍");
                Thread.sleep(2000);
                System.out.println(this.name2+"请求AI书籍中...");
                synchronized (aiBook){
                    System.out.println(this.name2+"在读AI书籍");
                }
            }
        }
    }
}
