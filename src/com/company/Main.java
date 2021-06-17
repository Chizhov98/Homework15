package com.company;

import java.util.*;

public class Main {
    private static List<Integer> arrayList = new ArrayList<>();
    private static Set<Integer> hashSet = new HashSet<>();
    private static Queue<Integer> queue = new PriorityQueue<>();
    private static Deque<Integer> deque = new ArrayDeque<>();
    private static HashMap<String, String> stringMap = new HashMap<>();

    public static void main(String[] args) {
        addIntegersToCollection(arrayList, 1);
        addIntegersToCollection(hashSet, 2);
        addIntegersToCollection(queue, 3);
        addIntegersToCollection(deque, 4);

        stringMap.put("One", "One");
        stringMap.put("Two", "Two");
        stringMap.put("Three", "Three");
        stringMap.put("Four", "Four");
        stringMap.put("Fife", "Fife");

        soutAll();
        clearAll();
        soutAll();
    }

    static void addIntegersToCollection(Collection collection, int step) {
        for (int i = 0; i < 5; i++) {
            collection.add(i * step);
        }
    }

    static void soutAll() {
        System.out.println("ArrayList");
        System.out.println(Arrays.toString(arrayList.toArray()));

        System.out.println("HashSet");
        System.out.println(Arrays.toString(hashSet.toArray()));

        System.out.println("queue");
        System.out.println(Arrays.toString(queue.toArray()));

        System.out.println("deque");
        System.out.println(Arrays.toString(deque.toArray()));

        System.out.println("HashMap");
        System.out.println(Arrays.toString(stringMap.values().toArray(new String[0])));
    }

    static void clearAll() {
        clearCollection(arrayList);
        clearCollection(hashSet);
        clearCollection(queue);
        clearCollection(deque);
        stringMap = new HashMap<String, String>();/**сылок больше нет на старый hashMap, GC его сам удалит.
         ********************************************А мы получаем пустой hashMap с темиже типами ключа и значенияб
         ********************************************как по мне это самый быстрый способ, не прйдеться удлят по элементно */
    }

    static void clearCollection(Collection collection) {
        collection.removeAll(collection);
    }
}
