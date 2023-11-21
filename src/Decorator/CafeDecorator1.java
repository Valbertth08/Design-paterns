package Decorator;

public class CafeDecorator1 extends CafeDecorator{

    public CafeDecorator1(CafeBasico cafe) {
        super(cafe);
    }

    @Override
    public void exibirIgredientes() {
        StringBuilder builder= new StringBuilder();
        builder.append(cafeBrasileiro());
        this.getCafe().exibirIgredientes();
        System.out.println(builder);

    }
    public String cafeBrasileiro(){
        System.out.println("------------------------------------");
        return "NOME: Café Brasileiro\nIngredientes:\n1.Leite\n2.Açucar";
    }

}
