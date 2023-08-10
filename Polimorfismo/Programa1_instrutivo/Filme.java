package Polimorfismo.Programa1_instrutivo;

//Classe 'filme' herdando metodos e atributos de classe mae 'video'
public class Filme extends Video {

    private String audio;
    private String legenda;

    public Filme(String nome) {
        super(nome);
        this.audio = "portugues";
        this.legenda = "nenhuma";
    }

    /*metodo da classe filme sobreescrito e 'chamando' 'super.play'
    caso queira aproveitar as funçoes do metodo originaç da classe mae*/
  
    //metodo get abaixo utilizado para acessar o atributo privado 'nome' na classe mae Video
    //Annotation "override" utilizada para sobrescrever metodo de mesmo nome (play) ao metodo da classe mae (play)
    @Override
    public void play(){
        System.out.println("Play: filme -- " + getNome());
        //super.play();
    }
    
    public void play(String audio){
    //Refrencias de atributos a assinaturas devem acontecer antes da impressao do metodo toString()
    //Isso evita que as definiçoes anteriores sejam impressas novamente
        this.audio = audio;
        System.out.println("Play: " + toString()); 
    }

    public void play(String audio, String legenda){
        this.audio = audio;
        this.legenda = legenda;
        System.out.println("Play: " + toString()); 
      
    }


    //Metodo to string imprimindo atributos da classe "Filme" e da classe mãe "Video"
    @Override
    public String toString() { 
        return "Filme [ audio = " + audio + ", legenda = " + legenda + ", Nome = " + getNome()  + " ]";
    }

    
    
    
    
}
