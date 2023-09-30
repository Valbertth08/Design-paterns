package FactoryMethod;

public class fabricaCarro {

    public  intefaceCarro criarCarro ( int opcao){
        if (opcao ==1){
            return new carroEsportivo();
        }
        else if(opcao ==2){
            return  new carroPopular();
        }
        return  null;
    }
}
