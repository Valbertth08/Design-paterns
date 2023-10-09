package TemplateMethod;

public class Pdf extends Document{


    public Pdf(Integer tamanho) {
        super( tamanho);
    }

    @Override
    public void MostrarDocumento() {
        System.out.println("TIPO: PDF"+"\nTAMANHO: "+getTamanho()+"mb\n");
    }
}
