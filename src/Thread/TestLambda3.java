package Thread;

public class TestLambda3 {

    public static void main(String[] args) {
        Call call=()->{
            System.out.println("打电话");
        };
        call.call();
    }

    interface Call{
        void call();
    }
}
