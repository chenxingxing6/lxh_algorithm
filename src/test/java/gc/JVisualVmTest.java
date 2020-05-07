package gc;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * created by lanxinghua@2dfire.com on 2020/5/7
 */
public class JVisualVmTest {
    public static void main(String[] args) throws Exception{
        byte[] bytes = new byte[1024*1024*8];// 1MB
        List<byte[]> list = new ArrayList<>();
        while (true){
            list.add(bytes);
            TimeUnit.MICROSECONDS.sleep(50);
        }
    }
}
