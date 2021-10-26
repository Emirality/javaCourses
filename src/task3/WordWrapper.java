package task3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordWrapper {

    private final String word;
    private final int countVowel;

    public static final Set<Character> VOWELS = new HashSet<>(Arrays.asList('а','о','и','е','ё','э','ы','у','ю','я'));

    WordWrapper(String word){
        this.word = word;
        this.countVowel = vowelCounter(word);
    }

    private int vowelCounter(String word){

        int counter=0;


        for (int i = 0; i < word.length();i++){
            if (VOWELS.contains(word.charAt(i))) counter++;
        }

        return counter;
    }

    public int getCountVowel() {
        return countVowel;
    }

    public String getWord() {
        return word;
    }

    @Override
    public String toString() {
        return "WordWrapper{" +
                "word='" + word + '\'' +
                ", countVowel=" + countVowel +
                '}';
    }
}
