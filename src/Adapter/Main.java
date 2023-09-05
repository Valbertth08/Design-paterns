package Adapter;

public class Main {

    public static void main(String[] args) {
        MySql mySql= new AdapterPostgreSql();
        mySql.conexao();
    }
}
