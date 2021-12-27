/*
 * Copyright (c) 2021.
 * Shankargouda Annigeri
 *
 *
 */

package io.javabrains.springbootsecurity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.jupiter.api.Test;
import util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class WalmartLabsTest {
    public static final Log log = LogFactory.getLog(WalmartLabs.class);

    @Test
    void walMartTest(){

        LinkedList linkedList = new LinkedList();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.insert(5);
        linkedList.deleteAt(linkedList.Length() -2);
        linkedList.show();
        linkedList.removeNthFromEnd(linkedList,2);

    }

}