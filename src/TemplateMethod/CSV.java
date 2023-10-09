package TemplateMethod;

public class CSV extends Document{
    public CSV( Integer tamanho) {
        super(tamanho);
    }

    @Override
    public void MostrarDocumento() {
        System.out.println("TIPO: CSV "+"\nTAMANHO: "+getTamanho()+"mb\n");
    }
}
