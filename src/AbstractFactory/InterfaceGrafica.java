package AbstractFactory;

public class InterfaceGrafica {

    private SistemaOP sistemaOP;
    private  EstiloDesign estiloDesign;

    //OBS: todas essa variaveis poderiam ser representada também por uma fabrica(botão, janela,texto etc..)
    private String Botão;

    private String janela;
    private String Texto;
    public InterfaceGrafica(SistemaOP sistemaOP, EstiloDesign estiloDesign) {
        this.sistemaOP = sistemaOP;
        this.estiloDesign = estiloDesign;
    }
    public void setSistemaOP(SistemaOP sistemaOP) {
        this.sistemaOP = sistemaOP;
    }

    public void setEstiloDesign(EstiloDesign estiloDesign) {
        this.estiloDesign = estiloDesign;
    }

    public void setBotão(String botão) {
        Botão = botão;
    }

    public void setJanela(String janela) {
        this.janela = janela;
    }

    public void setTexto(String texto) {
        Texto = texto;
    }

    @Override
    public String toString() {
        return "InterfaceGrafica: " +
                "sistemaOP=" + sistemaOP.mostrarSO() +
                ", estiloDesign=" + estiloDesign.meuDesign() +
                ", Botão='" + Botão + '\'' +
                ", janela='" + janela + '\'' +
                ", Texto='" + Texto + '\'' +
                '}';
    }
}
