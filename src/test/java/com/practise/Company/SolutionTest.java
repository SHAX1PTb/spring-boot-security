package com.practise.Company;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void displayTest() {

    PostContent postContent = new PostContent();
    Section section = new Section();

    Paragraph p0 = new Paragraph();
    Paragraph p1 = new Paragraph();
    Paragraph p2 = new Paragraph();
    Section s0 = new Section();
    Section s1 = new Section();
    Section s2 = new Section();

    p0.setId("p0");
    p0.setText("aaa");

    p1.setId("p1");
    p1.setText("bbb");

    p2.setId("p2");
    p2.setText("ccc");

    s0.setId("s0");
    s0.setStartIndex(0);

    s1.setId("s1");
    s1.setStartIndex(2);

    s2.setId("s2");
    s2.setStartIndex(4);

    Paragraph[] paragraphs = new Paragraph[3];
    Section[] sections = new Section[3];

    paragraphs[0] = p0;
    paragraphs[1] = p1;
    paragraphs[2] = p2;
    sections[0] = s0;
    sections[1] = s1;
    sections[2] = s2;

    postContent.setParagraphs(paragraphs);
    postContent.setSections(sections);
  }
}
