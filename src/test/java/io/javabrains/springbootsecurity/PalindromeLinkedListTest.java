package io.javabrains.springbootsecurity;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import java.lang.reflect.Executable;
import java.util.*;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertThrows;

public class PalindromeLinkedListTest implements Runnable {
    List<Integer> list = new ArrayList<>();
    Map<Integer, String> hashmap = new HashMap<>();

    public PalindromeLinkedListTest(HashMap hashMap) {
        hashmap.put(1, "One");
        hashmap.put(2, "Two");
        this.hashmap = hashMap;
    }

    @Before
    public void setup(){

        list.add(1);
        list.add(2);
        list.add(2);
        list.add(1);
    }

    @Test
    public void palindromeCompare(){
//        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();

       // PalindromeLinkedList.compare(list);
        assertTrue(String.valueOf(true),PalindromeLinkedList.compare(list));

//        Assert.assertEquals(2,2);



    }

    public PalindromeLinkedListTest() {
    }

    @Test
    public void whenModifyMapDuringIteration_thenThrowExecption() {

        hashmap.put(1, "One");
        hashmap.put(2, "Two");

//        Executable executable = () -> hashmap.forEach((key,value) -> hashmap.remove(1));
//
//        Executable executable1 = () -> hashmap.forEach((integer, s) -> s.length());

       // System.out.println(hashmap.size());
        for(int i =0 ;i< hashmap.size();i++){
            Thread object = new Thread(new PalindromeLinkedListTest((HashMap) hashmap));
            object.start();
        }


        //assertThrows(ConcurrentModificationException.class, executable);
    }

    @Override
    public void run() {

//hashmap.remove(3);
        System.out.println(hashmap.size());
    }
}