package Singleton;

public class Execute {
    public static void main(String[] args) {
        MySql mySql1= MySql.getConexao();
        MySql mySql2= MySql.getConexao();
        //estar sendo criada somente uma instancia de conexão e atribuindo a variavel (mysql1), porque se tivesse sendo criado outra instancia
        //teria sido exibida novamente a mensagem de criação de uma nova conexão. Então nesse caso só foi retornado o valor para a variavel mysql2.
        if(mySql1 != null && mySql2 != null){
            System.out.println("Existe conexão nas duas variaveis");
        }
    }

}
