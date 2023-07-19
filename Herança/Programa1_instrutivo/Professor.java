package Herança.Programa1_instrutivo;

public class Professor extends Pessoa{

private float salario;

/* 
Classe 'Professor' se comporta exatamente como classe 'Aluno' 
so mudam os atributos unicos de cada uma das classes

!!INSTRUÇÕES NA CLASSE ALUNO!!
*/
    
    public Professor(String nome, String cpf, float salario) {
        super(nome, cpf);
        this.salario = salario;
    }
    
    @Override
    public void imprime(){
        super.imprime();
        System.out.println("Salario: " + this.salario);
    }
}
