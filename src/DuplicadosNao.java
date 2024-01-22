import java.util.ArrayList;
import java.util.List;

public class DuplicadosNao {
  public static void main(String[] args) {
    List<String> array1 = new ArrayList<>();
    array1.add("Morango");
    array1.add("Banana");
    array1.add("Maçã");
    array1.add("Uva");
    array1.add("Caqui");

    List<String> array2 = new ArrayList<>();
    array2.add("Manga");
    array2.add("Caqui");
    array2.add("Morango");
    array2.add("Amora");

    System.out.println("Elementos em comum:");

    for (String element : array1) {
      if (array2.contains(element)) {
        System.out.println(element);
      }
    }
  }
}
