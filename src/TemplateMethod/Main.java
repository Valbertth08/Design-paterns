package TemplateMethod;

public class Main {
    public static void main(String[] args) {
        ExecuteDocument.execute(new CSV(123));
        ExecuteDocument.execute(new Pdf(100));
        ExecuteDocument.execute(new Word(20));
    }
}
