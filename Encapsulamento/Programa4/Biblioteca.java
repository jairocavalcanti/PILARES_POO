package Encapsulamento.Programa4;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    List<Livro> lista_livro;

    public Biblioteca(){
        lista_livro = new ArrayList<>();
    }

    //Metodo que adiciona livro na biblioteca
    public void adicionarLivro(Livro livro){
       lista_livro.add(livro);
    }

    //Método para listar todos os livros na biblioteca
    public void listarLivros(){
        for(Livro lis: lista_livro){
            System.out.println(lis);
        }
    }
    
}
