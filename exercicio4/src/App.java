public class App {
    public static void main(String[] args) throws Exception {
        int tamanhoPiramide = 9;
        String string = "";
        for(int i=1 ; i<= tamanhoPiramide; i++){

            for(int j=1; j<=i; j++){
                string += i;
            }
            System.out.println(string);
            string = "";
        }
    }
}
