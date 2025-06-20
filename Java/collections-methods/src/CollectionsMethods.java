//sort -all
//        emptyList
//        max
//        EMPTY_LIST()
//        addAll
//        binarySearch
//        checkedCollection
//        checkedList
//        copy
//        disjoint
//        emptyEnumeration
//        emptyIterator
//        listIterator
//        enumeration
//        fill
//        frequency
//        indexOfSublist
//        lastIndexOfSubList
//        list
//        max
//        min
//        nCopies
//        replaceAll
//        reverse
//        roatate
//        shuffule
//        shuffuleAll
//        singletonList
//        swap
//        synchronizedCollection
//        synchList

import java.io.Closeable;
import java.io.IOException;
import java.util.*;

public class CollectionsMethods implements Closeable {
    public static void main(String[] args) {
        List<String> fruit=new ArrayList<String>();
        List<Integer> number=new ArrayList<Integer>();
        Collection<String> collections =new ArrayList<String>();
        fruit.add("Apple");
        fruit.add("Mango");
        fruit.add("Guava");
        fruit.add("Orange");
        fruit.add("grape");
        fruit.add("Pine apple");
        fruit.add("Water apple");


        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        number.add(6);
        number.add(7);
        number.add(8);
        number.add(9);
        number.add(10);
        number.add(11);
        number.add(12);

        collections.addAll(fruit);

        Collections.sort(fruit);
        Collections.sort(fruit);
        Collections.emptyList();
        Collections.max(collections);


        Collections.emptyList();
        Collections.addAll(collections);
        Collections.binarySearch(fruit,"banana");
        Collections.checkedCollection(fruit,String.class);
        Collections.checkedList(fruit,String.class);
        Collections.copy(fruit,fruit);
        Collections.copy(number,number);
        Collections.disjoint(fruit,number);

        Collections.emptyEnumeration();
        Collections.fill(fruit,"appale");
        Collections.indexOfSubList(fruit,number);
        Collections.lastIndexOfSubList(fruit,number);
        Enumeration<String> enumeration=new Enumeration() {
            @Override
            public boolean hasMoreElements() {
                return false;
            }

            @Override
            public Object nextElement() {
                return null;
            }
        };


        Collections.list(enumeration);

        Collections.frequency(fruit,"banana");
        Collections.min(fruit);
        Collections.nCopies(10,"hii");
        Collections.replaceAll(fruit,"Banana","Orange");
        Collections.reverse(fruit);
        Collections.rotate(fruit,0);
        Collections.shuffle(fruit);
        Random random=new Random();
        Collections.shuffle(fruit,random);
        Collections.singletonList("Apple");
        Collections.swap(number,12,13);
        Collections.synchronizedCollection(collections);
        Collections.synchronizedList(fruit);
        System.out.println();
String



    }

    @Override
    public void close() throws IOException {

    }
}
