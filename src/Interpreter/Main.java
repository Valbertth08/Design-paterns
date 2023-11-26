package Interpreter;

public class Main {
    public static void main(String[] args) {

        Funcao expressao = Operadores.Executar();
        int valor = expressao.interpretar();

        System.out.println("Soma: " + valor);

    }

}
