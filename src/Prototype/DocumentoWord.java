package Prototype;

public class DocumentoWord extends  Documento{
    private String caracteristica;

    public DocumentoWord(String type, String layout, String caracteristica) {
        super(type, layout);
        this.caracteristica = caracteristica;
    }
    @Override
    public Documento clonar() {
        return new DocumentoWord(type,layout,caracteristica);
    }

    @Override
    public String toString() {
        return "DocumentoWord{" +
                "caracteristica='" + caracteristica + '\'' +
                ", type='" + type + '\'' +
                ", layout='" + layout + '\'' +
                '}';
    }
}
