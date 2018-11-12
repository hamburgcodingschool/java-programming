package com.hamburgcodingschool.session4.collections;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // ArrayList
        List<String> strings = new ArrayList<>();

        // LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");
        linkedList.add("b");
        linkedList.add("a");
        linkedList.removeLastOccurrence("a");
        for (String name : linkedList) {
            // ...
        }

        // removeFirst(), removeLast()
        // removeFirstOccurence(), removeLastOccurence()
        // poll(), pop()
        // push(Object o)
        // good for: frequent insertions/deletions/updates

        // HashSet
        Set<String> stringSet = new HashSet<>();
        stringSet.add("a");
        stringSet.add("b");
        stringSet.add("c");
        stringSet.add("d");
        stringSet.add("e");
        stringSet.add("f");
        stringSet.add("ab");
        stringSet.add("abc");
        stringSet.add("abcd");

        // HashMap
        Map<Integer, String> integerStringMap = new HashMap<>();
        integerStringMap.put(1, "Alice");
        integerStringMap.put(2, "Bob");
        integerStringMap.put(3, "Chris");
        integerStringMap.put(42, "Teresa");
        String name = integerStringMap.get(3);
        Set<Integer> keys = integerStringMap.keySet();
        Collection<String> values = integerStringMap.values();
        Set<Map.Entry<Integer, String>> entrySet = integerStringMap.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key);
            System.out.println("Value: " + value);
        }

        // keySet
        // valueSet
        // entrySet, Entry<T, S>

        // SortedMap

        // Concurrency:
        // BlockingQueue
        // ConcurrentMap

        // Other stuff:
        // TreeMap, TreeSet
        // LinkedHashSet, LinkedHashMap

        Collections.sort(linkedList, Collections.reverseOrder());


        // Collections.sort(list);
        // Collections.sort(list, Collections.reverseOrder();

        // Sort by Comparator

        // Collections.EMPTY_LIST
        // Collections.EMPTY_SET
        // Collections.EMPTY_MAP

        // Arrays:
        Student micha = new Student(1, "Micha", "Address 1");
        Student simon = new Student(2, "Simon", "Address 2");
        Student lisa = new Student(3, "Lisa", "Address 3");
        List<Student> students = new ArrayList<>();
        students.add(lisa);
        students.add(micha);
        students.add(simon);
        Collections.sort(students, new SortById());
        for (Student student : students) {
            System.out.println(student.name);
        }

        List<String> empty = Collections.EMPTY_LIST;
        Set emptySet = Collections.EMPTY_SET;
        Map emptyMap = Collections.EMPTY_MAP;



        List<Student> studentList = Arrays.asList(micha, simon, lisa);


        Set<Student> studentSet = Set.of(micha, simon, lisa); // Java 9

        studentList.stream() // Java 8
                .filter(student -> student.id > 2)
                .forEach(System.out::println);
    }
}
