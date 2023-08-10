package Polimorfismo.Programa1_instrutivo;

//Classe mãe do programa, metodos e atributos serao herdados desta classe por outras classes
public class Video {
    
    private String nome;


    public Video(String nome) {
        this.nome = nome;
    }

    public void play(){
        System.out.println("Play: video qualquer");
    }

    //Metodos getter e setter utilizados para acesso aos atributos privados da classe mae
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    


}
