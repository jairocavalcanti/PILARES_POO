package Polimorfismo.Programa1_instrutivo;

public class Principal {
    // Polimorfismo 
    // Poli - Muitas
    // Morfismo - multiplas formas
    // Permite que o mesmo nome, represente vários comportamentos diferentes
    
    public static void main(String[] args) {
      
    /*
    Polimorfismo utilizando sobrecarga:
    Metodos de mesmo nome com retornos diferentes
    */
      Filme filme = new Filme("Maze runner");
      filme.play("Russo");
      filme.play("Russo", "Portugues");
   
      /* Metodo play demonstrando comportamentos diferentes : polimorfismo */
   
   
    }



}
