package thread;

import org.openjdk.jol.info.ClassLayout;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * created by lanxinghua@2dfire.com on 2020/5/5
 */
public class PhantomReferenceTest {
    public static void main(String[] args) {
        List<Object> list = new LinkedList<>();
        ReferenceQueue<Lxh> queue = new ReferenceQueue();
        PhantomReference<Lxh> lxh = new PhantomReference<>(new Lxh(), queue);
        new Thread(() -> {
            while (true){
                list.add(new byte[1024*1024]);
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(lxh.get());
            }
        }).start();

        // 监控队列线程
        new Thread(() -> {
            while (true){
                Reference<? extends Lxh> poll = queue.poll();
                if (poll != null){
                    System.out.println("虚引用对象被jvm回收...." + poll);
                }
            }
        }).start();
    }

    static class Lxh{
        @Override
        protected void finalize() throws Throwable {
            System.out.println("我被回收了....");
            super.finalize();
        }
    }


}
