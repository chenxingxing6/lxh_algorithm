import java.util.concurrent.CountDownLatch;

/**
 * created by lanxinghua@2dfire.com on 2020/5/7
 */
public class LxhTest {
    private static T[] arr = new T[2];
    private static long COUNT = 1_0000_0000L;

    static {
        arr[0] = new T();
        arr[1] = new T();
    }


    public static void main(String[] args) throws Exception {
        CountDownLatch latch = new CountDownLatch(2);
        long startTime = System.currentTimeMillis();
        new Thread(() -> {
            for (int i = 0; i < COUNT; i++) {
                arr[0].x = 100;
            }
            latch.countDown();
        }).start();
        new Thread(() -> {
            for (int i = 0; i < COUNT; i++) {
                arr[1].x= 10;
            }
            latch.countDown();
        }).start();
        latch.await();
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime+"ms");
    }

    private static class T {
//         public volatile long p1,p2,p3,p4,p5,p6,p7;
        public volatile long x = 0L;
//        public volatile long p9,p10,p11,p12,p13,p14,p15;
    }
}
