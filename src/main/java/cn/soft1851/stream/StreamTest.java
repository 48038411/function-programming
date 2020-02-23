package cn.soft1851.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest implements Comparable<Word> {
    public static void main(String[] args) {
        Stream stream = size -> {
            //传入数组
            List<String> words = getList(size);
            //创建一个空数组
            List<Word> result = new ArrayList<>();
            //将words传值到result
            words.forEach(words1 ->result.add(new Word(words1)));
            List<Word> words1 = result.stream().sorted(Comparator.comparing(Word::getwordLength).reversed()).collect(Collectors.toList());
//            words1.forEach(e -> System.out.println(e.getWord() + " "));
           List<Word> words2 =words1.stream().limit(5).collect(Collectors.toList());
           words2.forEach(e -> System.out.println(e.getWord() + " "));

        };
        stream.sort(7);
    }
    static List<String> getList(int size){
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("go");
        list.add("javascript");
        list.add("python");
        list.add("c");
        list.add("c++");
        list.add("php");
        return list;
    }

    @Override
    public int compareTo(Word o) {
        return 0;
    }
}
