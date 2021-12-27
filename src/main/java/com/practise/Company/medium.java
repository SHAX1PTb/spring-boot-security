package com.practise.Company;

import com.jsoniter.JsonIterator;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@ToString
@AllArgsConstructor
class Paragraph {
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
class Section {
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
class PostContent {
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

class Solution {
  public static String solution(String postContentString) {

    var message1 = postContentString.split( "postContentString:");
    System.out.println(message1[1]);

    PostContent postContent = JsonIterator.deserialize(message1[1], PostContent.class);

    List<Section> s = new ArrayList<>();
    List<Paragraph> p = new ArrayList<>();
    List<Integer> integers = new ArrayList<>();

    StringBuilder ss = new StringBuilder();

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
        ss.append("\n");
        k++;
      }
    //  System.out.println("---");
      ss.append("-");
      ss.append("\n");
    }

    for (int z = k; z < p.size(); z++) {

   //   System.out.println("z"+(p.size()-1));
 //     System.out.println(p.get(z).getText());
    //  System.out.println(p.get(z).text+"\n");
      ss.append(p.get(z).text);
      if(z !=(p.size()-1)){
        ss.append("\n");
      }
    }

    System.out.println(ss.toString());
    return ss.toString();
  }
}
