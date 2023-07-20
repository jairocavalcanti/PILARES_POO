package Herança.Programa2;

public class Cabo extends RegistroPoliciais {

    private String ordem_ao_soldado;

    public Cabo(String nome, String patente, Integer id, String ordem_ao_soldado) {
        super(nome, patente, id);
        this.ordem_ao_soldado = ordem_ao_soldado;
    }
    
    public void infocabo(){
        super.infopoliciais();
        System.out.println("Ordens ao soldado: " + this.ordem_ao_soldado);
    }


}
