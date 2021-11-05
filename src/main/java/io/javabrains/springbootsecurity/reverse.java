package io.javabrains.springbootsecurity;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class reverse {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        Stack stack = new Stack();

        Iterator ee = linkedList.listIterator();

        while(ee.hasNext()){

            stack.push(ee.next());
        }

        Iterator ef = stack.iterator();

//        while(ef.hasNext()){
//
//            System.out.println(ef.next());
//        }

        while(stack.size() > 0){
            System.out.println(stack.pop());
        }


    }
}
