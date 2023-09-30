package FactoryMethod;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        fabricaCarro fabrica = new fabricaCarro();
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe  o numero do carro para criação: \n1.CARRO ESPORTIVO\n2.CARRO POPULAR");
        int opcao = sc.nextInt();
        intefaceCarro carro =fabrica.criarCarro(opcao);
        carro.mostrarCarro();




    }
}
