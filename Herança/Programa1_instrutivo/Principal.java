package Herança.Programa1_instrutivo;

public class Principal {
    
    public static void main(String[] args) {
        
        System.out.println();

        Pessoa pe = new Pessoa("Carlos", "4567");
        pe.imprime();

        System.out.println();
        
        Aluno al = new Aluno("Jairo","28394",12341234);
        al.imprime();
   
        System.out.println();

        Professor pro = new Professor("Osvaldo","9084", 1220f);
        pro.imprime();

    }


}
