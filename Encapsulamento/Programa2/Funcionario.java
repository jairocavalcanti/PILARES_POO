package Encapsulamento.Programa2;

public class Funcionario {
    
    private String id_funcionario;
    private String nome_funcionario;
    private String salario_funcionario;
    
    public Funcionario(){
        id_funcionario = "6778";
        nome_funcionario = "Jairo";
        salario_funcionario = "7.800";
    }

    public String getId_funcionario() {
        return id_funcionario;
    }
    public void setId_funcionario(String id_funcionario) {
        this.id_funcionario = id_funcionario;
    }
    public String getNome_funcionario() {
        return nome_funcionario;
    }
    public void setNome_funcionario(String nome_funcionario) {
        this.nome_funcionario = nome_funcionario;
    }
  
    public String getSalario_funcionario() {
        return salario_funcionario;
    }
    public void setSalario_funcionario(String salario_funcionario) {
        this.salario_funcionario = salario_funcionario;
    }

    public String salarioformatado(String salario){
        return "Salario do funcionario -- R$: " + salario + ",00";
    }

    public String nomeformatado(String nome){
        return "Nome do funcionario: " + nome; 
    }

    public String idformatado(String id){
        return "ID do funcionario: #" + id;
    }

}




