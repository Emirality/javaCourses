package task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberManipulator {

    List<List<String>> renderingNumbers = gerListOfRenderNumbers();
    int[] intArray;

    NumberManipulator(String sentence){
        this.intArray = Arrays.stream(sentence.split("")).mapToInt(Integer::parseInt).toArray();
    }

    public int findMaxNumberInArray(){
        return Arrays.stream(this.intArray)
                .max()
                .getAsInt();
    }

    public void replaceStarsOnNumbers(int maxNumber){
        List<String> listMaxNumber = this.renderingNumbers.get(maxNumber)
                .stream()
                .map(s -> s.replace("*",Integer.toString(maxNumber)))
                .collect(Collectors.toList());

        renderingNumbers.set(maxNumber, listMaxNumber);
    }


    public List<List<String>> gerListOfRenderNumbers(){

        List<List<String>> list = new ArrayList<>();

        List<String> zeroNumber = Arrays.asList("*****", "*   *", "*   *", "*   *", "*****");
        List<String> oneNumber = Arrays.asList("    *", "    *", "    *", "    *", "    *");
        List<String> twoNumber = Arrays.asList("*****", "    *", "*****", "*    ", "*****");
        List<String> threeNumber = Arrays.asList("*****", "    *", "*****", "    *", "*****");
        List<String> fourNumber = Arrays.asList("*   *", "*   *", "*****", "    *", "    *");
        List<String> fiveNumber = Arrays.asList("*****", "*    ", "*****", "    *", "*****");
        List<String> sixNumber = Arrays.asList("*****", "*    ", "*****", "*   *", "*****");
        List<String> sevenNumber = Arrays.asList("*****", "    *", "    *", "    *", "    *");
        List<String> eightNumber = Arrays.asList("*****", "*   *", "*****", "*   *", "*****");
        List<String> nineNumber = Arrays.asList("*****", "*   *", "*****", "    *", "*****");

        list.add(zeroNumber);
        list.add(oneNumber);
        list.add(twoNumber);
        list.add(threeNumber);
        list.add(fourNumber);
        list.add(fiveNumber);
        list.add(sixNumber);
        list.add(sevenNumber);
        list.add(eightNumber);
        list.add(nineNumber);

        return list;
    }

    public void renderNumbers(){
        for (int i : intArray) {
            List<String> number = renderingNumbers.get(i);
            for (String s : number) {
                System.out.println(s);
            }
            System.out.println();
        }
    }
}
