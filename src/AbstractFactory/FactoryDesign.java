package AbstractFactory;

public class FactoryDesign  {
    public static EstiloDesign criarDesign(int opcao){
        if( opcao ==3){
            return  new DesignClassico();
        }
       else if(opcao == 1){
            return  new DesignModerno();
        } else if (opcao ==2) {
            return  new DesignMinimalista();
        }
        return null;
    }

}
