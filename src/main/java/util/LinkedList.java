/*
 * Copyright (c) 2021.
 * Shankargouda Annigeri
 *
 *
 */

package util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.List;

/***
 *
 */
public class LinkedList {
    public static final Log log = LogFactory.getLog(LinkedList.class);

    Node head;


    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;

        }


    }


    public void show() {
        Node node = head;
        while (node.next != null) {

            log.info(node.data);
            node = node.next;
        }
        log.info(node.data);
    }

    public void insertAtStart(int data) {

        Node node = new Node();
        node.data = data;
        node.next = null;

        node.next = head;

        head = node;
    }

    public void insertAt(int index, int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (index == 0) {
            insertAtStart(data);
        }else {

            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }

            node.next = n.next;
            n.next = node;
        }
    }

    public void deleteAt(int index){
        if(index == 0){
            head = head.next;
        }else {
            Node n = head;
            Node n1 = null;
            for (int i  =0 ; i < index -1 ;i++){
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
            log.info("n1 is delete "+ n1.data);
            n1 = null;
        }

    }

    public Integer Length(){
        Node node = head;
        Integer count = 0;
        while(node.next != null ){
            count = count+1;
            node = node.next;
        }
        count = count+1;

        log.info("Count:"+count);
        return count;
    }
    public LinkedList removeNthFromEnd(LinkedList head, int n) {

        LinkedList start = new LinkedList();


        return head;
    }
}
