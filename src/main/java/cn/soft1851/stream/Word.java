package cn.soft1851.stream;



public class Word implements Comparable<Word> {
    private String word;

    public Word(){

    }

    public Word(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public int getwordLength(){
        return word.length();
    }

    public int getwordIndex(){
        return word.indexOf(word);
    }


    @Override
    public int compareTo(Word o) {
        return 0;
    }
}
