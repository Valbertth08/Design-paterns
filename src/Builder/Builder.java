package Builder;

public interface Builder {
    public void setMassa(String massa);
    public void setIngredientes(String ingredientes);

    public void setBorda(String borda);

    public void seRecheioDaBorda(String recheio);
    public Pizza getPizza();

}
