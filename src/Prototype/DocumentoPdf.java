package Prototype;

public class DocumentoPdf extends Documento{

    public DocumentoPdf(String type, String layout) {

        super(type, layout);
    }

    @Override public Documento clonar() {

        return new DocumentoPdf(type,layout);
    }

    @Override
    public String toString() {
        return "DocumentoPdf{" +
                "type='" + type + '\'' +
                ", layout='" + layout + '\'' +
                '}';
    }
}
