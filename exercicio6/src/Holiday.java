public class Holiday {
    private String data;
    private String nome;

    Holiday(String data, String nome){
        this.data = data;
        this.nome = nome;    
    }

    public String getData(){
        return this.data;
    }
    public String getNome(){
        return this.nome;
    }
}
