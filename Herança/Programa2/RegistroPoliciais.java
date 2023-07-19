package Herança.Programa2;

public class RegistroPoliciais {
    
    private String nome;
    private String patente;
    private Integer id;
    
    public RegistroPoliciais(String nome, String patente, Integer id) {
        this.nome = nome;
        this.patente = patente;
        this.id = id;
    }

    public void infopoliciais(){
        System.out.println("Nome do policial: " + this.nome);
        System.out.println("Patente do policial: " + this.patente);
        System.out.println("ID do policial: #" + this.id);
    }
    


}
