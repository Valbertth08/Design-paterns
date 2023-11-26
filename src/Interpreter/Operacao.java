package Interpreter;

public class Operacao  implements  Funcao{
    private Funcao direita;
    private Funcao esquerda;
    private char operador;

    public Operacao(Funcao direita,Funcao esquerda ,char operador) {
        this.esquerda = esquerda;
        this.direita = direita;
        this.operador = operador;
    }
    @Override
    public int interpretar() {
        switch (operador) {
            case '+':
                return esquerda.interpretar() + direita.interpretar();
            case '-':
                return esquerda.interpretar() - direita.interpretar();
            case '*':
                return esquerda.interpretar() * direita.interpretar();
            case '/':
                return esquerda.interpretar() / direita.interpretar();
            default:
                throw new IllegalArgumentException("Erro de entrada: " + operador);
        }
    }
}
