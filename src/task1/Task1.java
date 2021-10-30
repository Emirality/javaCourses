package task1;

//Напишите программу, которая возвращает сумму цифр, присутствующих в данной строке. Е
// сли цифр нет, то возвращаемая сумма должна быть равна 0.Напишите программу,
// которая возвращает сумму цифр, присутствующих в данной строке. Если цифр нет, то возвращаемая сумма должна быть равна 0.

public class Task1 {
    public static void main(String[] args) {
        String parsedString = "a1b2c3e4";
        System.out.println(findSum(parsedString));

    }
    public static int findSum(String s){
        int sum = 0;
        for (char c : s.toCharArray()){
            if (Character.isDigit(c)) {
                sum += Integer.parseInt(String.valueOf(c));
            }
        }
        return sum;
    }
}
