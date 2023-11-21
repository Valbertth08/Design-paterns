package Decorator;

public class Leite extends CafeDecorator{

    public Leite(CafeBasico cafe) {
        super(cafe);
    }

    @Override
    public void exibirIgredientes() {
        StringBuilder builder= new StringBuilder();
        builder.append(addLeite());
        this.getCafe().exibirIgredientes();
        System.out.println(builder);

    }
    public String addLeite(){
        return "-Leite";
    }

}
