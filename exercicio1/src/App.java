public class App {
    public static void main(String[] args) throws Exception {
              
    int numero = 9;

        if(numero % 2 == 0){
            if(numero >= 0){
                System.out.println("é par e positivo");            
            } else{
                System.out.println("é par e negativo");
            }
        } else{            
            if(numero >= 0){
                System.out.println("é impar e positivo");            
            } else{
                System.out.println("é impar e negativo");
            }
        }

    }
}
