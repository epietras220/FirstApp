package org.pajacyk.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] fruitTable = {"apple", "pear", "plum"};

        List<String> fruitList = Arrays.asList(fruitTable); // to jest tylko widok tablicy dlatego nie można dodac banana ta tablicy
       List<String> fruits = new ArrayList<>(Arrays.asList(fruitTable));
        System.out.println(fruitList);

       // fruitList.add("banana");
        System.out.println(fruitList);
        System.out.println(fruits);


    }
}
