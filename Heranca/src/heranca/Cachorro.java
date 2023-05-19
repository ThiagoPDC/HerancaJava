package heranca;

public class Cachorro extends Animal{
    //Atributos
    
    String strRaca;
    
    //comportamentos
    public void latir(){
        System.out.println(strNome + " late" );
    }
    
      @Override
    public void atributos(){
        super.atributos();
        System.out.println(strRaca);
    }
}
