package task3;

import java.util.*;

//Создайте программу, которая будет:
//подсчитывать количество гласных в словах
//выводить слова отсортированным списком по количеству гласных (сначала те, у которых больше гласных)
//делать первую гласную букву в слове заглавной
//Предложение вводится пользователем вручную русскими буквами. Разделитель пробел (“ ”).

public class task3 {
    public static void main(String[] args) {
        System.out.println("Enter a sentence :");
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        splitSentenceIntoWords(sentence);


    }
    public static void splitSentenceIntoWords(final String sentence){
        String[] words = sentence.split(" ");
        generateWordsSortedList(words);
    }

    public static void generateWordsSortedList(final String[] words){
        List<WordWrapper> wordWrappers = new ArrayList<>();

        for (String s : words){
            wordWrappers.add(new WordWrapper(s));
        }

        wordWrappers.sort(Comparator.comparing(WordWrapper::getCountVowel,Comparator.reverseOrder()));

        for (WordWrapper w : wordWrappers){
            System.out.println(w);
        }

        for (WordWrapper w : wordWrappers){
            System.out.println(upperFirstVowel(w.getWord()));
        }
    }

    public static String upperFirstVowel(String word){

        for (int i=0; i<word.length();i++){
            if (WordWrapper.VOWELS.contains(word.charAt(i))){
                word = word.replaceFirst(Character.toString(word.charAt(i)),Character.toString(Character.toUpperCase(word.charAt(i))));
                break;
            }
        }

        return word;
    }
}