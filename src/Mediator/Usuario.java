package Mediator;


public class Usuario {

    private  String name;
    private  Long numero;

    private Mediator mediator;

    public Usuario(String name, Long numero, Mediator mediator) {
        this.name = name;
        this.numero = numero;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }


    public  void receberPreco(String mensagem){
        System.out.println(mensagem);
    }

}
