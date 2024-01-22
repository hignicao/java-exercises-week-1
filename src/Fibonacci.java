public class Fibonacci {

  public static void main(String[] args) {
    int size = 20;

    for (int i = 0; i < size; i++) {
      System.out.println(setFibonacci(i) + " ");
    }
  }

  public static int setFibonacci(int n) {
    if (n <= 1) {
      return n;
    } else {
      return setFibonacci(n - 1) + setFibonacci(n - 2);
    }
  }
}
