# COLLECTIONS

# Kolekcje

### W jaki sposób wygląda hierarchia interfejsów związana z kolekcjami?

Nadrzędnym interfejsem jest interfejs Collection. Jest podstawowym interfejsem, ma najmniej metod i są to metody generyczne.
Pochodnymi są: 
* List
* Set
    * pochodną jest SortedSet
* Queue
* Deque

Obok hierarchii jest:
* Map
    * SortedMap (pochodna Map)


### Jakie są podstawowe implementacje poszczególnych interfejsów?

Podstawowymi implementacjami interfejsów są:
* List: 
    * ArrayList
    * LinkedList
    
* Set:
    * HashSet
    * TreeSet
    * LinkedHashSet
    
* Queue:
    * PriorityyQueue
    * LinkedList

* Deque: 
    * ArrayDeque
    * LinkedList
    
* Map:
    * HashMap
    * TreeMap


### W których kolekcjach elementy są sortowane i w jaki sposób?

Kolekcje, których elementy możemy posortować:
* ArrayList, LinkedList - możemy wykorzystać metodę sort i podać opcjonalnie komparator

Kolekcje, które przechowują elementy w sposób posortowany:
* TreeSet - może wykorzystywać naturalny porządek elementów, albo może wykorzystywać własny komparator
* LinkedHashSet - przechowuje elementy w kolejności wstawienia
* PriorityQueue - naturalny porządek lub komparator
* TreeMap - posortowane po kluczu
* LinkedHashMap - przechowuje elementy w kolejności wstawienia kluczy

*offtop: drzewo czerwono-czarne -> rodzaj drzewa, które dba o swoją strukturę, aby nie stało się listą;
sprawia, że drzewo układa się tak, by było jak najniższe (czyli jak najbardziej optymalne) na pomocą obrotów.
chodzi o to, by złożonośc logarytmiczna była jak najmniej złożona*

### Implementacje interfejsu List – złożoność operacji

* Napisać aplikację wykorzystującą różne implementacje List i sprawdzić różnice w operacjach dodawania na początek listy, usuwania z początku listy, przeglądania całej listy

* Wyniki:
* array list:
    * addElementsToFront: 5449 miliseconds
    * addElementsToBack: 14 miliseconds
    * iterateList: 9 miliseconds
    * iterateListForEach: 10 miliseconds
    * deleteElementsFromFront: 19696 miliseconds

* linked list:
    * addElementsToFront: 14 miliseconds
    * addElementsToBack: 13 miliseconds
    * iterateList: 173924 miliseconds
    * iterateListForEach: 28 miliseconds
    * deleteElementsFromFront: 16 miliseconds

### Do których kolekcji można wstawiać wartości null?

* Kolekcje, do których można wstawiać null: ArrayList, LinkedList, LinkedHashSet
* Kolekcje, do których nie można wstawiać null: TreeSet, TreeMap, PriorityQueue


### Napisać operacje wykorzystującą różne implementacje Set i sprawdzić różnice w operacjach dodawania do zbioru

Miejsce na odpowiedź
