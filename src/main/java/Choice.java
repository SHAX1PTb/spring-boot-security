import java.util.Arrays;
import java.util.Collections;

public class Choice {

    public boolean Checkstring(String word1 , String word2){

        if(word1.length() != word2.length()){

            return false;
        } else {

            char[] charword1 = word1.toCharArray();
            char[] charword2 = word2.toCharArray();
            Arrays.sort(charword1);
            Arrays.sort(charword2);

            //map<k,v>
            // Sort words
            // ==
            // MAP <k,v>

            //o(n2)
            // k v++

            // k, V--

            // k == 0 , _1 , > 1




        }


        return false;
    }




}
