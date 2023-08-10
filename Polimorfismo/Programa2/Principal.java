package Polimorfismo.Programa2;

public class Principal {
    public static void main(String[] args) {
      Produto p = new Produto();
      p.mostradados();
    
      System.out.println("-------------------");

      Produto p2 = new Livro();
      p2.mostradados();
      
      Livro liv = new Livro();
      liv.mostraautor();

     /* Livro lv2 = (Livro) liv;
        lv2.mostraautor();    */

      System.out.println("--------------------");
       
      Produto p3 = new Revista();
      p3.mostradados();
   

    } 
    
}
