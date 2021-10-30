package task2;

import java.util.Scanner;

//Создайте программу, которая будет вычислять и выводить на экран простые множители,
//из которых состоит целое число, введенное пользователем.
//Если введенное число не целое, то нужно сообщать пользователю об ошибке.
public class Task2 {
    public static void main(String[] args) {
        isInteger();
    }

    public static void primeFactors(int number) {
        int numberIterator = number;
        for (int i = 2; i < numberIterator; i++) {
            while (number % i == 0){
                System.out.println(i);
                number /= i;
            }
        }
    }

    public static void isInteger(){
        int number;
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Input a number: ");
            number = in.nextInt();
            primeFactors(number);
        }
        catch (Exception e){
            throw new NumberFormatException("Number is not Integer");
        }

    }
}
