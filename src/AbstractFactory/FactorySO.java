package AbstractFactory;

public class FactorySO {



    public static SistemaOP criarSO(int opcao){

        if(opcao  == 2){
            return new Linux();
        }
        else if(opcao == 1){
            return new Windows();
        }
        else if(opcao == 3){
            return new MacOS();
        }
        return null;
    }
}
