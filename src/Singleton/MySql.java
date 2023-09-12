package Singleton;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class MySql {

    private static MySql conect;

    private  MySql(){

    }
    public  static MySql getConexao(){
        if(MySql.conect == null){
            System.out.println("Criando uma instancia");
            System.out.println();
            MySql.conect= new MySql();
        }
        return MySql.conect;
    }

}
