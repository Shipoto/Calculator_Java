import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("Ввведите выражение для вычисления: ");
        String input = in.nextLine();
        calc(input);
//         автоматический ввод
//        calc("X * IX");
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

        // Создаем hashmap для проверки цифр от 1 до 10
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

        // Создаем hashmap для цифр от 1 до 100
        HashMap<String, String> romanHundered = new HashMap<>();
        romanHundered.put("I", "1");
        romanHundered.put("II", "2");
        romanHundered.put("III", "3");
        romanHundered.put("IV", "4");
        romanHundered.put("V", "5");
        romanHundered.put("VI", "6");
        romanHundered.put("VII", "7");
        romanHundered.put("VIII", "8");
        romanHundered.put("IX", "9");
        romanHundered.put("X", "10");
        romanHundered.put("XI", "11");
        romanHundered.put("XII", "12");
        romanHundered.put("XIII", "13");
        romanHundered.put("XIV", "14");
        romanHundered.put("XV", "15");
        romanHundered.put("XVI", "16");
        romanHundered.put("XVII", "17");
        romanHundered.put("XVIII", "18");
        romanHundered.put("XIX", "19");
        romanHundered.put("XX", "20");
        romanHundered.put("XXI", "21");
        romanHundered.put("XXII", "22");
        romanHundered.put("XXIII", "23");
        romanHundered.put("XXIV", "24");
        romanHundered.put("XXV", "25");
        romanHundered.put("XXVI", "26");
        romanHundered.put("XXVII", "27");
        romanHundered.put("XXVIII", "28");
        romanHundered.put("XXIX", "29");
        romanHundered.put("XXX", "30");
        romanHundered.put("XXXI", "31");
        romanHundered.put("XXXII", "32");
        romanHundered.put("XXXIII", "33");
        romanHundered.put("XXXIV", "34");
        romanHundered.put("XXXV", "35");
        romanHundered.put("XXXVI", "36");
        romanHundered.put("XXXVII", "37");
        romanHundered.put("XXXVIII", "38");
        romanHundered.put("XXXIX", "39");
        romanHundered.put("XL", "40");
        romanHundered.put("XLI", "41");
        romanHundered.put("XLII", "42");
        romanHundered.put("XLIII", "43");
        romanHundered.put("XLIV", "44");
        romanHundered.put("XLV", "45");
        romanHundered.put("XLVI", "46");
        romanHundered.put("XLVII", "47");
        romanHundered.put("XLVIII", "48");
        romanHundered.put("XLIX", "49");
        romanHundered.put("L", "50");
        romanHundered.put("LI", "51");
        romanHundered.put("LII", "52");
        romanHundered.put("LIII", "53");
        romanHundered.put("LIV", "54");
        romanHundered.put("LV", "55");
        romanHundered.put("LVI", "56");
        romanHundered.put("LVII", "57");
        romanHundered.put("LVIII", "58");
        romanHundered.put("LIX", "59");
        romanHundered.put("LX", "60");
        romanHundered.put("LXI", "61");
        romanHundered.put("LXII", "62");
        romanHundered.put("LXIII", "63");
        romanHundered.put("LXIV", "64");
        romanHundered.put("LXV", "65");
        romanHundered.put("LXVI", "66");
        romanHundered.put("LXVII", "67");
        romanHundered.put("LXVIII", "68");
        romanHundered.put("LXIX", "69");
        romanHundered.put("LXX", "70");
        romanHundered.put("LXXI", "71");
        romanHundered.put("LXXII", "72");
        romanHundered.put("LXXIII", "73");
        romanHundered.put("LXXIV", "74");
        romanHundered.put("LXXV", "75");
        romanHundered.put("LXXVI", "76");
        romanHundered.put("LXXVII", "77");
        romanHundered.put("LXXVIII", "78");
        romanHundered.put("LXXIX", "79");
        romanHundered.put("LXXX", "80");
        romanHundered.put("LXXXI", "81");
        romanHundered.put("LXXXII", "82");
        romanHundered.put("LXXXIII", "83");
        romanHundered.put("LXXXIV", "84");
        romanHundered.put("LXXXV", "85");
        romanHundered.put("LXXXVI", "86");
        romanHundered.put("LXXXVII", "87");
        romanHundered.put("LXXXVIII", "88");
        romanHundered.put("LXXXIX", "89");
        romanHundered.put("XC", "90");
        romanHundered.put("XCI", "91");
        romanHundered.put("XCII", "92");
        romanHundered.put("XCIII", "93");
        romanHundered.put("XCIV", "94");
        romanHundered.put("XCV", "95");
        romanHundered.put("XCVI", "96");
        romanHundered.put("XCVII", "97");
        romanHundered.put("XCVIII", "98");
        romanHundered.put("XCIX", "99");
        romanHundered.put("C", "100");

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
                for (String key : romanHundered.keySet()) {
                    if (romanHundered.get(key).equals(preresult)) {
                        result = key;
                        System.out.println(preresult);
                        System.out.println("Результат операции римских чисел: " + result);
                    }
                }

            } else if (operand.equals(minus)) {
                String preresult = String.valueOf(Integer.parseInt(roman.get(first)) - Integer.parseInt(roman.get(second)));
                if (Integer.parseInt(preresult) <= 0) {
                    throw new IOException();
                }
                for (String key : romanHundered.keySet()) {
                    if (romanHundered.get(key).equals(preresult)) {
                        result = key;
                        System.out.println("Результат операции римских чисел: " + result);
                    }
                }

            } else if (operand.equals(divide)) {
                String preresult = String.valueOf(Integer.parseInt(roman.get(first)) / Integer.parseInt(roman.get(second)));
                for (String key : romanHundered.keySet()) {
                    if (romanHundered.get(key).equals(preresult)) {
                        result = key;
                        System.out.println("Результат операции римских чисел: " + result);
                    }
                }

            } else if (operand.equals(multiply)) {
                String preresult = String.valueOf(Integer.parseInt(romanHundered.get(first)) * Integer.parseInt(romanHundered.get(second)));
                for (String key : romanHundered.keySet()) {
                    if (romanHundered.get(key).equals(preresult)) {
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

