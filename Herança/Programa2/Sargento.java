package Herança.Programa2;

public class Sargento extends RegistroPoliciais {
    
       private String ordens_ao_cabo;

    public Sargento(String nome, String patente, Integer id, String ordens_ao_cabo) {
        super(nome, patente, id);
        this.ordens_ao_cabo = ordens_ao_cabo;
    }

    public void infosargento(){
        super.infopoliciais();
        System.out.println("Ordens ao cabo: " + this.ordens_ao_cabo);

    }
 


}
