package Thread;

public class TestThread {
    public static void main(String[] args) {
        eat eat1=new eat();
        new Thread(eat1).start();
        drink drink1=new drink();
        new Thread(drink1).start();
    }

    static class eat implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {

                System.out.println("吃饭"+i);
            }
        }
    }
    static class drink implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i <1000 ; i++) {
                System.out.println("喝酒"+i);
            }
        }
    }
}
