package Interpreter;

public class Expressao implements Funcao {

        private int valor;

        public Expressao(int valor)
        {
            this.valor = valor;
        }
        @Override
        public int interpretar() {
            return valor;
        }
}

