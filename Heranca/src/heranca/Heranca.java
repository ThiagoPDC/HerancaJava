package heranca;

public class Heranca {

    public static void main(String[] args) {
        Cachorro lampeao = 
                new Cachorro();
        lampeao.intPatas = 4;
        lampeao.strCor = "Preto e branco";
        lampeao.strNome = "Lampeão";
        lampeao.strPorte = "Médio";
        lampeao.strRaca = "Indefinida";
        lampeao.atributos();
        lampeao.brincar();
        lampeao.dormir();
        lampeao.latir();
        
        System.out.println("******************");
       
        Cachorro madona = 
                new Cachorro();
        
        madona.intPatas = 3;
        madona.strCor = "Marrom";
        madona.strNome = "Madona";
        madona.strPorte = "Médio";
        madona.strRaca = "Indefinida";
        madona.brincar();
        madona.atributos();
        madona.dormir();
        madona.latir();
        
        System.out.println("********************");
        
        Passaro pacoca = 
                new Passaro();
        pacoca.strCor = "Verde";
        pacoca.strEspecie = "Papagaio";
        pacoca.intPatas = 2;
        pacoca.strNome = "Paçoca";
        pacoca.strPorte = "Médio";
        pacoca.cantar();
        pacoca.atributos();
        pacoca.dormir();
        pacoca.cantar();        
    }
}
