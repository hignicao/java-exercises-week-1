public class PiramideNumeros {
  public static void main(String[] args) {
    int numberofLines = 5;

    for (int i = 1; i <= numberofLines; i++) {

      for (int j = 1; j <= i; j++) {
        System.out.print(i);
      }

      System.out.println();
    }
  }
}
