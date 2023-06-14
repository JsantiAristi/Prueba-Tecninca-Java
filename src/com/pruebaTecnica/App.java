package com.pruebaTecnica;

import java.time.LocalDate;
import java.util.*;

public class App {
    private void m1InvertString(String text){
        String[] array = text.split("");
        StringBuilder newText = new StringBuilder();

        for (int i = array.length; i > 0; i--) {
            newText.append(array[i - 1]);
        }
        System.out.println(newText);
    }

    private void m1InvertString2(String text){
        String newText = new StringBuilder(text).reverse().toString();
        System.out.println(newText);
    }

    private  void m2IsCapicua(int number){
        String numberText = String.valueOf(number);
        String reverseNumber = new StringBuilder(numberText).reverse().toString();

        if (numberText.equals(reverseNumber)){
            System.out.println("Is capicua");
        } else {
            System.out.println("Not Capicua");
        }
    }

    private void m3CountCharacterTimes(String text){
        int counter[] = new int[256];

        for ( int i = 0; i < text.length(); i++ ) {
            counter[text.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (counter[i] != 0){
                System.out.println((char)i + ": " + counter[i]);
            }
        }
    }
    private void m4RepeatedCharacter(String text){
        int counter[] = new int[256];

        for ( int i = 0; i < text.length(); i++ ) {
            counter[text.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (counter[i] > 1){
                System.out.println((char)i + ": " + counter[i]);
            }
        }
    }
    private void m5MultipleOf2(int number){
        if (number % 2 == 0){
            System.out.println("Is multiple");
        }
    }
    private void m6IsLeaapYear(int year){
        boolean isLeapYear = LocalDate.of(year,1,1).isLeapYear();
        System.out.println(isLeapYear);
    }
    private void m7RandomOrderString(String text){
        String[] array = text.split("");
        List<String> list = Arrays.asList(array);
        Collections.shuffle(list);
        list.forEach(System.out::println);
    }
    private void m8GetOnlyNotDuplicate(List<Integer> list){
        Set<Integer> set = new HashSet<>(list);
        set.forEach(System.out::println);
    }
    private void m9CheckIfVowelIsPresent(String text){
        String[] array = text.split("");
        boolean isPresent = false;

        for(String valor : array){
            if(valor.equals("a") || valor.equals("e") || valor.equals("i") || valor.equals("o") || valor.equals("u")){
                isPresent = true;
                break;
            }
        }
        System.out.println(isPresent);
    }
    private void m9CheckIfVowelIsPresent2(String text){
        boolean result = text.matches(".+[aeiou].*");
        System.out.println(result);
    }
    private void m9CheckIfVowelIsPresent3(String text){
       boolean rpta = Arrays.asList(text.split("")).stream().anyMatch( s -> s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u"));
       System.out.println(rpta);
     }
    private boolean m10Palindromo(String text){
        boolean result = true;
        int length = text.length();

        for (int i = 0; i < length/2; i++) {
            if(text.charAt(i) != text.charAt(length - i - 1)){
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        App app = new App();
        app.m1InvertString("mitocode");
        app.m1InvertString2("mitocode");
        app.m2IsCapicua(515);
        app.m3CountCharacterTimes("santiago");
        app.m4RepeatedCharacter("santiago");
        app.m6IsLeaapYear(2024);
        app.m7RandomOrderString("mitocode");
        app.m8GetOnlyNotDuplicate(Arrays.asList(1,2,3,5,5,4,4));
        app.m9CheckIfVowelIsPresent("mc");
        app.m9CheckIfVowelIsPresent2("ma");
        System.out.println(app.m10Palindromo("oro"));
    }
}
