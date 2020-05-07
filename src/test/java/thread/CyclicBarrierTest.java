package thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * created by lanxinghua@2dfire.com on 2020/5/6
 */
public class CyclicBarrierTest {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(2);
        new Thread(() -> {
            try {
                int await = barrier.await();
                System.out.println("ok1   " + await);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }, "线程1").start();
        new Thread(() -> {
            try {
                int await = barrier.await();
                System.out.println("ok2   " + await);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }, "线程2").start();
    }
}
