package com.javastream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
            /*
            {
                    {A,B,C}
                    {D,E,F}
             }
             yapmak istiyoruz
              {
                    {A,B,C,D,E,F}
              }
             */
    }

    //Nested List'e ait değerleri al => stream()
    //Her bir elemanı bir listeye ekle => flatMap()
    public static List<String> transform(List<List<String>> collection) {
        List<String> newCollection = new ArrayList<>();
        for (List<String> subCollection : collection) {
            for (String value : subCollection) {
                newCollection.add(value);
            }
        }
        return newCollection;
    }
    public static List<String> transform2(List<List<String>> collection) {
        return collection.stream()
                .flatMap(Collection::stream) // Şu noktada elimizde Stream<Stream<String>> -> Stream<String> buna ulasmamız lazım
                .collect(Collectors.toList());
    }
}
