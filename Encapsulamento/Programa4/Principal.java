package Encapsulamento.Programa4;

public class Principal { 
  public static void main(String[] args) {
     Biblioteca bibli = new Biblioteca();
     
     Livro livro1 = new Livro("Relatos de um gato viajante", "Charles Bukowski");
     Livro livro2 = new Livro("Declinio de um homem", "Charles Bukowski");

     System.out.println();

     bibli.adicionarLivro(livro1);
     bibli.adicionarLivro(livro2);

     System.out.println("Livros disponiveis na biblioteca: ");
     bibli.listarLivros();
     
}
    
}
