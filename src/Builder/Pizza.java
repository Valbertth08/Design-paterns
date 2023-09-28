package Builder;

public class Pizza {

    private String massa;
    private  String ingredientes;
    private String borda;
    private String recheioBorda;

    public void setMassa(String massa) {
        this.massa = massa;
    }
    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void setBorda(String borda) {
        this.borda = borda;
    }

    public void setRecheioBorda(String recheioBorda) {
        this.recheioBorda = recheioBorda;
    }


    @Override
    public String toString() {
        return "Pizza{" +
                "massa='" + massa + '\'' +
                ", ingredientes='" + ingredientes + '\'' +
                ", borda='" + borda + '\'' +
                ", recheioBorda='" + recheioBorda + '\'' +
                '}';
    }
}
