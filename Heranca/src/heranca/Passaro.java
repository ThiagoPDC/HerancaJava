package heranca;

public class Passaro extends Animal{
    
    String strEspecie;
    
    public void cantar(){
        System.out.println(strNome + 
                " canta");
    }
    
    @Override
    public void atributos(){
        super.atributos();
        System.out.println(strEspecie);
    }
    
}
