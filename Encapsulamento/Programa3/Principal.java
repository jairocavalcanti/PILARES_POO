package Encapsulamento.Programa3;

public class Principal {
    public static void main(String[] args) {
       PainelTesla pan = new PainelTesla();

       System.out.println("-------------------------------------");
       pan.abrir_portas_dianteiras();
       pan.abrir_portas_dianteiras();
       pan.fechar_portas_dianteiras();
       pan.abrir_portas_traseiras();
       pan.abrir_portas_traseiras();
       pan.fechar_portas_traseiras();
       

    }
}
