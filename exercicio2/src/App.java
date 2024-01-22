import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args){
        
        List<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0);
        fibonacci.add(1);
        int tamanhoArray = 15;
        int primeiroIncide = 0;
        int segundoIndice =1;


        for(int i = 0 ; i < tamanhoArray; i++){
            int soma = fibonacci.get(primeiroIncide) + fibonacci.get(segundoIndice);

            System.out.print(fibonacci.get(primeiroIncide)+ " "); 

            fibonacci.add(soma);  
            primeiroIncide = fibonacci.size()-2;

            segundoIndice = fibonacci.size()-1;
                              
        }      

    }
}
