package TemplateMethod;

public class Word extends Document{
    public Word(Integer tamanho) {
        super(tamanho);
    }

    @Override
    public void MostrarDocumento() {
        System.out.println("NOME: WORD"+"\nTAMANHO: "+getTamanho()+"mb\n");
    }
}
