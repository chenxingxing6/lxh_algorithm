package study;

import java.util.Objects;

/**
 * created by lanxinghua@2dfire.com on 2020/4/28
 * 字符串反转
 */
public class ReverseTest {
    public static void main(String[] args) {
        System.out.println(reverse("abcde"));
    }

    public static String reverse(String word){
        if (Objects.isNull(word) || "".equals(word)){
            return "";
        }
        String firstWord = word.substring(0, 1);
        String subWord = reverse(word.substring(1, word.length()));
        return subWord + firstWord;
    }
}
