import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.annotation.IncompleteAnnotationException;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Ввведите выражение для вычисления: ");
//        String input = in.nextLine();
//        calc(input);
        calc("II + I");
    };
    public static String calc(String input) throws IOException {
        String in = input;
        String result = "";
        String plus = "+";
        String minus = "-";
        String divide = "/";
        String multiply = "*";

        // Создаем массив из символов
        String[] inArray = in.split(" ");
        System.out.println("Приведение к массиву: " + Arrays.toString(inArray));
        String first = inArray[0];
        String second = inArray[2];
        String operand = inArray[1];

        // Создаем hashmap для римских цифр

        HashMap<String, String> roman = new HashMap<>();
        roman.put("I", "1");
        roman.put("II", "2");
        roman.put("III", "3");
        roman.put("IV", "4");
        roman.put("V", "5");
        roman.put("VI", "6");
        roman.put("VII", "7");
        roman.put("VIII", "8");
        roman.put("IX", "9");
        roman.put("X", "10");


        // длина массива
        System.out.println("Длина массива: " + inArray.length);
//        System.out.println("Проверка: " + roman.containsKey(first));
        System.out.println("Проверка: " + roman.containsValue(first));




//        try {(roman.containsValue(Integer.valueOf(first)) && roman.containsValue(Integer.valueOf(second)));

        // Проверяем корректность введеных данных
        if (inArray.length != 3) {
            throw new IOException();
        } else if (roman.containsValue(first)) {
            if (!roman.containsValue(Integer.valueOf(first)) && !roman.containsValue(Integer.valueOf(second))) {
                throw new IOException(); }
        } else if (roman.containsKey(first)) {
            if (!roman.containsKey(first) && !roman.containsKey(second)) {
                throw new IOException();
                }
        }


        // Проверяем соответствие введенной строки
//        if ( first.matches("[0-9]") && operand.matches("[+-/*]") && second.matches("[0-9]") ) {
        if (roman.containsValue(first)) {

            // производим вычисление арабских чисел

            if (operand.equals(plus)) {
                result = String.valueOf(Integer.valueOf(first) + Integer.valueOf(second));
                System.out.println("Результат сложения: " + result);
            } else if (operand.equals(minus)) {
                result = String.valueOf(Integer.valueOf(first) - Integer.valueOf(second));
                System.out.println("Результат вычитания: " + result);
            } else if (operand.equals(divide)) {
                result = String.valueOf(Integer.valueOf(first) / Integer.valueOf(second));
                System.out.println("Результат деления: " + result);
            } else if (operand.equals(multiply)) {
                result = String.valueOf(Integer.valueOf(first) * Integer.valueOf(second));
                System.out.println("Результат умножения: " + result);
            }

//        } else if (first.matches("[IVX]") && operand.matches("[+-/*]") && second.matches("[IVX]")) {
        } else if (roman.containsKey(first)) {
            System.out.println("rim");
                // производим вычисление арабских чисел
            if (operand.equals(plus)) {
                result = String.valueOf(Integer.parseInt(roman.get(first)) + Integer.parseInt(roman.get(second)));
                System.out.println("Результат сложения римских чисел: " + result);
            }

        } else {
            System.out.println("error");
        }

//        Rimlin rimlin = Rimlin.I;
//        System.out.println(rimlin.getTranslation());

//        result = String.valueOf(result);
        return result;
    }
}

