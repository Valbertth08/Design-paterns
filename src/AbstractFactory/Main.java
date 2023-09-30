package AbstractFactory;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha o Sistema operacional que deseja Executar a interface: \n1.Windows\n2.Linux.\n3.MacOS.");
        int opcaoSo= sc.nextInt();
        System.out.println();
        System.out.println("Informe o estilo de tela: \n1.Moderno.\n2.Minimalista.\n3.Classico.");
        int opcaoEstiloDesign= sc.nextInt();

        InterfaceGrafica interfaceGrafica = new InterfaceGrafica(FactorySO.criarSO(opcaoSo),FactoryDesign.criarDesign(opcaoEstiloDesign));

        interfaceGrafica.setBotão("Classico");
        interfaceGrafica.setJanela("Moderna");
        interfaceGrafica.setTexto("Com serif");
        System.out.println(interfaceGrafica);

    }
}
