package Adapter;

public class AdapterPostgreSql extends  MySql {
    private  PostgreSql postgreSql;
    @Override
    public  void conexao() {
        this.postgreSql.conexao();
    }
}
