package com.practise.LeetCode;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import util.IntNode;
import util.StringNode;

public class IntLLAPP {

    public static final Log log = LogFactory.getLog(IntLLAPP.class);
    public static void main(String[] args) {


        IntNode front = new IntNode(25, null);

        System.out.println(front);

        StringNode strFront = new StringNode("Shankar",null);

        log.info(strFront);
    }

}
