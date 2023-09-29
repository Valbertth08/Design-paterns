package Prototype;

public class Main {

    public static void main(String[] args) {
        Documento documentoPdf = new DocumentoPdf("PFD","NÃO POSSO MOTIFICAR");
        System.out.println("-------ORIGINAL PDF-------");
        System.out.println(documentoPdf);
        Documento documentoPdf1=  documentoPdf.clonar();
        System.out.println();
        System.out.println("-------CLONADO PDF------");
        System.out.println(documentoPdf1);
        System.out.println();

        Documento documentoWord = new DocumentoWord("WORD","POSSO MOTIFICAR","EDITÁVEL");
        System.out.println("-------ORIGINAL WORD-------");
        System.out.println(documentoWord);
        Documento documentoWord1= documentoWord.clonar();
        System.out.println();
        System.out.println("-------CLONADO WORD------");
        System.out.println(documentoWord1);
    }
}
