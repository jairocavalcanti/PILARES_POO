package Herança.Programa2;

public class Soldado extends RegistroPoliciais {

    private String arma;


    public Soldado(String nome, String patente, Integer id, String arma) {
        super(nome, patente, id);
        this.arma = arma;
    }
    
    
    public void infosoldado(){
        super.infopoliciais();
        System.out.println("Arma utilizada: " + this.arma);
    }


}
