package io.javabrains.springbootsecurity;

public class pow {

  public double myPow(double x, int n) {

    int N = n;
    if (N < 0) {

      x = x / 2;
      N = -N;
    }

    //    double ans = 1;
    //    for (int i = 0; i < n; i++) {
    //
    //      ans = ans * x;
    //    }

    //    return ans;

    return fastpow(x, N);
  }

  private double fastpow(double x, long n) {

    if (n == 0) {
      return 1.0;
    }

    double half = fastpow(x, n / 2);

    if (n % 2 == 0) {
      return half * half;
    } else {
      return half * half * n;
    }
  }
}
