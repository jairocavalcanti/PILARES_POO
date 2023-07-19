package Herança.Programa1_instrutivo;
/*
 Classe Mãe do programa, isso significa que todos os atributos
 definidos aqui serao herdados pelas outras classes através do comando 'Extends'
 */
public class Pessoa {

    private String nome;
    private String cpf;
  
    //Construtor dos atributos da classe, servirá para 'obrigar' a instanciaçao dos mesmos
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
 
    public void imprime(){
        System.out.println("Nome:" + this.nome);
        System.out.println("CPF:" + this.cpf);
    }

   
    
    
}
