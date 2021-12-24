import java.util.HashMap;
import java.util.Map;

public class GoldmanSachs {

  public Integer maxAvgCalculator(String[][] student) {

    //    System.out.println(student[0][1]);
    //    System.out.println(student.length);

    Map<String, Integer> map = new HashMap<>();

    Integer a = 0;

    Integer count = 0;
    Integer sum = 0;
    for (int i = 0; i < student.length; i++) {

      if (map.get(student[i][0]) == null) {
        count = 1;
        a = Integer.valueOf(student[i][1]);
        //        count++;
      } else {
        count++;
        a = (map.get(student[i][0]) + Integer.valueOf(student[i][1])) / count;
      }

      map.put(student[i][0], a);
    }

    for (int i = 0; i < map.size(); i++) {
      sum = sum + map.get(student[i][0]);
    }

    System.out.println(map.values());
    System.out.println(sum);

    return sum / map.size();
  }
}
