package Builder;

public class pizzaBuilder  implements  Builder{
    private  Pizza pizza = new Pizza();
    @Override
    public void setMassa(String massa) {
        pizza.setMassa(massa);
    }
    @Override
    public void setIngredientes(String ingredientes) {

        pizza.setIngredientes(ingredientes);
    }
    @Override
    public void setBorda(String borda) {

        pizza.setBorda(borda);
    }

    @Override
    public void seRecheioDaBorda(String recheio) {
        pizza.setRecheioBorda(recheio);
    }
    @Override
    public Pizza getPizza(){
        Pizza pizza= this.pizza;
        return  pizza;
    }

}
