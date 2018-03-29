package pl.agnieszka;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * http://dominisz.pl
 * 25.03.2018
 */
public class App {

    private static Random r = new Random();

    public static void addElementsToFront(List<Integer> list, int count){

        long startTime = System.currentTimeMillis();
        int x = r.nextInt();
        for(int i = 0 ; i < count; i++){
        list.add(0, x);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("addElementsToFront: " + (endTime - startTime) + " miliseconds");
    }

    public static void addElementsToBack(List<Integer> list, int count){

        long startTime = System.currentTimeMillis();
        int x = r.nextInt();
        for(int i = 0 ; i < count; i++){
        list.add(x);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("addElementsToBack: " + (endTime - startTime) + " miliseconds");
    }

    public static void addNrandomElementsToBack(){}

    public static void iterateList(List<Integer> list){
        long startTime = System.currentTimeMillis();

        for(int i = 0 ; i < list.size(); i++){
            Integer element = list.get(i);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("iterateList: " + (endTime - startTime) + " miliseconds");
    }

    public static void iterateListForEach(List<Integer> list){
        long startTime = System.currentTimeMillis();

        for (Integer integer: list) {
            Integer element = integer;
        }

        long endTime = System.currentTimeMillis();
        System.out.println("iterateListForEach: " + (endTime - startTime) + " miliseconds");
    }

    public static void deleteElementsFromFront(List<Integer> list){

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

        //usunąc wszystkie elmenty z listy poprzez usuwanie pierwszego elementu listy

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
        iterateList(linkedList);
        iterateListForEach(linkedList);
        //usunąc wszystkie elmenty z listy poprzez usuwanie pierwszego elementu listy

        //sprawdzić, któ®e implementacje są dłuższe, należy zmierzyć czas każdej z operacji używając
        //metody currentimemillis klasy System



    }
}
