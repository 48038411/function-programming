package cn.soft1851.practice.wu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author jh_wu
 * @ClassName Fifth
 * @Description TODO
 * @Date 2020/2/23:1:39
 * @Version 1.0
 **/
public class Fifth {
    public static void main(String[] args) {
        String[] array = { "Java", "C#", "Scala", "Basic", "C++", "Ruby", "Pyton",
                "Perl", "Haskell", "Jet","Java", "C#", "Scala", "Basic", "C++", "Ruby", "Pyton",
                "Perl", "Haskell", "Jet","Java", "C#", "Scala", "Basic", "C++", "Ruby", "Pyton",
                "Perl", "Haskell", "Jet","aaaaaaaaaa" };
        Arrays.sort(array, (s1, s2) -> (s2.length() - s1.length()));
        for (int i= 0;i<5;i++){
        Arrays.asList(array[i]).forEach(System.out::println);
    }
    }
}