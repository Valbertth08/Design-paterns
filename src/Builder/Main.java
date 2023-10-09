package Builder;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class Main {
    public static void main(String[] args) {

        System.out.println("------- SEM CLASSE DIRETOR-----------");
        Builder builder = new pizzaBuilder();
        builder.setBorda("Catupiri");
        builder.setIngredientes("Tomate, cebola, frango");
        builder.setMassa("Siciliana");
        Pizza pizza = builder.getPizza();
        System.out.println(pizza);

        System.out.println("------- COM CLASSE DIRETOR-----------");

        Builder builder1 = new pizzaBuilder();
        Diretor.criarPizzaFrangoCatupiry(builder1); ;
      System.out.println(builder1.getPizza());

      Builder builder2 = new pizzaBuilder();
      Diretor.criarPizzaCalabresa(builder2); ;
      System.out.println(builder2.getPizza());

      Builder builder3 = new pizzaBuilder();
      Diretor.criarPizzaHotdDog(builder3); ;
      System.out.println(builder3.getPizza());




    }
}
