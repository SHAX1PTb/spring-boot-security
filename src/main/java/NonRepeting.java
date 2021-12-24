import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class NonRepeting {

  public String nonRepetingChar(String s) {

    char[] s1 = s.toCharArray();

    Map<String, Integer> map = new HashMap<>();
    Integer a = 0;
    for (int i = 0; i < s1.length; i++) {

      if (map.get(String.valueOf(s1[i])) == null) {
        a = 1;
      } else {
        a = a + 1;
      }

      map.put(String.valueOf(s1[i]), a);
    }

    Iterator ee = map.keySet().iterator();

    while (ee.hasNext()) {

      String key = (String) ee.next();
      Integer value = map.get(key);
      if (value == 1) {
        return key;
      }
    }

    return "0";
  }
}
