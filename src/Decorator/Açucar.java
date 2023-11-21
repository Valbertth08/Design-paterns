package Decorator;

public class Açucar extends CafeDecorator{
    public Açucar(CafeBasico cafe) {
        super(cafe);
    }

    @Override
    public void exibirIgredientes() {
        StringBuilder builder= new StringBuilder();
        builder.append(addAçucar());
        this.getCafe().exibirIgredientes();
        System.out.println(builder);

    }
    public String addAçucar(){
        return "-Açucar";
    }
}
