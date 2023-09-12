package Encapsulamento.Programa4;

public class Livro {
    
    private String titulo;
    private String autor;
   
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }


    
    @Override
    public String toString() {
        return "Livro [ Titulo = " + titulo + ", Autor = " + autor + " ]";
    }

    
    

}
