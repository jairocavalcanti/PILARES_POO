package Herança.Programa2;

public class Principal {
    
    public static void main(String[] args) {
        RegistroPoliciais rp = new RegistroPoliciais("nome do policial","patente do policial", 0000);
        rp.infopoliciais();
     
        System.out.println();

        Soldado sol = new Soldado("Carlos nogueira", "Soldado", 3556, "Ponto 40");
        sol.infosoldado();

        System.out.println();

        Cabo cab = new Cabo("Vinicius do carmo", "Cabo", 4778, "Retornar aos postos");
        cab.infocabo();

        System.out.println();

        Sargento sa = new Sargento("Igor silva", "Sargento", 6778, "Ordenar aos solados que retornem aos postos");
        sa.infosargento();


    }
}
