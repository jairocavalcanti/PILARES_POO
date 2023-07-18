package Encapsulamento.Programa2;

public class Principal {
    public static void main(String[] args) {
        Funcionario func = new Funcionario();

        System.out.println();
        
        System.out.println(" -- ATRIBUTOS_DA_CLASSE_FUNCIONARIO_PRÉ_DEFINIDOS --");
        System.out.println(func.getNome_funcionario());
        System.out.println(func.getId_funcionario());
        System.out.println(func.getSalario_funcionario());
        
        System.out.println();

        System.out.println(" -- ATRIBUTOS_FORMATADOS -- ");
        System.out.println(func.nomeformatado(func.getNome_funcionario()));
        System.out.println( func.idformatado(func.getId_funcionario()));
        System.out.println(func.salarioformatado(func.getSalario_funcionario()));
       
       
      

          
    }

}
