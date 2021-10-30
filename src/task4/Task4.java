package task4;

import java.util.*;

public class Task4 {
    public static void main(String[] args) {

        System.out.println("Enter a sentence :");
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        NumberManipulator numberManipulator = new NumberManipulator(sentence);
        numberManipulator.replaceStarsOnNumbers(numberManipulator.findMaxNumberInArray());
        numberManipulator.renderNumbers();
    }
}
