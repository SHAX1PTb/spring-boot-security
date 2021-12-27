package com.practise.Company;

import com.jsoniter.JsonIterator;
import lombok.*;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

@Setter
@Getter
@NoArgsConstructor
@ToString
@AllArgsConstructor
class Paragraph2 {
    String id;
    String text;

    @Override
    public String toString() {
        return "{" + "id:" + id + ", text:" + text + "}";
    }
}

@Setter
@Getter
@NoArgsConstructor
@ToString
@AllArgsConstructor
class Section2 {
    String id;
    int startIndex;

    @Override
    public String toString() {
        return "{" + "id='" + id + '\'' + ", startIndex=" + startIndex + '}';
    }
}

@Setter
@Getter
@NoArgsConstructor
@ToString
@AllArgsConstructor
class PostContent2 {
    Paragraph[] paragraphs;
    Section[] sections;

    //    @Override
    //    public String toString() {
    //        return "PostContent{" +
    //                "paragraphs=" + Arrays.toString(paragraphs) +
    //                ", sections=" + Arrays.toString(sections) +
    //                '}';
    //    }
}

@Setter
@Getter
@NoArgsConstructor
@ToString
@AllArgsConstructor
class Delta {
    String type;
    int paragraphIndex;
    Paragraph paragraph;
}

class Solution2 {
    public static String solution(String postContentString, String deltasString) throws InterruptedException {

        var message1 = postContentString.split("postContentString:");
        System.out.println(message1[1]);

        PostContent postContent = JsonIterator.deserialize(message1[1], PostContent.class);
        Delta[] deltas = JsonIterator.deserialize(deltasString, Delta[].class);

        List<Section> s = new ArrayList<>();
        List<Paragraph> p = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();

        StringBuilder ss = new StringBuilder();
        //Map<Integer,String> deltaUpdate = new LinkedHashMap<>();
        List<String> deltaUpdate = new ArrayList<>();

        for (int i = 0; i < postContent.sections.length; i++) {
            s.add(postContent.sections[i]);
        }

        for (int i = 0; i < postContent.paragraphs.length; i++) {
            p.add(postContent.paragraphs[i]);
        }

        for (int i = 0; i < s.size(); i++) {

            integers.add(s.get(i).startIndex);
        }
        int k = 0;

        for (int i = 0; i < integers.size() - 1; i++) {

            while (k < integers.get(i + 1)) {
                // System.out.println(p.get(k).getText());
                ss.append(p.get(k).getText());
                deltaUpdate.add(p.get(k).getText());
                ss.append("\n");
                deltaUpdate.add("\\n");
                k++;
            }
            //  System.out.println("---");
            ss.append("-");
            deltaUpdate.add("-");
            ss.append("\n");
            deltaUpdate.add("\\n");
        }

        for (int z = k; z < p.size(); z++) {

            //   System.out.println("z"+(p.size()-1));
            //     System.out.println(p.get(z).getText());
            //  System.out.println(p.get(z).text+"\n");
            ss.append(p.get(z).text);
            deltaUpdate.add(p.get(z).text);
            if (z != (p.size() - 1)) {
                ss.append("\n");
                deltaUpdate.add("\\n");
            }
        }

        System.out.println(deltaUpdate.toString());


        for (int i = 0; i < deltas.length; i++) {

            // System.out.println(deltas[i].getType());
            String action = deltas[i].getType();

            switch (action) {

                case "updateParagraph":
                case "addParagraph":
                    deltaUpdate.add(deltas[i].getParagraphIndex(), deltas[i].getParagraph().getText());
                    break;

                case "deleteParagraph":
                    deltaUpdate.remove(deltas[i].getParagraphIndex());
                    break;

            }

            System.out.println(deltaUpdate.toString());
        }


        return ss.toString();
    }
}
