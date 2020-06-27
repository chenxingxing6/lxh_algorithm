package design_pattern;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Proxy;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.Executors;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * created by lanxinghua@2dfire.com on 2020/5/23
 * jdk中使用的设计模式
 */
public class Test {
    public static void main(String[] args) throws Exception{
        // 创建型
        // 1.原型
        new Test().clone();

        // 2.建造者
        StringBuilder sb = new StringBuilder();
        sb.append("test");

        // 3.工厂
        Test.class.newInstance();
        Class.forName(null);

        // 4.抽象工厂
        Calendar instance = Calendar.getInstance();
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        // 5.单例模式
        Runtime runtime = Runtime.getRuntime();


        // 结构型
        // 1.装饰器
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // 2.适配器
        List<Integer> integers = Arrays.asList(new Integer[]{1, 3});

        // 4.享元模式
        Integer integer = Integer.valueOf(10);

        // 5.组合
        new HashMap<>().putAll(null);
        new ArrayList<>().addAll(null);

        // 6.代理模式
        Proxy.newProxyInstance(null, null, null);


        // 行为模式
        // 1.观察者
        WatchService service = FileSystems.getDefault().newWatchService();
        WatchKey key = service.take();

        // 2.策略模式
        Comparator.comparing(null);

        // 3.责任链
        Logger logger = Logger.getLogger("xx");
        logger.log(null, "msg");

        // 4.解释器
        Pattern pattern = Pattern.compile("xx");

        // 5.迭代器
        Arrays.asList(new int[]{1,2}).iterator();

        // 6.中介者
        Executors.newFixedThreadPool(1);
    }
}
