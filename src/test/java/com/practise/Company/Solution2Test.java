/*
 * Copyright (c) 2021.
 * Shankargouda Annigeri
 *
 *
 */

package com.practise.Company;


import org.junit.jupiter.api.Test;

public class Solution2Test {

    @Test
    public void deltaTest() throws InterruptedException {
        var message = "postContentString:{\"paragraphs\":[{\"id\":\"p0\",\"text\":\"aaa\"},{\"id\":\"p1\",\"text\":\"bbb\"},{\"id\":\"p2\",\"text\":\"ccc\"},{\"id\":\"p3\",\"text\":\"ddd\"},{\"id\":\"p4\",\"text\":\"eee\"},{\"id\":\"p5\",\"text\":\"fff\"}],\"sections\":[{\"startIndex\":0,\"id\":\"s0\"},{\"startIndex\":2,\"id\":\"s1\"},{\"startIndex\":4,\"id\":\"s2\"}]}";
        var deltas = "[{\n" +
                "\t\"type\": \"updateParagraph\",\n" +
                "\t\"paragraphIndex\": 0,\n" +
                "\t\"paragraph\": {\n" +
                "\t\t\"text\": \"aaaAAA\"\n" +
                "\t}\n" +
                "}]";

        var deltasAdd = "[{\n" +
                "\t\"type\": \"addParagraph\",\n" +
                "\t\"paragraphIndex\": 1,\n" +
                "\t\"paragraph\": {\n" +
                "\t\t\"text\": \"new\"\n" +
                "\t}\n" +
                "}]";

        var deltasDelete = "[{\n" +
                "\t\"type\": \"deleteParagraph\",\n" +
                "\t\"paragraphIndex\": 5,\n" +
                "\t\"paragraph\": {\n" +
                "\t\t\"text\": \"aaaAAA\"\n" +
                "\t}\n" +
                "}]";
        Solution2.solution(message,deltasAdd);

    }


}