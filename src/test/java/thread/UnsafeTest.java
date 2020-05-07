package thread;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * created by lanxinghua@2dfire.com on 2020/5/6
 */
public class UnsafeTest {

    private static Unsafe unsafe;

    static {
        try {
            Class<Unsafe> unsafeClass = Unsafe.class;
            Field theUnsafe = unsafeClass.getDeclaredField("theUnsafe");
            theUnsafe.setAccessible(true);
            unsafe = (Unsafe) theUnsafe.get(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Unsafe getUnsafe(){
        return unsafe;
    }

}
