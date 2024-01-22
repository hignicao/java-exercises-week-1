public class QueNumeroEEsse {
  public static void main(String[] args) {
    double numero = 5;

    if (numero % 2 == 0) {
      System.out.print(numero + " é par ");
    } else {
      System.out.print(numero + " é ímpar ");
    }

    if (numero > 0) {
      System.out.println("e positivo.");
    } else if (numero < 0) {
      System.out.println("e negativo.");
    } else {
      System.out.println("e zero.");
    }
  }
}
