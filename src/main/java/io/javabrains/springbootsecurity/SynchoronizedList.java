package io.javabrains.springbootsecurity;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchoronizedList {

    public static void main(String[] args) {

        List<String> name = Collections.synchronizedList(new ArrayList<String>());
        name.add("java");
        name.add("Python");
        name.add("Ruby");


        synchronized (name) {

            Iterator it = name.listIterator();

            while (it.hasNext()) {

                System.out.println(it.next());
            }
        }

        CopyOnWriteArrayList<String> aa = new CopyOnWriteArrayList<>();

        aa.add("Tom");
        aa.add("Steve");
        aa.add("Navin");

        Iterator a = aa.listIterator();

        while(a.hasNext()){
            System.out.println(a.next());
        }
        Map<Integer,Integer> mp = new HashMap<>();

        ConcurrentHashMap<Integer,String> ab = new ConcurrentHashMap<>();
        ab.put(1,"Shankar");
        ab.put(2,"Nagaratna");


        System.out.println(ab);

        List<Integer> number = new ArrayList<>(Arrays.asList(1,2,3,4,1,2,3,4));

        TreeSet treeSet = new TreeSet(number);

        System.out.println(treeSet);

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(number);
        System.out.println(linkedHashSet);






    }
}
