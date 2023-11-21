package Decorator;

public class CafeDecorator2 extends CafeDecorator{
    public CafeDecorator2(CafeBasico cafe) {
        super(cafe);
    }

    @Override
    public void exibirIgredientes() {
        StringBuilder builder= new StringBuilder();
        builder.append(cafeCappuccino());
        this.getCafe().exibirIgredientes();
        System.out.println(builder);

    }
    public String cafeCappuccino(){
        System.out.println("------------------------------------");
        return "NOME: Café Cappuccino\nIngredientes:\n1.Café\n2.Creme de Leite\n3.Canela";
    }
}
