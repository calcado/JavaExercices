import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        String[] array1 = { "Morango", "Tomate", "Melao", "Banana" };
        String[] array2 = { "Morango", "Melancia", "Melao", "Banana" };

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.println(array2[j]);
                }

            }

        }

    }
}
