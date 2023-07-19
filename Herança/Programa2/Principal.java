package Herança.Programa2;

public class Principal {
    
    public static void main(String[] args) {
        RegistroPoliciais rp = new RegistroPoliciais("nome do policial","patente do policial", 0000);
        rp.infopoliciais();
     
        System.out.println();

        Soldado sol = new Soldado("Carlos nogueira", "Soldado", 3556, "Ponto 40");
        sol.infopoliciais();
    }
}
