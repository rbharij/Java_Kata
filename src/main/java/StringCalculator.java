import java.nio.file.LinkPermission;

public class StringCalculator {
    public static int add(String input) throws Exception {
        String[] numbers;
        String delimiter = "";

        if (input.contains("-")){
            throw new Exception("Negatives not allowed: " + input);
        }
        if (input.contains("//")){
            delimiter = GetDelimiter(input);
            input = input.replaceAll("//" + delimiter + "\n", "");
        }
        if (input.contains("\n") || input.contains(",")){
            input = input.replaceAll("\n", ",");
            delimiter = ",";
        }
        numbers = input.split(delimiter);
        return SumNumbers(numbers);
    }

    public static Integer SumNumbers(String numbers[]){
        int total = 0;
        if (numbers[0] != "") {
            for (int i = 0; i < numbers.length; i++) {
                if (Integer.parseInt(numbers[i])<1000) {
                    total = total + Integer.parseInt(numbers[i]);
                }
            }
        }
        return total;
    }

    public static String GetDelimiter(String input){
        int firstPos = input.indexOf("//") + 2;
        int lastPos = input.lastIndexOf("\n");
        return input.substring(firstPos, lastPos);
    }

}

