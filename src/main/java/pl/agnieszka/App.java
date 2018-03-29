package pl.agnieszka;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * http://dominisz.pl
 * 25.03.2018
 */
public class App {

    private static Random r = new Random();

    public static void measureTimeForOperation(List<Integer> list, Consumer<List<Integer>> operation, String description){
        long startTime = System.currentTimeMillis();
        operation.accept(list);
        long endTime = System.currentTimeMillis();
        System.out.println(description + (endTime - startTime) + " miliseconds");
    }

    //metoda z Consumerem dla dwóch parametrów czyli BiConsumer
    public static void measureTimeForOperation(List<Integer> list, int count, BiConsumer<List<Integer>, Integer> operation,  String description){
        long startTime = System.currentTimeMillis();
        operation.accept(list, count);
        long endTime = System.currentTimeMillis();
        System.out.println(description + (endTime - startTime) + " miliseconds");
    }

    public static void addElementsToFront(List<Integer> list, int count){

        measureTimeForOperation(list, count, (list1, count1) -> {
            for (int i = 0; i < count1; i++) {
                list1.add(0);
            }
        }, "addElementsToFront: ");
    }

    public static void addElementsToBack(List<Integer> list, int count) {

        measureTimeForOperation(list, count, new ListFiller(), "addElementsToBack: ");
    }


                //użycie pętli for oraz wywołanie metody liczącej czas wykonania operacji;
                //metoda ma za parametr interfejs Consumera - powstaje klasa anonimowa

        public static void iterateList(List<Integer> list){
        measureTimeForOperation(list, new Consumer<List<Integer>>() {
            @Override
            public void accept(List<Integer> integers) {
                for(int i = 0; i < list.size(); i++ ){
                    Integer element = list.get(i);
                }
            }
        },"iterateList: ");
    }

    //użycie pętli foreach przy pomocy klasy implmentującej Consumera
    public static void iterateListForEach(List<Integer> list){
       measureTimeForOperation(list, new ForEachOperator(), "iterate list for each: ");
    }

    //wykorzystanie Consumera poprzez wyrażenie lambda
    public static void deleteElementsFromFront(List<Integer> list){
        measureTimeForOperation(list, list1 -> { while(!list.isEmpty()){list.remove(0);}
        }, "deleteElementsFromFront: ");
    }

    public static void main(String[] args) {

        int count = 200000;

        //dla ArrayList
        //utworzyć nową listę

        List<Integer> arraylist = new ArrayList<>();
        System.out.println("array list");
        addElementsToFront(arraylist, count);
        addElementsToBack(arraylist, count);

        //dodać N losowych elementów na koniec listy
        //dodać N losowych elementów na początek listy
        //przejrzeć całą listę
        iterateList(arraylist);
        iterateListForEach(arraylist);
        //usunąc wszystkie elementy z listy poprzez usuwanie pierwszego elementu listy
        deleteElementsFromFront(arraylist);

        //dla LinkedList
        //utworzyć nową listę

        System.out.println();
        List<Integer> linkedList = new LinkedList<>();
        System.out.println("linked list");
        addElementsToFront(linkedList, count);
        addElementsToBack(linkedList, count);
        //dodać N losowych elementów na koniec listy
        //dodać N losowych elementów na początek listy
        //przejrzeć całą listę
       // iterateList(linkedList);
        iterateListForEach(linkedList);
        //usunąc wszystkie elementy z listy poprzez usuwanie pierwszego elementu listy
        deleteElementsFromFront(linkedList);

        //sprawdzić, któ®e implementacje są dłuższe, należy zmierzyć czas każdej z operacji używając
        //metody currentimemillis klasy System



    }
}
