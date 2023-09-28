package Builder;

public class Diretor {
    private  pizzaBuilder pizzaBuilder;

    public static  void criarPizzaFrangoCatupiry(Builder builder){
        builder.setMassa("siciliana");
        builder.setIngredientes("Frango,oregano,tomate,azeitona");
        builder.setBorda("corda");
        builder.seRecheioDaBorda("catupiry");

    }
    public static void criarPizzaCalabresa(Builder builder){
        builder.setMassa("siciliana");
        builder.setIngredientes("calabresa,cebola,tomate,queijo");
        builder.setBorda("estrela");
        builder.seRecheioDaBorda("catupiry");

    }
    public static void criarPizzaHotdDog(Builder builder){
        builder.setMassa("siciliana");
        builder.setIngredientes("salsicha,ervilha e milho,batata palha, carne moida");

    }
}
