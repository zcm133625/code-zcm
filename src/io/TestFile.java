package io;

import java.io.File;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class TestFile {

    public static void main(String[] args) {
        // 绝对路径
        File f1 = new File("d:/LOLFolder");
        System.out.println("f1的绝对路径：" + f1.getAbsolutePath());
        // 相对路径,相对于工作目录，如果在eclipse中，就是项目目录
        File f2 = new File("LOL.exe");
        System.out.println("f2的绝对路径：" + f2.getAbsolutePath());

        // 把f1作为父目录创建文件对象
        File f3 = new File(f1, "LOL.exe");

        System.out.println("f3的绝对路径：" + f3.getAbsolutePath());
    }
}
class TestFile1{
    public static void main(String[] args) {
        File file=new File("d:/test");
        System.out.println(file.exists());
        //绝对路径
        System.out.println(file.getAbsolutePath());
        File file1=new File(file,"zcm.txt");
        File file2=new File("d:test/xiaoming.txt");
        file1.renameTo(file2);
        System.out.println(file1.exists());
        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.length()+"-"+file1.isFile());
        HashMap hashMap=new HashMap();
        Hashtable hashtable=new Hashtable();
        ConcurrentHashMap concurrentHashMap=new ConcurrentHashMap();
    }
}
