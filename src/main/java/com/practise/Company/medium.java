package com.practise.Company;

import com.jsoniter.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
class Paragraph {
    String id;
    String text;
}
@Setter
@Getter
@NoArgsConstructor
class Section {
    String id;
    int startIndex;
}
@Setter
@Getter
@NoArgsConstructor
class PostContent {
    Paragraph[] paragraphs;
    Section[] sections;
}

class Solution {
    public static String solution(String postContentString) {
        PostContent postContent = JsonIterator.deserialize(postContentString, PostContent.class);
        //postContent.
        // Type your solution here
        return postContentString;
    }
}


