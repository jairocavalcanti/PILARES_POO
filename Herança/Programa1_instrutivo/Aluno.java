package Herança.Programa1_instrutivo;

/*
Classe "Aluno" extendendo para classe "Pessoa"
Isso significa que todos os atributos definidos na classe "Pessoa"
serão definidos como padrao na classe "Aluno"
*/

/*
Ao instanciar um objeto da classe "Aluno" os atributos de "Pessoa"
precisarão ser definidos
Atributos unicos da classe "Aluno" tambem podem ser criados,
estes serão definidos junto com os atributos de "Pessoa"
*/ 

public class Aluno extends Pessoa {
    
    //Atributo único da classe "Aluno"
    private int ra;

    public Aluno(String nome, String cpf,int ra ) {
        /* 
        'Super' faz uma referencia aos atributos da classe mãe
         sendo assim os atributos serao instanciados juntos com os atributos dessa classe 
        */
        super(nome, cpf);
        this.ra = ra;
      
    }

    @Override
    public void imprime(){
        /*
         'Super' abaixo 'chama' o metodo 'imprime' da classe mae,
          assim serao imprimidos os atributos 'padrao' como definido
          no metodo 'imprime' na classe mae 'Pessoa'
         */
        super.imprime();
        System.out.println("ra: " + this.ra);

    }
   
    

    
}
