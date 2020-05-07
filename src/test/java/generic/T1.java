package generic;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * created by lanxinghua@2dfire.com on 2020/5/5
 */
public class T1 {
   static class Fruit{

   }

    static class Apple extends Fruit {

   }

    static class Orange extends Fruit{

   }

   // 无界
   private static void aa01(List<?> list){

   }
   private static void test01(){
       List<Apple> list1 = new ArrayList<>();
       List<Orange> list2 = new ArrayList<>();
       aa01(list1);
       aa01(list2);
   }

   // 上限
   private static void aa02(List<? extends Fruit> list){

   }
    private static void test02(){
        List<Apple> list1 = new ArrayList<>();
        List<Orange> list2 = new ArrayList<>();
        aa02(list1);
        aa02(list2);
    }

    // 下限
    private static void aa03(List<? super Fruit> list){

    }
    private static void test03(){
        List<Fruit> list1 = new ArrayList<>();
        List<Object> list2 = new ArrayList<>();
        aa03(list1);
        aa03(list2);
    }



    public static void main(String[] args) {
        test01();
        test02();
        test03();
        Class<T1> t1Class = T1.class;
        Method[] methods = t1Class.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.toString());
        }
    }


}
