package Facade;

import java.awt.desktop.SystemEventListener;

public class Pedido {

    private String nomeCliente;
    private Integer codigo;
    private Double valor;

    public Pedido(String nomeCliente, Integer codigo, Double valor) {
        this.nomeCliente = nomeCliente;
        this.codigo = codigo;
        this.valor = valor;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public Integer getCodigo() {
        return codigo;
    }
    public Double getValor() {
        return valor;
    }
    public  void RegistrarPedido(Pedido p){
        System.out.println("---------------------------------------------------------------");
        System.out.println("PEDIDO REGISTRADO:\nCodigo: "+p.getCodigo()+"\nNome: "+p.getNomeCliente());
    }
}
