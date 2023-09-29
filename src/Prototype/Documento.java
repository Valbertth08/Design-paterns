package Prototype;

 abstract class Documento {

    protected String type;
    protected String layout;

     public Documento(String type, String layout) {
         this.type = type;
         this.layout = layout;
     }

     public abstract  Documento clonar();
}
