package com.xworkz.collection;

import java.util.*;
import java.util.function.Predicate;

public class CollectionLinkedList {
    public static void main(String[] args) {
        Collection<String> collection =new LinkedList<>();



        collection.add("hiii");
        collection.add("hello");
        collection.add("hi");
        collection.add("Hello");
        collection.add("namasthe");
        collection.add("yooo");


        collection.addAll(collection);
        collection.toArray();
        collection.clear();
        collection.contains("queen");
        collection.containsAll(collection);
        collection.hashCode();
        collection.isEmpty();
        collection.parallelStream();
        collection.stream().toArray();
        collection.remove("yooo");
        collection.removeAll(collection);
        collection.parallelStream();
        Predicate p = null;
        collection.removeIf(p);
        collection.retainAll(collection);
        collection.addAll(collection);


        Iterator<String> iterator=collection.iterator();
        while(iterator.hasNext())
        {
            String message=iterator.next();
        }
        ListIterator listIterator= (ListIterator) collection.iterator();
        listIterator.add("gygf");
        listIterator.next();
    }

}
