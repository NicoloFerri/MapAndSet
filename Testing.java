package _3esercizi.MapAndSet;

import java.util.*;

public class Testing {
    public static void main(String[] args) {
        Map<String,Integer> months = new LinkedHashMap<>();
        months.put("Gennaio",1);
        months.put("Febbraio",2);
        months.put("Marzo",3);
        months.put("Aprile",4);
        months.put("Maggio",5);
        months.put("Giugno",6);
        months.put("Luglio",7);
        months.put("Agosto",8);
        months.put("Settembre",9);
        months.put("Ottobre",10);
        months.put("Novembre",11);
        months.put("Dicembre",12);

        Set<String> chiavi = months.keySet();

        for (String s : chiavi) {
            System.out.println(s);
        }
        System.out.println("\n");

List<Integer> cardinalMonth = new ArrayList<>(months.values());
        for (Integer integer : cardinalMonth) {
            System.out.println(integer);
        }
        System.out.println("\n");

        Integer[] cardinalMonthArray = new Integer[months.size()];
        months.values().toArray(cardinalMonthArray);

        for (Integer integer : cardinalMonthArray) {
            System.out.println(integer);
        }



    }
}

