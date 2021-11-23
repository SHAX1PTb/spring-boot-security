public class SquareRoot {

  public Integer calSquareRoot(Integer x) {

    if (x <= 1) return x;
    long num;
    int pivot = 2;
    int left = 2;
    int right = x / 2;

    while (left < right) {

      pivot = left + (right - left) / 2;
      num = pivot * pivot;
      if (num > x) {
        right = pivot - 1;
      } else if (num < x) {
        left = pivot + 1;
      }else
      return pivot;
    }

    return right;
  }
}

//
//  int mySqrt(int x) {
//    long r = x;
//    while (r*r > x)
//      r = (r + x/r) / 2;
//    return (int) r;
//
//  }