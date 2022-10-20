package com.javastream;

import java.util.Arrays;

public class LetterCount {

    public static void main(String[] args) {
        getTotalNumberOfLettersOfNamesLongerThanFive("A","b","c");
    }

    //Array elemanlarını al => stream()
    //5 ten uzun isimleri filtrele => filter()
    //Geri kalan listedeki tüm harflerin sayısını getir => mapToInt
    //Harf sayılarını topla => sum()

    public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
         Arrays.asList(names)
                 .stream().filter(name -> name.length() > 5).mapToInt(String::length).sum();

         return 0;
    }
}
