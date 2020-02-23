package cn.soft1851.practice.wu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
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
        List<String> array = Arrays.asList("Java", "C#", "Scala", "Basic", "C++", "Ruby", "Pyton",
                "Perl", "Haskell", "Jet", "Java", "C#", "Scala", "Basic", "C++", "Ruby", "Pyton",
                "Perl", "Haskell", "Jet", "Java", "C#CCCCCCCCCCCCCCCCCCC", "Scala", "Basic", "C++", "Ruby", "Pyton",
                "Perl", "Haskell", "Jet", "aaaaaaaaaa");
        List<String> all = array.stream().sorted(Comparator.comparingInt(String::length).reversed()).limit(5).collect(Collectors.toList());
        Collections.singletonList(all).forEach(System.out::println);
    }
}