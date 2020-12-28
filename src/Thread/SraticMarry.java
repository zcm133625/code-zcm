package Thread;

//静态代理模式
public class SraticMarry {

}
interface Marry{
    void happyMarry();
}
class You implements Marry{

    @Override
    public void happyMarry() {
        System.out.println("结婚了");
    }
}
//代理结社
class weddingMerry implements Marry{

    @Override
    public void happyMarry() {

    }
}


