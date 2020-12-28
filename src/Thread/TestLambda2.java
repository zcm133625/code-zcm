package Thread;

public class TestLambda2 {
    public static void main(String[] args) {
        Lambda2 lambda=()-> {
            System.out.println("faf");
        };
        lambda.lambda();

        Dog dog=(int x)->{
            System.out.println("狗会吃"+x+"次饭");
        };
        dog.eat(2);

    }
}
interface Lambda2{
    void lambda();

}
interface Dog{
    void eat(int x);

}
