package Thread;

public class TestLambda {
    //静态内部类
    static class Like2 implements Ilike{
        @Override
        public void lambda() {
            System.out.println("我是lambda2");
        }
    }
    public static void main(String[] args) {
        //局部内部类
        class Like3 implements Ilike{
            @Override
            public void lambda() {
                System.out.println("我是lambda3");
            }
        }
        Ilike ilike=new Like3();
        ilike.lambda();
        //匿名内部类
        ilike=new Ilike(){
            @Override
            public void lambda() {
                System.out.println("我是lambda4");
            }
        };
        ilike.lambda();
        //lambda表达式
        ilike=()->{
                System.out.println("我是lambda5");
        };
        ilike.lambda();

    }
}
interface Ilike{
    void lambda();
}
class Like1 implements Ilike{

    @Override
    public void lambda() {
        System.out.println("我是lambda1");
    }
}
