package Thread;

import java.util.concurrent.*;

public class TestCallable implements Callable<Boolean> {
    @Override
    public Boolean call() throws Exception {
        System.out.println("线程---");
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TestCallable callable1=new TestCallable();
        TestCallable callable2=new TestCallable();
        TestCallable callable3=new TestCallable();
        //创建执行服务
        ExecutorService service=Executors.newFixedThreadPool(3);
        //提交执行
        Future<Boolean> future1=service.submit(callable1);
        System.out.println(future1);
        Future<Boolean> future2=service.submit(callable1);
        System.out.println(future2);
        Future<Boolean> future3=service.submit(callable1);

        System.out.println(future3);
        //获取结果
        boolean rs1=future1.get();
        System.out.println(rs1);
        boolean rs2=future1.get();
        System.out.println(rs2);
        boolean rs3=future1.get();
        System.out.println(rs3);
        //关闭服务
        service.shutdownNow();
    }
}
