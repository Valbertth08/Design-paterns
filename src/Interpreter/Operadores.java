package Interpreter;

public class Operadores {

    public static Funcao  Executar(){

        Funcao operandor1 = new Expressao(2);
        Funcao operandor2 = new Expressao(3);


        Funcao adicao= new Operacao(operandor1,operandor2,'+');


        return adicao;
    }

}
