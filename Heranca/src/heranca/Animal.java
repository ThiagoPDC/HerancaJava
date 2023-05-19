package heranca;

public class Animal {
    int intPatas;
    String strCor,  
        strPorte,
        strNome;
    
    public void dormir(){
        System.out.println(strNome + 
                " dorme");
    }
    
    public void brincar(){
        System.out.println(strNome + 
                " brinca" );
    }
    
    public void atributos(){
        System.out.println(strNome + "\n" +
                strCor + "\n" +
                strPorte + "\n Patas:" + 
                intPatas);
    }
}
