package pl.agnieszka;

import java.util.*;

public class SetApp {

    public static void addToSet(Set<String> set) {
       set.add("jo");
       set.add("loji");
       set.add("jtotot");
       set.add("tur");
       set.add("auryrykoo");
       set.add("koyiut");
       set.add("duduk");
    }

    public static void showSet(Set<String> set){
        for (String text:set) {
            System.out.println(text);
        }
    }


    public static void main(String[] args) {

        //niech zbiory przechowują Stringi
        //utworzyć HashSet
        //utworzyć TreeSet
        //utworzyć LinkedHashSet
        //dodać elementy do HashSet
        //dodać elementy do TreeSet
        //dodać elementy do LinkedHashSet
        //wyświetlić elementy zbiorów, for each

        HashSet<String> hashset = new HashSet<>();
        System.out.println("Hashset: ");
        addToSet(hashset);
        showSet(hashset);
        System.out.println();
        TreeSet<String> treeSet = new TreeSet<>();
        System.out.println("TreeSet: ");
        addToSet(treeSet);
        showSet(treeSet);
        System.out.println();

        TreeSet<String> treeSetComparator = new TreeSet<String>((o1, o2) -> o1.length() - o2.length());
        System.out.println("TreeSetComparator: ");
        addToSet(treeSetComparator);
        showSet(treeSetComparator);

        System.out.println();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        System.out.println("LinkedHashSet: ");
        addToSet(linkedHashSet);
        showSet(linkedHashSet);









    }
}
