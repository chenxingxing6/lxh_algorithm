package thread;

import java.util.concurrent.TimeUnit;

/**
 * created by lanxinghua@2dfire.com on 2020/5/4
 */
public class ThreadLocalTest {
    public static void main(String[] args) {
        ThreadLocal<Integer> tl = new ThreadLocal<>();
        new Thread(()-> {
            try {
                tl.set(1);
            }catch (Exception e){
                e.printStackTrace();
            }
        }, "线程1").start();

        new Thread(()-> {
            try {
                TimeUnit.SECONDS.sleep(1);
                System.out.println(tl.get());
            }catch (Exception e){
                e.printStackTrace();
            }
        }, "线程2").start();
    }
}
