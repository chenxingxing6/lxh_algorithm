package thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

/**
 * created by lanxinghua@2dfire.com on 2020/4/30
 */
public class ReentrantLockTest {

    private static Object resources1 = new Object();
    private static Object resources2 = new Object();

    public static void main(String[] args) {
        // 死锁
        Thread a = new Thread();
//        deadLock();
        int i = 0;
        List<Byte[]> list = new ArrayList<>();
        try {
            while (true){
                Byte[] bytes = new Byte[1*1024*1024];
                list.add(bytes);
                i++;
            }
        }catch (Throwable e){
            System.out.println("i:"+ i);
            e.printStackTrace();
        }
    }

    private static void deadLock(){
        System.out.println("开始执行.....");
        new Thread(() -> {
            synchronized (resources1){
                try {
                    System.out.println("开始获取资源2");
                    TimeUnit.SECONDS.sleep(1);
                    synchronized (resources2){
                        System.out.println("获取资源2");
                    }
                }catch (Exception e){

                }
            }
        }).start();

        new Thread(() -> {
            synchronized (resources2){
                try {
                    System.out.println("开始获取资源1");
                    synchronized (resources1){
                        System.out.println("获取资源1");
                    }
                }catch (Exception e){

                }
            }
        }).start();
    }
}

