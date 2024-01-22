import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        List<String> frutas = new ArrayList<>();
        frutas.add("Morango");
        frutas.add("Tomate");
        frutas.add("Melao");

        List<String> frutas2 = new ArrayList<>();
        frutas2.add("Morango");
        frutas2.add("Melancia");
        frutas2.add("Melao");        

        frutas.retainAll(frutas2);
        for(int i = 0; i<frutas.size();i++ ){
            System.out.println(frutas.get(i));
        }
        

    }
}
