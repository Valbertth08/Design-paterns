package Decorator;

public class CremeDeLeite extends CafeDecorator{
    public CremeDeLeite(CafeBasico cafe) {
        super(cafe);
    }

    @Override
    public void exibirIgredientes() {
        StringBuilder builder= new StringBuilder();
        builder.append(addCremeDeLeite());
        this.getCafe().exibirIgredientes();
        System.out.println(builder);

    }

    public String addCremeDeLeite(){
        return "-Creme de Leite";
    }
}
