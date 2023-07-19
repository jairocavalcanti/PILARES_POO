package Encapsulamento.Programa3;

public class Principal {
    public static void main(String[] args) {
       PainelTesla pan = new PainelTesla();

       System.out.println("-------------------------------------");
     
       pan.abrir_portas_dianteiras();
       pan.abrir_portas_dianteiras();
       pan.fechar_portas_dianteiras();
       
       System.out.println("-------------------------------------");

       pan.abrir_portas_traseiras();
       pan.abrir_portas_traseiras();
       pan.fechar_portas_traseiras();
       
       System.out.println("--------------------------------------");

       pan.ligaradio();
       pan.desligarradio();
       pan.desligarradio();
       pan.ligaradio();
       pan.ligaradio();
     
       System.out.println("--------------------------------------");
      
       pan.aumentarvolume();
       pan.aumentarvolume();
       pan.aumentarvolume();
       pan.diminuirvolume();
       pan.painel_de_midia();
       

    }
}
