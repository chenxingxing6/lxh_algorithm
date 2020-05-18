package bytedance.string;

import java.util.HashMap;

/**
 * created by lanxinghua@2dfire.com on 2020/5/15
 * 无重复最长子序列
 * https://blog.csdn.net/ccccc1997/article/details/81268248
 */
public class Test01 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    public static int lengthOfLongestSubstring(String s){
        char[] chars = s.toCharArray();
        HashMap map = new HashMap();
        int count = 0;
        for(int i = 0; i < chars.length; i ++){
            if (map.get(chars[i]) != null){
                return count;
            }
            count++;
            map.put(chars[i], 1);
        }
        return count;
    }
}
