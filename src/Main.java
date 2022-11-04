import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("Ввведите выражение для вычисления: ");
        String input = in.nextLine();
        calc(input);
        // автоматический ввод
//        calc("21 + 2");
    }
    public static String calc(String input) throws IOException {
        String result = "";
        String plus = "+";
        String minus = "-";
        String divide = "/";
        String multiply = "*";

        // Создаем массив из символов

        String[] inArray = input.split(" ");
        if (inArray.length != 3) {
            throw new IOException();}
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

        // Проверяем корректность введеных данных
        if (roman.containsValue(first)) {
            if (!(roman.containsValue(first) && roman.containsValue(second))) {
                throw new IOException();
            }
        } else if (roman.containsKey(first)) {
            if (!(roman.containsKey(first) && roman.containsKey(second))) {
                throw new IOException();
            }
        }

        // Проверяем соответствие введенной строки арабским или римским цифрам через hashmap roman
        if (roman.containsValue(first)) {

            // производим вычисление арабских чисел
            if (operand.equals(plus)) {
                result = String.valueOf(Integer.parseInt(first) + Integer.parseInt(second));
                System.out.println("Результат сложения: " + result);
            } else if (operand.equals(minus)) {
                result = String.valueOf(Integer.parseInt(first) - Integer.parseInt(second));
                System.out.println("Результат вычитания: " + result);
            } else if (operand.equals(divide)) {
                result = String.valueOf(Integer.parseInt(first) / Integer.parseInt(second));
                System.out.println("Результат деления: " + result);
            } else if (operand.equals(multiply)) {
                result = String.valueOf(Integer.parseInt(first) * Integer.parseInt(second));
                System.out.println("Результат умножения: " + result);
            }

//
        } else if (roman.containsKey(first)) {

            // производим вычисление римских чисел
            if (operand.equals(plus)) {
                String preresult = String.valueOf(Integer.parseInt(roman.get(first)) + Integer.parseInt(roman.get(second)));
                for (String key : roman.keySet()) {
                    if (roman.get(key).equals(preresult)) {
                        result = key;
                        System.out.println("Результат операции римских чисел: " + result);
                    }
                }

            } else if (operand.equals(minus)) {
                String preresult = String.valueOf(Integer.parseInt(roman.get(first)) - Integer.parseInt(roman.get(second)));
                if (Integer.parseInt(preresult) <= 0) {
                    throw new IOException();
                }
                for (String key : roman.keySet()) {
                    if (roman.get(key).equals(preresult)) {
                        result = key;
                        System.out.println("Результат операции римских чисел: " + result);
                    }
                }

            } else if (operand.equals(divide)) {
                String preresult = String.valueOf(Integer.parseInt(roman.get(first)) / Integer.parseInt(roman.get(second)));
                for (String key : roman.keySet()) {
                    if (roman.get(key).equals(preresult)) {
                        result = key;
                        System.out.println("Результат операции римских чисел: " + result);
                    }
                }

            } else if (operand.equals(multiply)) {
                String preresult = String.valueOf(Integer.parseInt(roman.get(first)) * Integer.parseInt(roman.get(second)));
                for (String key : roman.keySet()) {
                    if (roman.get(key).equals(preresult)) {
                        result = key;
                        System.out.println("Результат операции римских чисел: " + result);
                    }
                }

            }
        } else {
            throw new IOException();
        }
//        Rimlin rimlin = Rimlin.I;
//        System.out.println(rimlin.getTranslation());

            return result;
        }

}

